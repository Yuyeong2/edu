package ch06;

public class PrivateClassTest {
    public static void main(String[] args) {
        PrivateClass pc = new PrivateClass();
        //pc.val = 10; //private 접근 불가능
        pc.defaultVal = 10;
    }
}
