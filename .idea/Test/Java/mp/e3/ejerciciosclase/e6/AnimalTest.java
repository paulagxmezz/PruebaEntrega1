package mp.e3.ejerciciosclase.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal a1 = new Animal ("Leon");

    @Test
    void testToString() {
        assertEquals("Animal [nombre: Leon]", a1.toString());

    }
}