package ch04;

public class IfelseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if(score >= 90) {                       //if 그룹 무조건 하나는 실행됨.
            System.out.println("A 등급");
        } else if (score >= 80) {
            System.out.println("B 등급");
        } else if (score >= 70) {
            System.out.println("C 등급");
        } else {
            System.out.println("D 등급");
        }
    }
}
