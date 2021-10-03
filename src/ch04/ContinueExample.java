package ch04;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i=0; i<100; i++){

            if(i == 50 || i == 55){
                continue; //skip(once), break 처럼 레이블 사용가능
            }
            System.out.println(i);
        }
    }
}
