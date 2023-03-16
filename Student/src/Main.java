public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        Aspirant aspirant = new Aspirant();
        //создание массива объектов
        Student[] students = {student, aspirant};
        //вызов метода для каждого элемента массива
        System.out.println(students[1].getScholarship(5));
        System.out.println(students[0].getScholarship(5));

    }
}