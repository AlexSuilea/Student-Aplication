package studentdatabaseapp;
import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args){

        System.out.print("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numberOfStudents  = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        for(int i=0; i < numberOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println();
        }

        for(int i=0; i < numberOfStudents; i++){
            System.out.println(students[i].toString());
        }
    }
}
