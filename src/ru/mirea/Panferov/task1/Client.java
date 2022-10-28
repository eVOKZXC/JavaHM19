package ru.mirea.Panferov.task1;

import java.util.Objects;

public class Client {
    private String fullName;
    private String TIN;

    public Client(String fullName, String TIN) {
        this.fullName = fullName;
        this.TIN = TIN;
    }

    @Override
    public boolean equals(Object o) {
        Client client = (Client) o;
        return this.TIN.equals(client.TIN) && this.fullName.equals(client.fullName);
    }
}
