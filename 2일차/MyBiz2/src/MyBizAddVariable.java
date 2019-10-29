public class MyBizAddVariable {
    public static void main(String[] args) {
        double VatRate = 0.1;
        double incomeRate = 0.7;
        int ValueOfSupply = 50000;
        System.out.println("공급가액 : " + ValueOfSupply);
        System.out.println("부가가치세: "+ ValueOfSupply * VatRate);
        System.out.println("합계: "+ ValueOfSupply + ValueOfSupply * VatRate);
        System.out.println("순이익: "+ ValueOfSupply * incomeRate);

        System.out.println("A: "+(ValueOfSupply * incomeRate * 0.5));
        System.out.println("B: "+(ValueOfSupply * incomeRate * 0.3));
        System.out.println("C: "+(ValueOfSupply * incomeRate * 0.2));
    }
}