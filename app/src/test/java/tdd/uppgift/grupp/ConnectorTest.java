package tdd.uppgift.grupp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ConnectorTest {

  @Test
  public void testConnectCar() {
    Car car = new Car();
    Connector connector = new Connector();
    connector.connectCar(car);
    assertTrue(connector.isConnected());
  }

  @Test
  public void testDisconnectCar() {
    Car car = new Car();
    Connector connector = new Connector();
    connector.connectCar(car);
    connector.disconnectCar();
    assertTrue(!connector.isConnected());
  }
}
