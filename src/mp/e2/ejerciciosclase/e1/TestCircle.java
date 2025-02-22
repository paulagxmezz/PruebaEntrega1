package mp.e2.ejerciciosclase.e1;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle(3.0, "blue");
        c.getColor();
        c2.getRadius();
        c3.setColor("red");
        c3.setRadius(4.0);
        System.out.println(c);
    }
}
