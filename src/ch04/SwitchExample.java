package ch04;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6) +1; //num = 1~6

        switch(num) {   //정수, 문자열만 가능
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default:    //위치는 상관없음, if 문의 else 같은 존재
                System.out.println("6번이 나왔습니다.");
        }
    }
}
