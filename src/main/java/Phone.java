public class Phone {
    private String number;
    private String model;
    private double weight;
//конструктор в класс Phone, который принимает на вход три
//параметра для инициализации
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void info(){
        System.out.println("номер телефона: " + number + " модель телефона: " + model + " вес: " + weight);
}
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
}
    public void getNumber(){
        System.out.println(number);
}

//конструктор, который принимает на вход два параметра для
//инициализации переменных класса - number, model
public Phone(String number, String model){
        this.number=number;
        this.model=model;
}
//конструктор без параметров
    public Phone (){
    }
//перегруженный метод receiveCall
    public void receiveCall(String nameCaller, String numberCaller){
        System.out.println("Звонит: " + nameCaller + " " + numberCaller);
    }
 //метод sendMessage с аргументами переменной длины. Данный
    // метод принимает на вход номера телефонов, которым будет отправлено
    //сообщение
    //phoneNumber sama Java predlozila
    public void sendMessage(String ... phoneNumbers){
        System.out.println("отправить сообщение ");
        for (String phoneNumber : phoneNumbers);
        System.out.println(phoneNumbers);
    }
}
