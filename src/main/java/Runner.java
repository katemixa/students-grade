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
        printListOfStudents(students);
        System.out.println("Введите номер класса для вывода учащихся и общего среднего балла");
        int numbOfGroup = get.nextInt();
        printStudentsOfGroup(students, numbOfGroup);
        System.out.println("Средий бал: " + getAverageForStudentsOfGroup(students, numbOfGroup));

    }

    public static Student fillStudentInfo() {
        String surnameStudent = UtilsRandom.generateRandomTextFirstCapital();
        String nameStudent = UtilsRandom.generateRandomTextFirstCapital();
        int groupStudent = UtilsRandom.generateRandomGrade();
        int raitingStudent = UtilsRandom.generateRandomGrade();
        return new Student(surnameStudent, nameStudent, groupStudent, raitingStudent);
    }

    public static void printStudentsOfGroup(List<Student> students, int group) {
        for (Student stud : students) {
            if (stud.getGroup() == group) {
                System.out.println(stud);
            }
        }
    }

    public static double getAverageForStudentsOfGroup(List<Student> students, int group) {
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

    public static void printListOfStudents(List<Student> students) {
        for (Student stud : students) {
            System.out.println(stud);
        }
    }

}
