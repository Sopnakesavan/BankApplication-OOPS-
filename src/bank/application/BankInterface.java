package bank.application;

public interface BankInterface {
    public int checkBalance(String password);
    public String addMONEY(int money,String password);
    public String withdrawMoney(int money,String password);
    public String changePassword(String oldPassword,String newPassword);
    public double calculateTotalinterest(int years);
}

