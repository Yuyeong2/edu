package ch03;

public class OperatorExample4 {
    public static void main(String[] args) {
        int n1 = 10;
        n1++; //1씩 올려준다
        ++n1; //증감식, = 이 없어도 변수값이 변한다
        System.out.println(n1);
                n1--; //1씩 내려준다

        System.out.println(n1);
        System.out.println("-----------");

        int n2 = 40;
        System.out.println(n2++); //값을 먼저 읽고 올린다.
        System.out.println(++n2); //값을 먼저 올리고 읽는다.
        System.out.println(n2);

        System.out.println("-----------");
        int n3 = 50;
        n3 = n3 + 3; //읽고 연산한 후 다시 변수에 값을 넣는다
        n3 = n3 + 3;
        System.out.println("n3 : " + n3);

        System.out.println("-----------");
        int n4 = 50;
        n4 += 3; //축약형, 위랑 같은 의미
        n4 += 3;
        System.out.println("n4 : " + n4);

    }
}
