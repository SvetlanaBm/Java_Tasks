import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число A");
        int A1 = in.nextInt();
        int A=A1;
        System.out.println("Введите число B");
        int B1 = in.nextInt();
        int B = B1;
        recursion_A(A,B);


    }

    public static void recursion_A(int A,int B){

        System.out.println(A);
        if (A<B){
             recursion_A(A+1,B);
        }
        else {
            if (A==B) {
                return;
            }
            recursion_A(A-1,B);}
       }

    }


