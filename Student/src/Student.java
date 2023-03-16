public class Student {
    private String firstName, lastName, group;
    private double averageMark;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }
//метод для подсчета стипендии
    public int getScholarship(double averageMark) {
        this.averageMark = averageMark;
        int Scholarship;
        if (averageMark==5) {
            Scholarship = 2000;
                    }
        else {
            Scholarship = 1900;
        }
       return Scholarship;
    }
}
