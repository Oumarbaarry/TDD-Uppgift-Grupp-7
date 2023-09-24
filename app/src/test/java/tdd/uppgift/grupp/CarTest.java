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

  @Test
  public void testThatCarCantBrakeUnder0() {
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

  @Test
  public void testSetGearToDrive() {
    Car car = new Car();
    car.setGear("drive");
    assertEquals("drive", car.getGear());
  }

  @Test
  public void testSetGearToReverse() {
    Car car = new Car();
    car.startCar();
    car.setGear("reverse");
    assertEquals("reverse", car.getGear());
  }

  @Test
  public void testSetInvalidGear() {
    Car car = new Car();
    car.setGear("park");
    assertEquals("drive", car.getGear());
  }

  @Test
  public void testBrakeTurnsOnBrakeLight() {
    Car car = new Car();
    car.startCar();
    car.brake();
    assertTrue(car.isBrakeLightOn());
  }

  @Test
  public void testBrakeToZeroInReverse() {
    Car car = new Car();
    car.startCar();
    car.setGear("reverse");
    car.accelerate();
    car.brake();
    assertEquals(0, car.getCurrentSpeed());
  }

  @Test
  public void testCarHasBattery() {
    Car car = new Car();
    assertNotNull(car.getBatteryLevel());
  }

  @Test
  public void testThatCarConsumesBatteryWhileDriving() {
    Car car = new Car();
    car.startCar();
    car.accelerate();
    assertTrue(car.getBatteryLevel() < 100);
  }

  @Test
  public void testConsumeBatteryWithLightsOn() {
    Car car = new Car();
    car.startCar();
    car.turnOnLights();
    int initialBatteryLevel = car.getBatteryLevel();

    car.consumeBattery();

    int expectedBatteryLevel = initialBatteryLevel - 6;
    assertEquals(expectedBatteryLevel, car.getBatteryLevel());
  }

  @Test
  public void testCarStopsAcceleratingWhenBatteryEmpty() {
    Car car = new Car();
    car.startCar();
    while (car.getBatteryLevel() > 0) {
      car.accelerate();
      System.out.println(car.getBatteryLevel());
    }


    car.accelerate();

    assertFalse(car.isAccelerating());
  }

  @Test
  public void testWhenBatteryIsEmptyLightsTurnsOff() {
    Car car = new Car();
    car.startCar();
    car.turnOnLights();

    while (car.getBatteryLevel() > 0) {
      car.accelerate();
    }

    assertFalse(car.hasLights());
  }

  @Test
  public void testWhenBatteryIsEmptyHazardLightsCanStillBeTurnedOn() {
    Car car = new Car();
    car.startCar();
    car.turnOnLights();
    while (car.getBatteryLevel() > 0) {
      car.accelerate();
    }

    car.useHazardLights();
    assertTrue(car.areHazardLightsOn());
  }

  @Test
  public void testChargeBattery() {
    Car car = new Car();
    car.startCar();
    car.turnOnLights();
    car.accelerate();
    System.out.println(car.getBatteryLevel());

    car.chargeBattery(3);
    System.out.println(car.getBatteryLevel());

    assertEquals(97, car.getBatteryLevel());
  }

  @Test
  public void testChargeBatteryCantGoOver100(){
    Car car = new Car();
    car.startCar();
    car.turnOnLights();
    car.accelerate();
    System.out.println(car.getBatteryLevel());

    car.chargeBattery(10);
    System.out.println(car.getBatteryLevel());

    assertEquals(100, car.getBatteryLevel());
  }


}



