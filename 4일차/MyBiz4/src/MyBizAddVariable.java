public class MyBizAddVariable {
    public static void ln(){ System.out.println(); }


    public static void main(String[] args) {
        // etc code...
        AccountAddPrint a1 = new AccountAddPrint();
        a1.ValueOfSupply = 20000;
        ln();

        AccountAddPrint a2 = new AccountAddPrint();
        a2.ValueOfSupply = 80000;
        // etc code...

        System.out.println("공급가액 a1 : " + a1.ValueOfSupply);
        System.out.println("공급가액 a2 : " + a2.ValueOfSupply);

        System.out.println("부가세 a1 : " + a1.getVAT());
        System.out.println("부가세 a2 : " + a2.getVAT());

        ln();
        a1.print();

        ln();
        a2.print();
    }
}