public class Accounting {
    public double VatRate = 0.1;
    public int valueOfSupply = 50000;
    public double incomeRate = 0.7;

    public double getVAT(){ return valueOfSupply * VatRate; }
    public double getIncome(){ return valueOfSupply * incomeRate; }
    public double getTotal(){ return valueOfSupply+getVAT(); }
}

class AccountAddPrint extends Accounting{
    public void print(){
        System.out.println("공급가액 : "+valueOfSupply);
        System.out.println("부가세 : "+getVAT());
        System.out.println("합계 : "+getTotal());
        System.out.println("순이익 : "+getIncome());
    }
}