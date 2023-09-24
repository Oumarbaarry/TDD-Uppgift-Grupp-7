package tdd.uppgift.grupp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void testCarInstanceNotNull() {
        Car car = new Car();
        assertNotNull(car);
    }

    @Test
    public void testCarHasLights() {
        Car car = new Car();
        assertTrue(car.hasLights());
    }



}

