public class Reader {
    private String name, department, dateBirth, nameBook;
    private int[] numberTicket, phone;
    private int numbBook;

    //методы без параметров
    public void takeBook() {
    }

    public void returnBook() {
    }

    //перегруженный метод takeBook()
    public void takeBook(int numbBook) {
        this.numbBook = numbBook;
        if (numbBook == 1) {
            System.out.println("Петров В.В. взял " + numbBook + " книгу");
        } else if (numbBook == 2 || numbBook == 3 || numbBook == 4) {
            System.out.println("Петров В.В. взял " + numbBook + " книги");
        } else {
            System.out.println("Петров В.В. взял " + numbBook + " книг");
        }
    }

    public void takeBook(String... nameBook) {
        System.out.print("Петров В.В. взял книги: ");
        for (String i : nameBook)
            System.out.print(i + ",");
    }
//метод с переменным количеством объектов класса Book
    public void takeBook(Book... p) {

        for (Book i : p) {
            System.out.println("\n" + "Петров В.В. взял книгу: " + i.getnameofAuthor() + "." + i.getNameofBook());
        }

    }
    //


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int[] getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(int[] numberTicket) {
        this.numberTicket = numberTicket;
    }

    public int[] getPhone() {
        return phone;
    }

    public void setPhone(int[] phone) {
        this.phone = phone;
    }

    public int getNumbBook() {
        return numbBook;
    }

    public void setNumbBook(int numbBook) {
        this.numbBook = numbBook;
    }
}
