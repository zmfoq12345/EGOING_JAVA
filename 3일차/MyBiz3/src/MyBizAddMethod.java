public class MyBizAddMethod {
    public static double VatRate = 0.1;
    public static int ValueOfSupply = 50000;
    public static double incomeRate = 0.7;

    public static double getVAT(){
        return ValueOfSupply * VatRate;
    }

    public static double getINCOME(){
        return ValueOfSupply * incomeRate;
    }

    public static double Total(){
        return ValueOfSupply+getVAT();
    }

    public  static void Accounting(){
        System.out.println("공급가액 : " + ValueOfSupply);
        System.out.println("부가가치세: "+ getVAT());
        System.out.println("합계: "+ Total());
        System.out.println("순이익: "+ getINCOME());

        System.out.println("A: "+(getINCOME() * 0.5));
        System.out.println("B: "+(getINCOME() * 0.3));
        System.out.println("C: "+(getINCOME() * 0.2));
    }
    public static void main(String[] args) {
        // etc code...
        Accounting();
        // etc code...
    }
}