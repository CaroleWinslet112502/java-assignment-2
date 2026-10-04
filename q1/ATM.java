/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.assignment.q1;

/**
 *
 * @author acer
 */
public class ATM {
     private int correctPin = 1234;
    private double balance = 5000.00;
    private final double withdrawalLimit = 20000.00;

    // Method using throws keyword
    public void verifyPin(int enteredPin) throws InvalidPINException {
        if (enteredPin != correctPin) {
            throw new InvalidPINException("Error: Authentication failed! Invalid PIN entered.");
        }
        System.out.println("PIN verified successfully.");
    }

    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Error: Transaction amount must be greater than zero.");
        }
        if (amount > withdrawalLimit) {
            throw new InsufficientBalanceException("Error: Exceeded maximum single withdrawal limit of Rs. " + withdrawalLimit);
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Error: Insufficient balance. Current balance is Rs. " + balance);
        }
        balance -= amount;
        System.out.println("Please collect your cash. Successful withdrawal of Rs. " + amount);
        System.out.println("Remaining Balance: Rs. " + balance);
    }
}

