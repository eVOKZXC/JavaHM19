package ru.mirea.Panferov.task2;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Студент не найден";
    }
}
