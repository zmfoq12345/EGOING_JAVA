public class VariableApp {
    public static void main(String[] args) {

        int a = 1; // integer 정수
        int b = 2;
        System.out.println(a+b);

        String c = "Hello";
        String d = "World";
        System.out.println(c+" "+d);

        int e = (int) 1.1;  // double 형을 int 형으로 캐스팅 / 명시적 형변환
        System.out.println(e);

        double f = 1;   // 암시적 형변환
        System.out.println(f);

    }
}
