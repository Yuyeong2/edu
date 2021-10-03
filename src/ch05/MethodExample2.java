package ch05;

public class MethodExample2 {
    public static void main(String[] args) {
        //input o, output o (비 void 형)
        int result = sum(200, 200);
        System.out.println("sum : " + result);
    }

    public static int sum(int n1, int n2) {
        return n1 +n2;
    }
}
