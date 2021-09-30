package ch04;

import java.util.Scanner;

public class WhileBreakTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, val = 0;

        while(true) {
            System.out.print("숫자를 입력하세요 (정지 : 0) : ");
            val = scan.nextInt();
            if(val == 0) { break; }
            sum += val;
        }
            System.out.println("더한 값 : " +sum);
    }
}
