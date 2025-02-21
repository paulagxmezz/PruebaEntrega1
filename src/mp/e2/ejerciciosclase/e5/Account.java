package mp.e2.ejerciciosclase.e5;

public class Account {
    private int id;
    public double balance;
    public Customer customer;

    public Account(int id, double balance, Customer customer) {
        this.id = id;
        this.balance = balance;
        this.customer = customer;
    }
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;

    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;

    }
    public double getBalance() {
        return balance;

    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return customer + " " + balance;

    }
    public String getCustomerName() {

        return customer.getName();

    }
    public Account deposit (double amount) {
        balance += amount;
        return this;

    }
    public Account withdraw (double amount) {
        if (balance >= amount){
            balance = balance - amount;

        }
        else {
            System.out.println("amount exceeds the balance");
        }
        return this;
    }
}
