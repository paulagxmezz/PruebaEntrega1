package mp.e3.ejerciciosclase.e5;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        super();
        this.radius = 1.0;

    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color,boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;

    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString(){

        return "Circle[ Shape["+super.toString()+"] radius="+radius+"]";
    }
}
