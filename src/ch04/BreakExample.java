package ch04;

public class BreakExample {
    public static void main(String[] args) {
        for (int i=0; i<100; i++){

            if(i == 50){
                break; //가장 가까운 반복문을 멈춘다.
            }
            System.out.println(i);
        }
    }
}
