package ru.mirea.Panferov.task1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    static public void main(String[] args){
        Set<Client> mas = new HashSet<>();
        mas.add(new Client("Панферов", "12378149"));
        try{
            System.out.println(buyFunc(mas));
        }catch(WrongTIN e){
            System.out.println(e.getMessage());
        }
    }

    static public String buyFunc(Set<Client> mas) throws WrongTIN {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();
        System.out.print("Введите ИНН: ");
        String TIN = scanner.nextLine();
        Client client = new Client(fullName, TIN);
        boolean flag = false;
        for (Client i : mas) if (i.equals(client)) return "Покупка совершена";
        if (!flag) throw new WrongTIN("Вы неверно ввели ИНН для этого пользователя!");
        return "Покупка совершена";
    }
}
