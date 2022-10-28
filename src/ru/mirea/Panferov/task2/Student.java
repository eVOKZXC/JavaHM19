package ru.mirea.Panferov.task2;

public class Student {
    private String fullName;
    private int course;
    private int markMath;
    private int markProg;
    private int markRus;
    private int markLin;


    public Student(String fullName, int course, int markMath, int markProg, int markRus, int markLin) {
        this.fullName = fullName;
        this.course = course;
        this.markMath = markMath;
        this.markProg = markProg;
        this.markRus = markRus;
        this.markLin = markLin;
    }

    public String getFullName() { return fullName; }

    public double getAvgMark(){ return (double)(markMath + markRus + markProg + markLin)/4;}

    @Override
    public String toString() {
        return fullName + ", " + course + " курс, " + "средняя оценка: " + this.getAvgMark();
    }
}
