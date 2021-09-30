package ch01;

public class VariableExample3 {
    public static void main(String[] args) {
        char c = 'B'; //잘 안 씀. 결국은 정수타입 아스키코드
        System.out.printf("%c : %d\n", c, (int)c);

        int i = 69;
        System.out.printf("%c : %d\n", (char)i, i);


        boolean bl = false;//true or false 둘 중 하나만 가능
        System.out.println(bl);

    }
}
//boolean
//byte < char < short < int < long < float < double 숫자타입
//위의 원시(프로모티브) 타입 변수들 빼고는 다 레퍼런스 타입, 다른건 대문자로 시작