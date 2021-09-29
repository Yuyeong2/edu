package ch03;

import java.sql.SQLOutput;

public class OperatorExample {
    public static void main (String[] args){
        int n1 = 10;
        int n2 = 10;

        int result = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
        System.out.printf("%d + %d = %d\n", n1, n2, result);
        // 10 + 3 = 13

        result = n1 + (-n2); //단항 연산자, () 해주기
        System.out.printf("%d + %d = %d\n", n1, n2, result);

        boolean result2 = n1 > n2; //비교 연산자, 값은 boolean 타입 -> %b

        System.out.printf("%d > %d = %b\n", n1, n2, result2); //초과
        System.out.printf("%d < %d = %b\n", n1, n2, n1 < n2); //미만
        System.out.println();
        System.out.printf("%d >= %d = %b\n", n1, n2, n1 >= n2); //이상
        System.out.printf("%d <= %d = %b\n", n1, n2, n1 <= n2); //이하
        System.out.println();
        System.out.printf("%d == %d = %b\n", n1, n2, n1 == n2); //같다
        System.out.printf("%d != %d = %b\n", n1, n2, n1 != n2); //!는 부정(not), 같지 않아야 true


    }
}
