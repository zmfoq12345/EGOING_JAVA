public class MyBiz {
    public static void main(String[] args) {
        System.out.println("공급가액 : "+50000);

        System.out.println("부가가치세: "+50000 * 0.1);

        System.out.println("합계: "+ 50000 + 50000 * 0.1);

        System.out.println("순이익: "+50000 * 0.7);

        System.out.println("A: "+((50000 * 0.7)*0.5));
        System.out.println("B: "+((50000 * 0.7)*0.3));
        System.out.println("C: "+((50000 * 0.7)*0.2));
    }
}
