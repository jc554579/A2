package test;


import model.Road;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MotorbikeTest {
    model.Motorbike bike = new model.Motorbike("0", new model.Road("0", 1, 6, new int[]{0, 0}, Road.Orientation.VERTICAL));

    @Test
    public void getLength() {
        assertEquals(3.0, bike.getLength());
    }

    @Test
    public void getId() {
        assertEquals("bike_0", bike.getId());
    }

    @Test
    public void testInheritance() {
        assertEquals(0, bike.getSpeed());
        assertEquals(-3, bike.getPosition());
    }
}
