package ch04;

public class IfTest2 {
    public static void main(String[] args) {
        int score = 87;
        char grade = 'D';
        char pm = ' ';


        if (score >= 90){
            grade = 'A';
            if(score >= 98) { pm = '+'; }
            else if(score <= 93) { pm = '-'; }
        } else if (score >= 80) {
            grade = 'B';
            if(score >= 88) { pm = '+'; }
            else if(score <= 83) { pm = '-'; }

        } else if (score >= 70) {
            grade = 'C';
            if(score >= 78) { pm = '+'; }
            else if(score <= 73) { pm = '-'; }
        }
            System.out.printf("%c%c", grade, pm);

    }
}
