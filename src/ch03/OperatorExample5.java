package ch03;

public class OperatorExample5 {
    public static void main(String[] args) {
        //삼항식

        int n1 = 10;
        int n2 = 11;
        String result = n1> n2 ? "n1이 n2랑 같거나 크다" : "n2가 n1보다 크다";
        System.out.println(result);


        System.out.println(n1 >= n2 ? "n1이 n2랑 같거나 크다" : "n2가 n1보다 크다"); //결과값은 문자열
                        //     1항       /     2항           /       3항
                        //(true or false)/true 일 때(위치 고정)/    false 일 때

        //mod (나머지) - 홀수 짝수 구할 때 씀
        System.out.println(10 % 2);
        System.out.println(11 % 2);
        System.out.println(12 % 2);
        System.out.println(13 % 2);

        String str1 = Integer.toString(n2);
        String str2 = String.valueOf(n2);

    }
}
