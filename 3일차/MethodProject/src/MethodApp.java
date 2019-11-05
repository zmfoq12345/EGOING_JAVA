public class MethodApp {
    public static void A(){
        System.out.println("A1");
        System.out.println("A2");
        System.out.println("A3");
    }
    public static void B(){
        System.out.println("B1");
        System.out.println("B2");
        System.out.println("B3");
    }
    public static void C(){
        System.out.println("C1");
        System.out.println("C2");
        System.out.println("C3");
    }
    public static String job(String name){
        String output = name+"1";
        output += name + "2";
        output += name +"3";
        return output;
    }

    public static void main(String[] args) {
        System.out.println(job("A"));
        System.out.println(job("B"));
        System.out.println(job("C"));
    }
}
