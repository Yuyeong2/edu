package ch07;
//부모 클래스
public class CellPhone extends Object {
    String model;
    String color;

    public CellPhone() {
        this("노트10", "dddd");
    }

    public CellPhone(String model, String color) {
        super();
        this.model = model;
        this.color = color;
    }

    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    void printInfo() {
        System.out.printf("model : %s, color : %s", model, color);
    }

    void sendMsg(String msg) {
        System.out.println("보낸 메시지 : " + msg);
    }
}
