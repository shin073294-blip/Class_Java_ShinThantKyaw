package com.talent.batch11.day09.homeworks.atm_projects;

import java.util.ArrayList;
import java.util.List;

public class accounts {
    public String id, name, email, password, address, phone;
    public double balance;
    public List<transaction> history;

    public accounts(String id, String name, String email, String password, String address, String phone, double balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.balance = balance;
        this.history = new ArrayList<>();
    }
}