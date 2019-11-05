class Accounting{
    public double VatRate = 0.1;
    public static int ValueOfSupply = 50000;
    public static double incomeRate = 0.7;

    public double getVAT(){ return ValueOfSupply * VatRate; }
    public double getINCOME(){ return ValueOfSupply * incomeRate; }
    public double Total(){ return ValueOfSupply+getVAT(); }
}

public class MyBizAddClass {
    public static void ln(){ System.out.println(); }
    public static void Print_Account(Accounting accunt){
        System.out.println("공급가액 : " + accunt.ValueOfSupply);
        System.out.println("부가가치세: "+ accunt.getVAT());
        System.out.println("합계: "+ accunt.Total());
        System.out.println("순이익: "+ accunt.getINCOME());
        System.out.println("A: "+(accunt.getINCOME() * 0.5));
        System.out.println("B: "+(accunt.getINCOME() * 0.3));
        System.out.println("C: "+(accunt.getINCOME() * 0.2));
    }

    public static void main(String[] args) {
        // etc code...
        Accounting a1 = new Accounting();
        a1.ValueOfSupply = 20000;
        Print_Account(a1);

        ln();

        Accounting a2 = new Accounting();
        a2.ValueOfSupply = 80000;
        Print_Account(a2);
        // etc code...
    }
}