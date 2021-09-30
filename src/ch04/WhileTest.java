package ch04;

import java.util.Scanner;

public class WhileTest {
    /*
        숫자를 입력하세요 (정지 : 0) : 14
        숫자를 입력하세요 (정지 : 0) : 10
        숫자를 입력하세요 (정지 : 0) : 0
        더한 수 : 24
     */
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("숫자를 입력하세요 : ");
//        int num = scan.nextInt();
//        while(num != 0){
//            int sum = num + num;
//            System.out.println("더한 수 : " + sum);

//        }

        Scanner scan = new Scanner(System.in);
        int sum = 0, val = 0;

        System.out.print("숫자를 입력하세요 (정지 : 0) : ");
        val = scan.nextInt();
        while(val != 0){
            sum = sum +val;
            System.out.print("숫자를 입력하세요 (정지 : 0) : ");
            val = scan.nextInt();
        }
        System.out.println("더한 값 : " +sum);
    }
}
