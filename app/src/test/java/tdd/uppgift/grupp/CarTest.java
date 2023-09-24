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

    @Test
    public void testHasTailLights() {
        Car car = new Car();
        car.turnOnLights();
        assertTrue(car.hasTailLights());
    }

    @Test
    public void testStartCar() {
        Car car = new Car();
        car.startCar();
        assertTrue(car.isRunning());
    }

    @Test
    public void testStopCar() {
        Car car = new Car();
        car.startCar();
        car.stopCar();
        assertFalse(car.isRunning());
    }

    @Test
    public void testTurnOffLightsWhenCarIsOff() {
        Car car = new Car();
        car.startCar();
        car.stopCar();
        assertFalse(car.hasLights());
    }

    @Test
    public void testUseHazardLightsWhenCarIsOn() {
        Car car = new Car();
        car.startCar();
        car.useHazardLights();
        assertTrue(car.areHazardLightsOn());
    }

    @Test
    public void testUseHazardLightsWhenCarIsOff() {
        Car car = new Car();
        car.startCar();
        car.stopCar();
        car.useHazardLights();
        assertTrue(car.areHazardLightsOn());
    }

    @Test
    public void testAccelerateCar() {
        Car car = new Car();
        car.startCar();
        car.accelerate();
        assertTrue(car.isAccelerating());
    }

    @Test
    public void testAccelerateCarWhenCarIsOff() {
        Car car = new Car();
        car.startCar();
        car.stopCar();
        car.accelerate();
        assertFalse(car.isAccelerating());
    }

    @Test
    public void testBrakeCar() {
        Car car = new Car();
        car.startCar();
        car.brake();
        assertTrue(car.isBraking());
    }

    @Test
    public void testMaxSpeedLimitIs180() {
        Car car = new Car();
        car.startCar();

        while (car.getCurrentSpeed() < 170) {
            car.accelerate();
        }

        car.accelerate();

        assertTrue(car.getCurrentSpeed() <= 180);
    }

    @Test
    public void testThatCarCanBrakeToZero() {
        Car car = new Car();
        car.startCar();

        while (car.getCurrentSpeed() < 10) {
            car.accelerate();
        }

        while (car.getCurrentSpeed() > 0) {
            car.brake();
        }

        assertEquals(0, car.getCurrentSpeed());
    }





}

