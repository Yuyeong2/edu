package ch04;

public class ForTest4 {
    public static void main(String[] args) {

        //2 x 1 = 2 2 x 2 = 2 ...
        //3 x 1 = 3 3 x 2 = 6 ...
        for(int i=1; i<10; i++) {
            for (int z = 2; z < 10; z++) {
                System.out.printf("%d x %d = %d\t", z, i, (z * i));
            }
            System.out.println();
        }
    }
}
