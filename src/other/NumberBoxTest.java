package other;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox(1);
        NumberBox nb2 = new NumberBox(2);

        System.out.println(nb1 == nb2);
        System.out.println(nb1.equals(nb2));
        System.out.println(nb1.getVal());
        System.out.println(nb2.getVal());

        System.out.println("nb1 : " + nb1);
        System.out.println(nb1.toString());
        System.out.println("nb2 : " + nb2);
        System.out.println(nb2.toString());


        String str = new String("abc");
        System.out.println(str);

        System.out.println(str.toString());
    }
}
