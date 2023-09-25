package tdd.uppgift.grupp;

public class Connector {
  private Car connectedCar;

  public boolean isConnected() {
    return connectedCar != null;
  }

  public void connectCar(Car car) {
    connectedCar = car;
  }

  public void disconnectCar() {
    connectedCar = null;
  }

  public void chargeCar(int amount) {
    if (connectedCar != null) {
      connectedCar.chargeBattery(amount);
    }
  }

  public boolean isCarFullyCharged() {
    return connectedCar != null && connectedCar.getBatteryLevel() >= 100;
  }
}
