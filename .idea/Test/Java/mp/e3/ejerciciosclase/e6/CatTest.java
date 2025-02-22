package mp.e3.ejerciciosclase.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat c1 = new Cat("Gato");

    @Test
    void greets() {

    }

    @Test
    void testToString() {
        assertEquals("Cat[Mammal[Animal [nombre: Gato]]" , c1.toString());

    }
}