package ch04;

public class IfElseExample {
    public static void main(String[] args){
        int score = 89;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
            //둘 중 하나는 무조건 실행됨
        }
    }
}
