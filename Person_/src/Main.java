public class Main {
    public static void main(String[] args) {
        //создание объектов класса Person
        Person person1 = new Person();
        Person person2 = new Person("Гриша", 44);
        //вызов статичного метода
        Person.move("Рита");
        //вызов метода через объект
        person1.talk("Никита");

    }
}