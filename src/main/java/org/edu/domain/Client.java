package org.edu.domain;

import java.util.*;

public class Client {

    private String name;
    private Gender gender;
    private Account account;

    public Client(String name, Gender gender, Account account) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Account getAccount() {
        return account;
    }
}
