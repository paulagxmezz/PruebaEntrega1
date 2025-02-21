package mp.e3.ejerciciosclase.e5;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        System.out.println(r);
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle(10,20,"Red",true);
        r3.getWidth();
        r3.setWidth(6);
        r3.setLength(6);
        r3.getLength();
        r3.getArea();

        r3.getPerimeter();

    }

}
