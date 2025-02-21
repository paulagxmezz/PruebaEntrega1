package mp.e3.ejerciciosclase.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square sq= new Square();
    Square sq1= new Square(10);
    @Test
    void getSide() {
        assertEquals(1, sq.getSide());
    }

    @Test
    void setSide() {
        sq.setSide(11);
        assertEquals(11, sq.getSide());
    }

    @Test
    void testToString() {
        assertEquals("Square [ ShapeRectangle[Shape[Shape [color=red, filled=true]width=1.0, length=1.0]]]", sq.toString());

    }

    @Test
    void setWidth() {
        sq.setWidth(10);
        assertEquals(10, sq.getWidth());
    }

    @Test
    void setLength() {
        sq.setLength(10);
        assertEquals(10, sq.getLength());
    }
}