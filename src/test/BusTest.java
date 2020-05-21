package test;

import static org.junit.Assert.*;

import model.Road;
import org.junit.Test;


public class BusTest {
    model.Road road = new model.Road("0", 1, 6, new int[]{0, 0}, Road.Orientation.VERTICAL);
    model.Bus bus = new model.Bus("0", road);

    @Test
    void getLength() {
        assertEquals(11, bus.getLength());
    }

    @Test
    void getId() {
        assertEquals("bus_0", bus.getId());
    }

    @Test
    void testInheritance() {
        assertEquals(0, bus.getSpeed());
        assertEquals(-11, bus.getPosition());
    }
}