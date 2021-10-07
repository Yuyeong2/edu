package ch06;

public class CarTest {
    public static void main(String[] args) {
        String car2 = new String("");
        Car car = new Car();
        car.brand = "현대";
        car.nm = "소나타";
        car.drive();
        car.stop();
        System.out.println("car.brand : " + car.brand);

        Car car3 = new Car();
        car3.brand = "기아";
        car3.nm = "K5";
        car3.drive();
        car3.stop();

        Car car4 = new Car();
        car4.brand = car.brand;
        car4.nm = car.nm;
        car4.drive();
        car4.stop();

        System.out.println(car == car3);
        System.out.println(car == car4);
    }
}
