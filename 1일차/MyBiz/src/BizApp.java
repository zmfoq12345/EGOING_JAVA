public class BizApp {

    public static void main(String[] args) {
        double money = 50000;
        System.out.println("공급가액 : "+money);

        double bu = money*0.1;
        System.out.println("부가가치세: "+bu);

        double sum = money+bu;
        System.out.println("합계: "+sum);

        double pure = money*0.7;
        System.out.println("순이익: "+pure);

        System.out.println("A: "+(pure*0.5));
        System.out.println("B: "+(pure*0.3));
        System.out.println("C: "+(pure*0.2));

    }

}
