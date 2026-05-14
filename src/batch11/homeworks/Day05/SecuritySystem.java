package com.talent.batch11.day5.homeworkDay5;

public class SecuritySystem {
    private String secretCode;
    public final String serialNumber;

    public SecuritySystem(String secretCode, String serialNumber) {
        this.secretCode = secretCode;
        this.serialNumber = serialNumber;
    }

    public void displaySerial() {
        System.out.println("Serial Number: " + serialNumber);
    }

    public static void main(String[] args) {
        SecuritySystem sys = new SecuritySystem("MyPassword", "ABC-123");

        sys.displaySerial();
    }
}
