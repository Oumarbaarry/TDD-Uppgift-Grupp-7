package tdd.uppgift.grupp;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

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
        assertFalse(car.carOn);
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
        car.turnOffHazardLight();
        assertTrue(car.hazardlightsOf);

    }
    @Test
    public void testTurnHazardLightsof(){
        Car car = new Car();
        assertFalse(car.hazardLightsOn);
        car.turnOnHazardLight();
        assertTrue(car.hazardLightsOn);
        car.turnOffHazardLight();
        assertTrue(car.hazardlightsOf);
    }
    @Test
    public void testAccelerate(){
        Car car = new Car();
        car.startCar();
        car.pressGasPedal();
        assertEquals(0, car.getSpeed());
        car.accelerate(10);
        assertEquals(10, car.getSpeed());

    }


        @Test
        public void testAccelerateToMaxSpeed() {
            Car car = new Car();
            car.startCar();
            car.pressGasPedal();
            while (car.getSpeed() < 180) {
                car.accelerate(10);
            }
            assertEquals(180, car.getSpeed());
        }
    @Test
    public void testDecelerateToZero() {
        Car car = new Car();
        car.startCar();
        car.pressGasPedal();
        while (car.getSpeed() > 0) {
            car.decelerate(10);
        }
        assertEquals(0, car.getSpeed());
    }
    @Test
    public void testBrakeToZero(){
        Car car = new Car();
        car.startCar();
        car.accelerate(100);
        car.brake();

    }

}

