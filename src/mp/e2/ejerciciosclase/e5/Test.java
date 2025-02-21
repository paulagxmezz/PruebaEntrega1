package mp.e2.ejerciciosclase.e5;

public class Test {

    public static void main(String[] args) {
        Customer c1 = new Customer(89,"PAULA",'f');
        Customer c2 = new Customer(98,"Ruben",'m');
        Account a1 = new Account(89,23,c1);
        Account a2 = new Account(98,34,c2);
        System.out.println(a1);
        System.out.println(a2);




    }
}
