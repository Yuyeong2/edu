package ch01;

public class VariableTest {
    public static void main(String[] args) {
        //1.정수는 실수값을 저장할 수 없다.
        //2.작은 타입에서 큰 타입으로는 자동형변환이 이뤄진다. (물론 수동도 된다.)
        //3.큰 타입에서 작은 타입으로는 자동형변환이 안 된다. (무조건 수동으로 해야한다.)
        int n1 = 10;
        int n2 = 3;
//        double result = n1 / n2; //n1, n2가 정수타입이기 때문에 결과값도 정수타입으로 나온다.
//        System.out.println("결과 : " + result);

//        double result = (double)n1 / n2; // = (double)n1 / (double)n2
//        System.out.println("결과2 : " + result);

        double result = (float)n1 / (float)n2;
        System.out.println("결과3 : " + result);
    }
}
