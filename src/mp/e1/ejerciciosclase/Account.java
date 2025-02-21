package mp.e1.ejerciciosclase;

public class Account {
    private String id;
    private final String name;
    private int balance;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
        this.balance = 0;

    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getID(){
        return id;

    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int Credit (int amount){
        this.balance = amount + balance;
        return balance;
    }
    public int Debit(int amount){
        if (amount <= balance){
            this.balance = balance - amount;

        }
        else System.out.println("Amount exceeded balance");
        return balance;

    }

    public int TransferTo(Account another, int amount) {
        if(amount<=balance){
            this.balance = balance - amount;
            another.Credit(amount);
        }
        else System.out.println("Amount exceeded balance");
        return balance;
    }
    public String toString(){
        return "Account [ id = "+ id + ", name = "+ name+ ", balance = "
+ balance + "]";    }

}
