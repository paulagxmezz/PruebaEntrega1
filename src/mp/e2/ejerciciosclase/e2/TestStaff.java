package mp.e2.ejerciciosclase.e2;

public class TestStaff {
    public static void main(String[] args) {
        Staff s1 = new Staff("Paula", "Alcala", "Calasanz",200);
        System.out.println(s1);
        s1.getSchool();
        s1.setSchool("Alkala Na'har");
        s1.getPay();
        s1.setPay(200);

    }

}
