import java.util.Arrays;

public class Phone {

    private float weight;
    private byte[] number;
    private String model, name;

    //конструктор класса Phone с тремя параметрами
    public Phone(float weight, String model, byte[] number){
        this.model = model;
        this.weight = weight;
        this.number = number;
        Phone fly = new Phone(new byte[]{8,9,2,4,6,3,7,9},"N4");
}
    //конструктор класса Phone с двумя параметрами
    public Phone(byte[] number, String model){
        this.number = number;
        this.model = model;
}
    //конструктор класса Phone без параметров
    public Phone(){}

    //задание значений полей
    public void setValues(float weight, String model, byte[] number){
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    //получение номера телефона
    public String getNumber(){
       // String info = "Модель телефона: " + this.model +"\n" + "Вес: " + this.weight + "\n";
        String infoNumb = "Номер телефона: ";
        for (int i=0; i<number.length;i++) {
            infoNumb += number[i];
    }
        return  infoNumb;
}
//перегруженый метод receiveCall()
    public void receiveCall(String name){
        this.name = name;
        System.out.println("Звонит: " + name);

}

    public void receiveCall(String name, byte[] number ){
        this.name = name;
        this.number = number;
        String infoNumb = "Номер телефона: ";
        for(int i=0; i<number.length;i++) {
            infoNumb += number[i];
    }
        System.out.println("Звонит: " + name + "\n" + infoNumb);
}
//метод с аргументами переменной длинны, выводит на консоль номер телефона
    public void sendMessage(int...arg){
        String infoNumb = "Номер телефона: ";
        for(int i : arg){
           infoNumb += i;
    }
        System.out.println(infoNumb);
}
}
