package ch01;

public class VariableExample2 {
    public static void main(String[] args) {
        float f;
        double d;

        int n1;

        //n1 = 10.1; //안돼요

        f = (float)10.1;
        d = 10.1;
        double d2 = f * f;
        double d3 = (double)f * f; //앞 f가 double 타입이기 때문에 뒤 f가 double 타입으로 자동 변환
        //double d2 = (double)(f * f); //자동 형변환

        //float f2 = d * d; //자동 형변환이 안된다
        float f2 = (float)(d * d); //수동형변환을 해줘야 한다.
        float f3 = (float)d * (float)d; //윗 줄과 같은 뜻
    }
}
