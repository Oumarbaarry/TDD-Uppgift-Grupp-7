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
    public void testCarLights(){
        Car car = new Car();
        assertFalse(car.lightsOn);

    }
    @Test
    public void lightsOn(){
        Car car = new Car();
        car.switchLightsOn();
        assertTrue(car.lightsOn);

    }
    @Test
    public void backLights(){
        Car car = new Car();
        car.switchBackLightsOn();
        assertTrue(car.backLightsOn);
    }
    @Test
    public void halfLightWholeLight(){
        Car car = new Car();
        car.wholeLight();
        assertFalse(car.halfLight);

    }

}