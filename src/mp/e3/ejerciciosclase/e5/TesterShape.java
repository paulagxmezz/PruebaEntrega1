package mp.e3.ejerciciosclase.e5;

public class TesterShape {
    public static void main(String[] args) {

        Shape shape = new Shape("Red",true);
        System.out.println(shape);
        shape.getColor();
        shape.setColor("Blue");
        shape.ifFilled();
        shape.setFilled(true);



    }
}
