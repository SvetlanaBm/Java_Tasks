import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
import java.lang.System;
public class Main {
    public static void main(String[] args) {
        //создание объекта класса Phone
        Phone sony = new Phone(5.5f, "A10", new byte[]{8, 9, 1, 1, 1, 7, 8, 2, 8, 0, 5});
        String res = sony.getNumber();
        System.out.println(res);
        //вызов перегруженного метода
        sony.receiveCall("Света");
        sony.receiveCall("Леша",new byte[] {8,9,2,4,5,2,7,3,5,8,4,5});
        //вызов метода с аргументами переменной длинны
        sony.sendMessage(8, 9, 4,2,5,6,3,8);
        sony.sendMessage(8, 9, 4,2,5,6,3,8,6,7,3);
    }
}