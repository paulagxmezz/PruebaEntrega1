package mp.e2.ejerciciosclase.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c = new Circle(3.0, "red");

    @Test
    void getRadius() {
        assertEquals(3.0, c.getRadius());
    }

    @Test
    void setRadius() {
        c.setRadius(4.0);
        assertEquals(4.0, c.getRadius());
    }

    @Test
    void getColor() {
        assertEquals("red", c.getColor());
    }

    @Test
    void setColor() {
        c.setColor("blue");
        assertEquals("blue", c.getColor());
    }

    @Test
    void getArea() {
        assertEquals(Math.PI *9.0, c.getArea());
    }

    @Test
    void testToString() {
        assertEquals("Circle [radius=3.0, color=red]", c.toString());

    }
}