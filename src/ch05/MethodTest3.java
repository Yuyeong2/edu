package ch05;

public class MethodTest3 {
    public static void main(String[] args) {
        int rval = getRandom(30, 40); //30~40 랜덤한 값을 리턴하는 메소드를 구현

        System.out.println(rval);

        int absVal = getABS(10);
        int absVal2 = getABS(-10);
        System.out.println("absVal : " + absVal);
        System.out.println("absVal2 : " + absVal2);
    }
    public static int getRandom(int n1, int n2) {
        int result = (int)(Math.random() * (n2 - n1 + 1)) + n1;
        return result;
    }
    public static int getABS(int val) {
//        if(val < 0) {
//            return -val;
//        }
//        return val;
        return val < 0 ? -val : val;
    }
}
