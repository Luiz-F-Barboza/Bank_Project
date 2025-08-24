package BankAccount.application;

import BankAccount.entities.Account;
import java.util.Scanner;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Account account = null;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String answer = sc.next();

        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();

            account = new Account(accountNumber, holder, initialDeposit);
            System.out.println(account);
        } else if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("N")){
            account = new Account(accountNumber, holder, 0);
            System.out.println(account);
        }

         if (account == null) {
            System.out.println("Error: Account not initialized!");
            return;
        }

        System.out.print("Enter a deposit value: ");
        double balance = sc.nextDouble();

        account.deposit(balance);
        System.out.println("Updated account data: " + account);

        System.out.print("Enter a withdraw value: ");
        balance = sc.nextDouble();

        account.withdraw(balance);
        System.out.println("Updated account data: " + account);

        System.out.print("Do you want to continue to the menu? (y/n): ");
        answer = sc.next();

        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Y")) {
            System.out.println("=== Bank Menu ===");
            System.out.println("1 - Create new account");
            System.out.println("2 - Deposit money");
            System.out.println("3 - Withdraw money");
            System.out.println("4 - Show account data");
            System.out.println("5 - Exit");
            System.out.println("=================");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            switch(option){
                case 01:
                    System.out.print("Enter your name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.print("Enter your CPF: ");
                    String cpf = sc.next();

                    int AccountNumber = 100000 + random.nextInt(900000) + 1;

                    System.out.print("Is there an initial deposit (y/n)? ");
                    answer = sc.next();

                    if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Y")) {
                        System.out.print("Enter initial deposit value: ");
                        double initialDeposit = sc.nextDouble();

                        Account newAccount = new Account(AccountNumber, name, initialDeposit);
                        System.out.println(newAccount);
                    } else if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("N")){
                        Account newAccount = new Account(AccountNumber, name, 0);
                        System.out.println(newAccount);
                    }

                    System.out.printf("Your account number is: %d", AccountNumber);
                    break;
            }

        } else if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("N")){
            return;
        }

        sc.close();
    }
}