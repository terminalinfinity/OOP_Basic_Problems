package Prblem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> grades = new ArrayList<>(Arrays.asList(3.5, 4.0, 3.8));
        Student student = new Student("John Doe", 20, grades);
        student.displayInfo();
    }

}
