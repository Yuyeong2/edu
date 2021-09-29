package ch04;

public class StringEqualsExample {
    public static void main(String[] args) {
            //문자열값 비교!, 절대! == 비교 불가!!

        String str1 = new String("안녕하세요"); //은닉화 = String str1 = "안녕하세요";
        String str2 = new String("안녕하세요"); //값은 같지만 둘의 주소값은 다르다
        System.out.println(str1 == str2); //false, 레퍼런스 타입의 비교는 주소값을 비교

        String str3 = str2;
        System.out.println(str3 == str2); //true str2 의 주소값을 복사하여 str3에 넣었기 때문에 둘의 주소값은 같다\

        System.out.println("str1.equals(str2) : " + str1.equals(str2)); //true, equals = 둘의 문자열이 같은지를 비교
        System.out.println("str2.equals(str1) : " + str2.equals(str1));
        System.out.println("str3.equals(str1) : " + str3.equals(str1));
    }
}
