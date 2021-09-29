package ch04;

public class RandomExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6); // 뒤에 ()가 있으면 메소드

        //0.0~0.99999999999999999999 절대 1은 안 나온다
        //5.4...
        //0~5
        System.out.println("num : " + num);

        // 2~7
        int num2 = (int)(Math.random() * 6 + 2);
        System.out.println(num2);

        // 55~108
        int num3 = (int)(Math.random() * 54 + 55);
        System.out.println(num3);
    }
}
