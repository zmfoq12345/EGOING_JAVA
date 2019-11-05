public class Account {
    public double VatRate = 0.1;
    public int ValueOfSupply = 50000;
    public double incomeRate = 0.7;

    public double getVAT(){ return ValueOfSupply * VatRate; }
    public double getINCOME(){ return ValueOfSupply * incomeRate; }
    public double getTOTAL(){ return ValueOfSupply+getVAT(); }
}

class AccountAddPrint extends Account{
    public void print(){
        System.out.println("공급가액 : "+ValueOfSupply);
        System.out.println("부가세 : "+getVAT());
        System.out.println("합계 : "+getTOTAL());
        System.out.println("순이익 : "+getINCOME());
    }
}