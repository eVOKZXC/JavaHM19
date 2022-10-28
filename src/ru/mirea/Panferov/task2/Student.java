package ru.mirea.Panferov.task2;

public class Student {
    private String fullName;
    private int course;
    private int markMath;
    private int markProg;
    private int markRus;


    public Student(String fullName, int course, int markMath, int markProg, int markRus) {
        this.fullName = fullName;
        this.course = course;
        this.markMath = markMath;
        this.markProg = markProg;
        this.markRus = markRus;
    }

    @Override
    public String toString() {
        return fullName + ", " + course + " курс, " + "[МА: " + markMath + ", Прог: " + markProg +
                ", РЯ: " + markRus + "]";
    }
}
