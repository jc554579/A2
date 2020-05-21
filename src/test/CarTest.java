package test;

import static org.junit.Assert.*;

import model.Road;
import org.junit.Test;


public class CarTest {
    model.Road road = new model.Road("0", 1, 6, new int[]{0, 0}, Road.Orientation.VERTICAL);
    model.Car car = new model.Car("0", road);

    @Test
    public void testMove() {
        car.move();
        assertEquals(-2, car.getPosition());
    }

    @Test
    public void getLength() {
        assertEquals(5, car.getLength());
    }

    @Test
    public void getBreadth() {
        assertEquals(2.0, car.getBreadth());
    }

    @Test
    public void getSpeed() {
        assertEquals(0, car.getSpeed());
    }

    @Test
    void getPosition() {
        assertEquals(-5, car.getPosition());
    }

    @Test
    void getRoad() {
        assertEquals(road, car.getCurrentRoad());
    }

    @Test
    void getId() {
        assertEquals("car_0", car.getId());
    }

}