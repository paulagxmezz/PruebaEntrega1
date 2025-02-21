package mp.e3.ejerciciosclase.e5;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Shape shape = new Shape("Red",true);
    @Test
    void getColor() {
        assertEquals("Red", shape.getColor());

    }

    @Test
    void setColor() {
        shape.setColor("Blue");
        assertEquals("Blue", shape.getColor());
    }

    @Test
    void ifFilled() {
        assertEquals(true, shape.ifFilled());
    }

    @Test
    void setFilled() {
        shape.setFilled(true);
        assertEquals(true, shape.ifFilled());
    }

    @Test
    void testToString() {
        assertEquals("Shape [color=Red, filled=true]", shape.toString());
    }
}