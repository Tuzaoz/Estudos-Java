package users;

public class User {
    private String accountNumber;
    private String name;
    private double balance;
    
    public User(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
    }
    public User(double balance){
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double balance){
        this.balance += balance;
    }

    public void removeBalance(double balance){
        this.balance -= balance + 5;
    }
    @Override
    public String toString() {
        return "Conta:" + accountNumber + ", Nome:" + name + ", Saldo= R$" + balance;
    }
    
}
