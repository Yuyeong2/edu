package ch07;

public class AnimalTest {
    /*
    *다형성* (여러가지 형태가 있는 성질)

    1. 부모타입은 자식개체 주소값 저장할 수 있다.(가리킬 수 있다, 참조할 수 있다.)
    2. 자식타입은 부모객체 주소값 저장할 수 없다.(가리킬 수 없다, 참조할 수 없다.) 바로 컴파일 에러 발생.
    3. 메소드 호출은 타입이 알고 있는 것만 호출할 수 있고, 내용은 객체 기준이다.
    *
     */
    public static void main(String[] args) {
        BigCat bigcat = new BigCat();
        Cat cat = new BigCat();
        Animal animal = new BigCat();
        Animal animal2 = new Cat();

        Object obj = new Object();//전부 다 된다.

        // BigCat bc = new Cat();
        // Cat cat2 = new Animal();  안된다

        Cat cat2 =  new BigCat();
        cat2.crying();
        //cat2.sleep();

        BigCat bigCat1 = (BigCat)cat2;
        bigCat1.sleep();
    }
}
