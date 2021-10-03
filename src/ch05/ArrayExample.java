package ch05;

public class ArrayExample {
    public static void main(String[] args){
        //배열(array)

        /*
        같은 타입의 값을 여러개 저장할 때 좋다.
        for 문과 함께 사용하면 아주 좋다.
         */

        int[] scores = { 83, 90, 87, 100, 50 }; //int 형 배열(int 가 아님, 레퍼런스 변수), int scores[]도 가능 하지만 비추
//        scores[0] = 11; // 0부터 시작
//        System.out.println( scores[0] );

        System.out.println(scores.length);

        for(int i = 0; i<scores.length; i++) {
            System.out.println( scores[i] );
        }

    }
}
