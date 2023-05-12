// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

package bank.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SBI.rateOfInterest = 7;
        hdfc.rateOfInterest = 6;
        SBI account1 = new SBI(100000, "123", "vasanthi");
        SBI account2 = new SBI(150000, "456", "sopna");
        hdfc account3 = new hdfc(20000, "789", "kesavan");

        //wrong password output
        int balance = account1.checkBalance("124"); //giving wrong password
        System.out.println("The balance for the account SBI account is" + balance);

        //right password output
        int balancecheck = account1.checkBalance("123");
        System.out.println("the balance for the SBI account is " + balancecheck);

        //add money
        String bankMessage = account2.addMONEY(5000, "789");
        System.out.println(bankMessage);

        //Wrong password retry
        String message = account3.withdrawMoney(5000, "1234");
        System.out.println(message);

        // right password
        String message1 = account3.withdrawMoney(5000, "789");
        System.out.println(message1);

        //SBI ACCOUNT
        double interest = account1.calculateTotalinterest(20);
        System.out.println("the total interest you will get is" + interest);


        //HDFC ACCOUNT
        double interest1 = account3.calculateTotalinterest(20);
        System.out.println("the total interest you will get is" + interest1);


        System.out.println("Make it dynamic");
        System.out.println("welcome to SBI,please enter the following details to create a new account");
        System.out.println("Enter name :");


        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter balance : ");
        int initialBalance = sc.nextInt();
        System.out.println("Enter password : ");
        String password = sc.next();
        SBI sbiAccount = new SBI(initialBalance, password, name);

        System.out.println("Enter money and password to add");
    }
}

        


