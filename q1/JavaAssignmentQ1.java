/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java.assignment.q1;
import java.util.*;

/**
 *
 * @author acer
 */
public class JavaAssignmentQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();

        try {
            System.out.print("Enter your 4-digit ATM PIN: ");
            int pin = scanner.nextInt();
            
            // Verify PIN
            atm.verifyPin(pin);

            System.out.print("Enter amount to withdraw: Rs. ");
            double amount = scanner.nextDouble();

            // Withdraw cash
            atm.withdraw(amount);

        } catch (InvalidPINException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input format entered.");
        } finally {
            // Finally block always executes for cleanup
            System.out.println("Thank you for using our ATM service. Please take your card.");
            scanner.close();
        }
        // TODO code application logic here
    }
    
}
