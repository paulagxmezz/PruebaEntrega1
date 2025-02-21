package mp.e1.ejerciciosclase;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        c1.setRadius(2.0);
        System.out.println(c1);
        System.out.println("el radio es " + c1.getRadius());

    }
}
