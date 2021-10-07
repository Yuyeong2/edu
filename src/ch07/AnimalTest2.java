package ch07;

public class AnimalTest2 {
    public static void main(String[] args) {
        BigCat bc = new BigCat();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        AnimalTest2.animalCrying(bc); //큰 고양이 냐~~~~옹
        AnimalTest2.animalCrying(cat); //고양이 야옹야옹
        AnimalTest2.animalCrying(dog); //강아지가 멍멍
        AnimalTest2.animalCrying(cow); //소가 음머~~~
    }

    public static void animalCrying(Animal ani) { ani.crying(); }

}
