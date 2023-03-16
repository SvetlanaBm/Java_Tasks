public class Person {
    private String fullName;
    private int age;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    //конструкторы класса
    public Person() {};
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    };
    // static метод для вывода сообщений
    public static void move(String fullName) {
        // this.fullName = fullName;
        System.out.println(fullName +  " говорит");
    }
    //метод для вывода сообщения
    public void talk(String fullName) {
        this.fullName = fullName;
        System.out.println(fullName +  " говорит");
    }


}
