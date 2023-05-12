package bank.application;

import java.util.UUID;

public class hdfc implements BankInterface{
    private int balance;
    private String accountNo;
    private String password;
    public String name;
    public static double rateOfInterest;
    public hdfc(int balance,String password,String name){ //constructor
        this.password = password;
        this.name = name;
        this.balance = balance;
        this.accountNo = UUID.randomUUID().toString();


    }

    @Override
    public int checkBalance(String password) {
        if (password == this.password) {
            return balance;
        }
        return -1;
    }


    @Override
    public String addMONEY(int money, String password) {
        balance = balance+ money;
        String message = money +"has been added to the account"+accountNo;


        return message;
    }

    @Override
    public String withdrawMoney(int money, String password) {
        if(password == this.password) {
            if (money > balance) {
                return "insufficent balance";
            } else {
                balance = balance - money;
                return "Money withdrawn successfully from hdfc bank";
            }
        } else {
            return "Wrong password";
        }
    }


    @Override
    public String changePassword (String oldPassword, String newPassword){
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            return "Password has been updated successfully for your hdfc bank account";
        } else {
            return "Wrong password";
        }
    }
    @Override
    public double calculateTotalinterest ( int years){
        double interest = balance * rateOfInterest * years / 100;
        return interest;
    }
}


