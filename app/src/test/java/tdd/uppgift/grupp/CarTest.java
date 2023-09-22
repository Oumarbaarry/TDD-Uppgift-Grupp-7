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
    public void testCarLights() {
        Car car = new Car();
        assertFalse(car.lightsOn);

    }

    @Test
    public void lightsOn() {
        Car car = new Car();
        car.switchLightsOn();
        assertTrue(car.lightsOn);

    }

    @Test
    public void backLights() {
        Car car = new Car();
        car.switchBackLightsOn();
        assertTrue(car.backLightsOn);
    }

    @Test
    public void halfLightWholeLight() {
        Car car = new Car();
        car.wholeLight();
        assertFalse(car.halfLight);

    }

    @Test
    public void startCar() {
        Car car = new Car();
        car.startCar();
        assertTrue(car.carOn);
    }

    @Test
    public void carOffLightsOff() {
        Car car = new Car();
        car.turnOffCar();
        assertFalse(car.lightsOn);


    }

    @Test
    public void testTurnOffCar() {
        Car car = new Car();
        car.startCar();
        assertTrue(car.carOn);
        car.turnOffCar();
        assertFalse(car.carOn);
        assertFalse(car.lightsOn);
        assertFalse(car.backLightsOn);
        assertFalse(car.halfLight);
    }

    @Test
    public void testHazardLightsOn(){
        Car car = new Car();
        assertFalse(car.hazardLightsOn);
        car.turnOnHazardLight();
        assertTrue(car.hazardLightsOn);



    }
}