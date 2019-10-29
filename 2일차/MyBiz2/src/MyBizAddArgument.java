import javax.swing.*;

public class MyBizAddArgument {
    static double VatRate = 0.1;
    static double incomeRate = 0.7;

    public static void Cal(int ValueOfSupply){
        System.out.println("공급가액 : " + ValueOfSupply);
        System.out.println("부가가치세: "+ ValueOfSupply * VatRate);
        System.out.println("합계: "+ (ValueOfSupply + (ValueOfSupply * VatRate)));
        System.out.println("순이익: "+ ValueOfSupply * incomeRate);

        System.out.println("A: "+(ValueOfSupply * incomeRate * 0.5));
        System.out.println("B: "+(ValueOfSupply * incomeRate * 0.3));
        System.out.println("C: "+(ValueOfSupply * incomeRate * 0.2));
    }

    public static void main(String[] args) {
//        String inputData = args[0];
//        int ValueOfSupply = Integer.parseInt(inputData); // CommandLineInterface
        int ValueOfSupply = Integer.parseInt(JOptionPane.showInputDialog("공급가액을 입력하세요"));
        Cal(ValueOfSupply);
    }
}