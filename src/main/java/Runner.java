import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        System.out.println("Количество учащихся");
        int countOfStudents = get.nextInt();
        for (int i = 0; i < countOfStudents; i++) {
            students.add(i, fillStudentInfo());
        }
        printInfo(students);
        System.out.println("Введите номер класса для вывода учащихся и общего среднего балла");
        int numbOfGroup = get.nextInt();
        printStudents(students, numbOfGroup);
        System.out.println("Средий бал: " +getAverage(students, numbOfGroup));

    }

    public static Student fillStudentInfo() {
        String surnameStudent = UtilsRandom.fillRandomText();
        String nameStudent = UtilsRandom.fillRandomText();
        int groupStudent = UtilsRandom.fillRandomNumber();
        int raitingStudent = UtilsRandom.fillRandomNumber();
        return new Student(surnameStudent, nameStudent, groupStudent, raitingStudent);
    }

    public static void printStudents(List<Student> students, int group) {
        for (Student stud : students) {
            if (stud.getGroup() == group) {
                System.out.println(stud);
            }
        }
    }

    public static double getAverage(List<Student> students, int group) {
        double sum = 0;
        int count = 0;
        for (Student stud : students) {
            if (stud.getGroup() == group) {
                sum += stud.getRating();
                count++;
            }
        }
        return sum / count;
    }

    public static void printInfo(List<Student> students) {
        for (Student stud : students) {
            System.out.println(stud);
        }
    }

}
