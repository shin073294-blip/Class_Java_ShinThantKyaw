package com.talent.batch11.day05.homeworks;

public class security_system {
    private String secretCode;
    public final String serialNumber;

    public security_system(String secretCode, String serialNumber) {
        this.secretCode = secretCode;
        this.serialNumber = serialNumber;
    }

    public void displaySerial() {
        System.out.println("Serial Number: " + serialNumber);
    }

    public static void main(String[] args) {
        security_system sys = new security_system("MyPassword", "ABC-123");

        sys.displaySerial();
    }
}

