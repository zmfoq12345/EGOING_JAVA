public class what {
    public  static void print(Object s){
        if (s instanceof Integer) System.out.println((int)s);
        else if (s instanceof String) System.out.println((String)s);
        else if (s instanceof Float) System.out.println((float)s);
    }
    public static void ln(){
        System.out.println();
    }

    public static void main(String[] args) {
        print(1);
        print(1.1);
        print(-1);
        ln();

        print(2 + 2);
        print(4 - 2);
        print(4 * 2);
        print(6 / 2);
        ln();

        print(Math.PI);
        print(Math.floor(5.8));
        print(Math.ceil(5.1));
        Object a = 5.1;
        if(a instanceof Float){
            System.out.println("float입니다");
            System.out.print((float)a);
        }
    }

}
