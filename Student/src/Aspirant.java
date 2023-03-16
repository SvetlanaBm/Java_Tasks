public class Aspirant extends Student {
    //метод для подсчета стипендии
@Override
public int getScholarship(double averageMark) {
    super.getAverageMark();
    int Scholarship;
    if (averageMark==5) {
        Scholarship = 2500;
    }
    else {
        Scholarship = 2200;
    }
    return Scholarship;
}
}
