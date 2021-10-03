package ch05;

import java.util.Scanner;

public class ArrayTest2 {
    /*
    코드를 분리해서 사용하는 습관 들이기
    숫자 3개를 입력해 주세요.
    숫자1 :
    숫자2 :
    숫자3 :

    합계 :
    평균 :
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 개의 숫자를 사용하시겠습니까? : ");
        int LEN = scan.nextInt();
        int[] numberArr = new int[LEN];

        System.out.printf("숫자 %d개를 입력해 주세요.\n", numberArr.length);
        for(int i=0; i<numberArr.length; i++) {
            System.out.printf("숫자%d : ", i+1);
            numberArr[i] = scan.nextInt();
        }

        int sum = 0;
        for(int i=0; i<numberArr.length; i++) {
            sum += numberArr[i];
        }
            System.out.println("합계 : " + sum);
            System.out.println("평균 : " + (float)sum / numberArr.length);
    }
}
