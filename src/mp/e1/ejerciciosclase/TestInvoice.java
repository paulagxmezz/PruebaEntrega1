package mp.e1.ejerciciosclase;

public class TestInvoice {
    public static void main(String[] args) {
            Invoice inv1 = new Invoice("A101","Pen Red", 888, 0.88);
            System.out.println(inv1);

            inv1.setQty(999);
            inv1.setUnitPrice(0.99);
            System.out.println(inv1);
            System.out.println(inv1.getTotal());

    }
}
