package ru.mirea.Panferov.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    static public void main(String[] args){
        ArrayList<Student> mas = new ArrayList<>();
        mas.add(new Student("Панферов", 3, 4, 5, 4, 4));
        mas.add(new Student("Торяник", 1, 3, 5, 3, 5));
        mas.add(new Student("Бустеренко", 5, 5, 5, 5, 3));
        mas = sortAvg(mas);
        System.out.println(mas);
        System.out.println(findStd(mas, "Панферов"));
    }

    static public ArrayList<Student> sortAvg(ArrayList<Student> mas){
        return (ArrayList<Student>) mas.stream()
                .sorted(Comparator.comparingDouble(Student::getAvgMark))
                .collect(Collectors.toList());
    }

    static public String findStd(ArrayList<Student> mas, String student) {
        try {
            for (Student i : mas) if (i.getFullName().equals(student)) return "Студент найден";
            throw new StudentNotFoundException("Студент не найден");
        } catch (StudentNotFoundException e) {
            return e.getMessage();
        }
    }
}
