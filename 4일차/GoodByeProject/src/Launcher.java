import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
//
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.write("<h1>My business status</h1>" + "<form action=\"/accounting/cal\">"
                + "	<input type=\"text\" placeholder=\"value of supply\" name=\"supply\">" + " <input type=\"submit\">"
                + "</form>");
        out.close();
    }
}

class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        int valueOfSupply = Integer.parseInt(req.getParameter("supply"));
        Accounting a1 = new Accounting();
        a1.valueOfSupply = valueOfSupply;
        out.write("<h1>My business status</h1>" + "<ul>" + "	<li>value of supply : " + a1.valueOfSupply + "</li>"
                + "	<li>value added tax : " + a1.getVAT() + "</li>" + "	<li>total : " + a1.getTotal() + "</li>"
                + "	<li>income : " + a1.getIncome() + "</li>" + "	<li>A : " + a1.getIncome() * 0.5 + "</li>"
                + "	<li>B : " + a1.getIncome() * 0.3 + "</li>" + "	<li>B : " + a1.getIncome() * 0.2 + "</li>"
                + "</ul>");
        out.close();
    }
}
public class Launcher {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8011);
        Context appContext = tomcat.addWebapp("/accounting", new File("").getAbsolutePath());
        Tomcat.addServlet(appContext, "index-servlet", new IndexServlet());
        Tomcat.addServlet(appContext, "cal-servlet", new CalculateServlet());
        appContext.addServletMappingDecoded("/*", "index-servlet");
        appContext.addServletMappingDecoded("/cal", "cal-servlet");
        tomcat.start();
        tomcat.getServer().await();
    }
}