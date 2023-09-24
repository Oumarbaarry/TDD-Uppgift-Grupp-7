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
        car.turnOnLights();
        assertTrue(car.hasLights());
    }

    @Test
    public void testTurnOnLights() {
        Car car = new Car();
        car.turnOnLights();
        assertTrue(car.hasLights());
    }

    @Test
    public void testTurnOffLights() {
        Car car = new Car();
        car.turnOnLights();
        car.turnOffLights();
        assertFalse(car.hasLights());
    }

    @Test
    public void testSetHighBeam() {
        Car car = new Car();
        car.setHighBeam();
        assertTrue(car.hasHighBeam());
    }

    @Test
    public void testSetLowBeam() {
        Car car = new Car();
        car.setLowBeam();
        assertTrue(car.hasLowBeam());
    }



}

