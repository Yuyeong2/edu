package ch05;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] arr = new int[10]; // 방만 만들면 기본적으로 0이 설정된다.

        //0: 100
        //1: 200
        //2: 300
        //3: 400
        //4: 500

        for(int i=0; i<arr.length; i++) {
            arr[i] = (i+1)*100; }

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
