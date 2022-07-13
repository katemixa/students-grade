import java.util.Arrays;

public class Student {
    private String surname;
    private String name;
    private int group;
    private int rating;


    public Student(String surname, String name, int group, int rating) {
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.rating = rating;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Студент: " + "Фамилия: " + surname + ", Имя: " + name + ", Номер группы: " + group + ", Средний бал: " + rating;
    }
}
