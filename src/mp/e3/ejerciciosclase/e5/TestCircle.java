package mp.e3.ejerciciosclase.e5;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        Circle c1 = new Circle(5, "Red", true);
        System.out.println(c1);
        c1.getRadius();
        c.setRadius(3.9);
        Circle c2 = new Circle();



    }
}
