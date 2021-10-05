package ch07;

public class AnimalTest2 {
    public static void main(String[] args) {
        BigCat bc = new BigCat();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        AnimalTest2 at2 = new AnimalTest2();

        at2.animalCrying(bc);   //큰 고양이 냐~~~옹
        at2.animalCrying(cat);  //고양이 야옹야옹
        at2.animalCrying(dog);  //강아지가 멍멍
        at2.animalCrying(cow);  //소가 음머~
    }
        public void animalCrying(Animal ani) { ani.crying(); }

//    public static void animalCrying(BigCat bc) { bc.crying(); }
//    public static void animalCrying(Cat cat) { cat.crying(); }
//    public static void animalCrying(Dog dog) { dog.crying(); }
//    public static void animalCrying(Cow cow) { cow.crying(); }

   // public static void animalCrying(Animal ani) { ani.crying(); }

}
