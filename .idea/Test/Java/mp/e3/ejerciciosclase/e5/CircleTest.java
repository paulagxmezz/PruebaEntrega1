package mp.e3.ejerciciosclase.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CircleTest {
    Circle c1 = new Circle(5);
    @Test
    void getRadius() {

        assertEquals(5, c1.getRadius());
    }

    @Test
    void setRadius() {
        c1.setRadius(10);
        assertEquals(10, c1.getRadius());
    }

    @Test
    void getPerimeter() {
        assertEquals(2 * Math.PI*5, c1.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(Math.PI*25, c1.getArea());
    }

    @Test
    void testToString() {
        assertEquals("Circle[Shape [color=red, filled=true]] radius=5.0]", c1.toString());




    }

}