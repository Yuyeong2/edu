package ch04;

public class ForTest {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8) + 2; //2~9

        for(int i=1; i<=9; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
        }
        System.out.println();
        for(int i=10; i<19; i++) {
            System.out.printf("%d x %d = %d\n", dan, i-9, (dan * (i-9)));
        }
    }
}
