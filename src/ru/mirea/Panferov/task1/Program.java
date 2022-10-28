package ru.mirea.Panferov.task1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    static public void main(String[] args){
        Set<Client> mas = new HashSet<>();
        mas.add(new Client("Панферов", "12378149"));
        System.out.println(buyFunc(mas));
    }

    static public String buyFunc(Set<Client> mas){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();
        System.out.print("Введите ИНН: ");
        String TIN = scanner.nextLine();
        Client client = new Client(fullName, TIN);
        try{
            for (Client i : mas) if (i.equals(client)) return "Покупка совершена";
            throw new WrongTIN("Вы неверно ввели ФИО или ИНН пользователя!");
        }catch (WrongTIN e){
           return e.getMessage();
        }
    }
}
