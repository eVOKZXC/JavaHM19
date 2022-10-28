package ru.mirea.Panferov.task1;

public class WrongTIN extends Exception{

    public WrongTIN(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "Вы неверно ввели ФИО или ИНН пользователя!";
    }
}
