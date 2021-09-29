package ch02;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "안녕하세요"; //str1에 저장되는건 ""안의 객체의 주소값

        System.out.println(str1);
        System.out.println(str1 + " 그래요~" + str1);

        str1 = str1+ "13";
        System.out.println(str1);

        String str2 = 10 + 10 + "10"; // = 20 + "10";, "10" + 10 + 10 => 101010
        System.out.println(str2);

    }
}
