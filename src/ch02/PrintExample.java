package ch02;

public class PrintExample {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("---------");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요\n");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요");
        System.out.println();

        String nm = "황장군";
        int age = 1700;
        float height = 180.8f;
        char bloodType = 'A';

        //홍길동의 키는 180.8cm, 나이는 17세, 혈액형은 A형이다.

        System.out.println(nm + "의 키는 " + height + "cm, 나이는 "
                + age + "세, 혈액형은 " + bloodType + "형이다.");

        //2020, 8, 9 > 20200809
        System.out.printf("%s의 키는 %.1fcm, 나이는 %d세, 혈액형은 %c형이다.",
                            nm,   height,      age,      bloodType);

        //%s:문자열, %f:실수값, %d:정수값, %c:문자
        //%와 f,d 사이에 기능을 넣을 수 있다.%09.2f
        //%,09d ,은 1,000 자리에 ,를 넣어준다.
    }
}
