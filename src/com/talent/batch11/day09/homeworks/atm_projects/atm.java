package com.talent.batch11.day09.homeworks.atm_projects;

import java.util.*;

public class atm {
    private static List<accounts> db = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        db.add(new accounts("111", "Alice", "", "1111", "", "", 1000.0));
        db.add(new accounts("222", "Bob", "", "2222", "", "", 500.0));

        while (true) {
            System.out.println("\n1. Create Account\n2. Log In\n3. Exit");
            System.out.print("Action: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 3) break;
            if (choice == 1) handleCreateAccount();
            else if (choice == 2) handleLogin();
        }
    }

    private static void handleCreateAccount() {
        System.out.print("ID: "); String id = scanner.nextLine();
        System.out.print("Name: "); String name = scanner.nextLine();
        System.out.print("Password: "); String pass = scanner.nextLine();
        System.out.print("Deposit: "); double bal = scanner.nextDouble();
        scanner.nextLine();

        db.add(new accounts(id, name, "", pass, "", "", bal));
        System.out.println("Registered.");
    }

    private static void handleLogin() {
        System.out.print("ID: "); String id = scanner.nextLine();
        System.out.print("Password: "); String pass = scanner.nextLine();

        accounts user = findAccount(id);
        if (user != null && user.password.equals(pass)) {
            runDashboard(user);
        } else {
            System.out.println("Denied.");
        }
    }

    private static void runDashboard(accounts user) {
        while (true) {
            System.out.println("\nUser: " + user.name + " | Bal: $" + user.balance);
            System.out.println("1. Deposit\n2. Withdraw\n3. Transfer\n4. History\n5. Log Out");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 5) break;

            String txId = "TX-" + System.currentTimeMillis();
            switch (choice) {
                case 1 -> executeDeposit(user, txId);
                case 2 -> executeWithdraw(user, txId);
                case 3 -> executeTransfer(user, txId);
                case 4 -> printStatement(user);
            }
        }
    }

    private static void executeDeposit(accounts user, String txId) {
        System.out.print("Amount: $");
        double amt = scanner.nextDouble();

        if (amt <= 0) return;

        user.history.add(new transaction(txId, new Date(), "Deposit", amt, user.balance));
        user.balance += amt;
    }

    private static void executeWithdraw(accounts user, String txId) {
        System.out.print("Amount: $");
        double amt = scanner.nextDouble();

        if (amt <= 0 || amt > user.balance) {
            System.out.println("Invalid.");
            return;
        }

        user.history.add(new transaction(txId, new Date(), "Withdraw", amt, user.balance));
        user.balance -= amt;
    }

    private static void executeTransfer(accounts sender, String txId) {
        System.out.print("Recipient ID: ");
        String recId = scanner.nextLine();

        if (recId.equals(sender.id)) return;

        accounts recipient = findAccount(recId);
        if (recipient == null) return;

        System.out.print("Amount: $");
        double amt = scanner.nextDouble();

        if (amt <= 0 || amt > sender.balance) return;

        sender.history.add(new transaction(txId, new Date(), "To " + recipient.name, amt, sender.balance));
        recipient.history.add(new transaction(txId, new Date(), "From " + sender.name, amt, recipient.balance));

        sender.balance -= amt; // sender.balance = sender.balance - amt
        recipient.balance += amt;// ||
    }

    private static void printStatement(accounts user) {
        for (transaction tx : user.history) {
            String typeStr = tx.transactionType;
            while (typeStr.length() < 15) {
                typeStr += " "; // Manually add spaces until it's exactly 15 characters long
            }

            String amtStr = String.format("$%.2f", tx.amount);
            while (amtStr.length() < 7) {
                amtStr += " ";
            }

            String balStr = String.format("$%.2f", tx.previousBalance);

            System.out.println(typeStr + " | " + amtStr + " | Bal: " + balStr);
        }
    }

    private static accounts findAccount(String id) {
        for (accounts a : db) {
            if (a.id.equals(id)) return a;
        }
        return null;
    }
}