package tdd.uppgift.grupp;

public interface CarInterface {
    void switchLightsOn();

    void switchBackLightsOn();

    void wholeLight();

    void startCar();


    void turnOffLights();
    void turnOffCar();

    void turnOnHazardLight();

    void turnOffHazardLight();

    int getSpeed();

    void accelerate(int amount);

    void pressGasPedal();

    void decelerate(int amount);
}
