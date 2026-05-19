package com.talent.batch11.day09.homeworks.atm_projects;

import java.util.Date;

public class transaction {
    public String id;
    public Date createDate;
    public String transactionType;
    public double amount;
    public double previousBalance;

    public transaction(String id, Date createDate, String transactionType, double amount, double previousBalance) {
        this.id = id;
        this.createDate = createDate;
        this.transactionType = transactionType;
        this.amount = amount;
        this.previousBalance = previousBalance;
    }
}
