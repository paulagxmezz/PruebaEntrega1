package mp.e1.ejerciciosclase;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("A101", "TAN",88);
        System.out.println(a1);
        Account a2 = new Account("A102", "QON");
        System.out.println(a2);



        System.out.println("ID: "+ a1.getID());
        System.out.println("Balance: "+ a1.getBalance());
        System.out.println("Name: "+ a1.getName());

        a1.Credit(100);
        System.out.println(a1);
        a1.Debit(50);
        System.out.println(a1);

        a1.Debit(500);
        System.out.println(a1);


        a1.TransferTo(a2,100);
        System.out.println(a1);
        System.out.println(a2);

    }
}
