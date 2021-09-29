package ch03;

public class OperatorExample3 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        int n3 = 20;
        int n4 = 20;

        boolean result1 = n1 >= n2; //true
        boolean result2 = n3 > n4; //false

        System.out.println(result1 && result2); //and 연산자, 전부 true 여야 true, 하나라도 false 면 false
        System.out.println(result1 || result2); //or 연산자, 전부 false 여야 false, 하나라도 true 면 true

        System.out.println(true && true && false && true && true); //false, false 가 나올 확률이 높은 것을 앞에 배치
        System.out.println(n1 >= n2 || n3 > n4 || n1 > n4); //true, true 가 나올 확률이 높은 것을 앞에 배치

    }
}
