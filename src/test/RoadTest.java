package test;

import model.Road;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RoadTest {model.Road road = new model.Road("0", 1, 6, new int[]{0, 0}, Road.Orientation.HORIZONTAL);

    @Test
    public void getId() {
        assertEquals(5, road.getLength());
    }

    @Test
    public void getSpeedLimit() {
        assertEquals(1, road.getSpeedLimit());
    }

    @Test
    public void getLength() {
        assertEquals(5, road.getLength());
    }

    @Test
    public void getStartLocationTest() {
        int[] expected1 = {0, 0};
        int[] actual = this.road.getStartLocation();
        assertArrayEquals(expected1, actual);
    }

    @Test
    public void getEndLocation() {
        int[] expected = {5, 0};
        assertArrayEquals(expected, road.getEndLocation());
    }

    @Test
    public void getCars() {
        ArrayList<model.Car> expected = new ArrayList<>();
        assertEquals(expected, road.getVehiclesOnRoad());
    }

    @Test
    public void getLights() {
        ArrayList<model.TrafficLight> expected = new ArrayList<>();
        assertEquals(expected, road.getLightsOnRoad());
    }

    @Test
    public void getConnectedRoads() {
        ArrayList<model.Road> expected = new ArrayList<>();
        assertEquals(expected, road.getConnectedRoads());
    }
}
