package tdd.uppgift.grupp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ChargerTest {
  @Test
  public void testChargeCar() {
    Car car = new Car();
    car.setBatteryLevel(50);
    Connector connector = new Connector();
    connector.connectCar(car);
    Charger charger = new Charger(100,1.0);
    double iterations = charger.chargeCar(connector);
    assertEquals(5, iterations,5.0);
    assertEquals(100, car.getBatteryLevel());
  }

  @Test
  public void testCheckThatCarCanNotChargeWithoutConnection(){
    Car car = new Car();
    car.setBatteryLevel(50);
    Connector connector = new Connector();
    Charger charger = new Charger(100,1.0);
    double iterations = charger.chargeCar(connector);
    assertEquals(0, iterations,0.0);
    assertEquals(50, car.getBatteryLevel());
  }

}
