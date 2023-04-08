package Prblem1;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Double> grades;

    public Student(String name, int age, List<Double> grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grades: " + grades);
        System.out.println("Average grade: " + getAverageGrade());
    }
}
