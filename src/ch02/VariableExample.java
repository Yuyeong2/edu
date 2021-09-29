package ch02;

public class VariableExample {
    public static void main(String[] args) {
        byte b;
        short s;
        //byte 와 short 는 잘 사용하지 않는다
        int score; // 4byte 기 때문에 속도가 가장 빠르다
        long l; //8 byte

        score = 10; //증감식 빼고는 =이 없으면 값을 바꿀 수 없다
        System.out.println(score);
        System.out.println(10);

        score = 20;
        System.out.println(score);
        System.out.println(20);

        System.out.println(score + score);
        System.out.println(score);

        score = score + score + score;
        System.out.println(score);

        short s1 = -129;
        byte b1 = (byte)s1; //양수는 오버플로우, 음수는 언더플로우
        System.out.println(b1);

        final int score2 = 10;
        //score2 = 11;
        System.out.println(score2);
        //score2 = 12; X 상수는 한번 입력된 값은 바꿀 수 없다.
    }
}
