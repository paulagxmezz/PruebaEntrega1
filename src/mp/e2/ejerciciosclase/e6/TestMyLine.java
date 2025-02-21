package mp.e2.ejerciciosclase.e6;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine l1= new MyLine(4,6,3,4);
        System.out.println(l1);
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(2,8);
        MyLine l2 = new MyLine(p1,p2);
        System.out.println(l2);

        System.out.println("l es"+ l2.getBeginXY());
        l2.setEndXY(5,8);
        System.out.println("longitud de l1 es is: " + l1.getLength());
        System.out.println("x is: " + l2.getLength());

    }

}
