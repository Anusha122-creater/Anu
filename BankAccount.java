package ApjfsA;

import java.util.Scanner;

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
    	super();
    	this.balance=balance;
       
    }

    public int getBalance() {
        return balance;
    }
 //for depositing amount to the account
     void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
 //for withdrawing amount
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn ₹" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

 class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(1000); // Initial balance ₹1000

        while (true) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is ₹" + userAccount.getBalance());
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    int depositAmount = scanner.nextInt();
                    userAccount.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    int withdrawAmount = scanner.nextInt();
                    userAccount.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
