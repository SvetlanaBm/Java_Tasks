public class Main {
    public static void main(String[] args) {

        Reader reader = new Reader();
        //вызов перегруженого метода
        reader.takeBook(3);
        reader.takeBook("Энциклопедия" ,"Словарь", "Теремок" );
        //создание объектов класса Book
        Book p1 = new Book();
        Book p2 = new Book();
        //создание массива объектов класса Reader
        Reader[] massiveObj = new Reader[7];
        p1.setNameofBook("1984");
        p1.setNameofAuthor("Дж.Оурел");

        p2.setNameofBook("Грозовой перевал");
        p2.setNameofAuthor("Эмили Бронте");
        reader.takeBook(p1,p2);




    }
}