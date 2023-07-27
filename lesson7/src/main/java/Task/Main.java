package Task;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123456", "iphone", 155);
        Phone phone2 = new Phone("654321", "xiaomi", 170);
        Phone phone3 = new Phone("789012", "samsung", 130);
//Вызвать из конструктора с тремя параметрами конструктор с двумя.
        Phone phone4 = new Phone("55667788", "motorola");
        phone1.info();
        phone2.info();
        phone3.info();
        phone1.receiveCall("Max");
        phone2.receiveCall("Robert");
        phone3.receiveCall("Jura");
        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();
        phone1.receiveCall("Max", "123456");
        phone2.receiveCall("Robert", "654321");
        phone3.receiveCall("Jura", "789012");
        phone1.sendMessage("800-800-800", "900-900-900");
        phone2.sendMessage("100-100-100", "900-900-900");
        phone3.sendMessage("700-700-700");
    }
}

