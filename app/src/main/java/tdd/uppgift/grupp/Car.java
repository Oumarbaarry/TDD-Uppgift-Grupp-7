package tdd.uppgift.grupp;

public class Car  {
  private boolean hasLights;
  private boolean hasHighBeam;
  private boolean hasLowBeam;
  private boolean hasTailLights;
  private boolean isRunning;
  private boolean hazardLightsOn;
  private int gasState; // Accelerate = 1, Brake = -1, Release gas and brake = 0
  private int currentSpeed;

  public Car() {
    this.isRunning = false;
    this.hasLights = false;
    this.hasHighBeam = false;
    this.hasLowBeam = false;
    this.hasTailLights = false;
    this.hazardLightsOn = false;
    this.gasState = 0;
    this.currentSpeed = 0;
  }


  //GETTERS
  public boolean hasLights() {
    return hasLights;
  }

  public boolean hasHighBeam() {
    return hasHighBeam;
  }

  public boolean hasLowBeam() {
    return hasLowBeam;
  }

  public boolean hasTailLights() {
    return hasTailLights;
  }

  public boolean isRunning() {
    return isRunning;
  }

  public boolean areHazardLightsOn() {
    return hazardLightsOn;
  }

  public boolean isAccelerating() {
    return gasState == 1;
  }

  public boolean isBraking() {
    return gasState == -1;
  }

  public boolean isNeitherAcceleratingNorBraking() {
    return gasState == 0;
  }

  public int getCurrentSpeed() {
    return currentSpeed;
  }


  //METHODS

  public void startCar() {
    this.isRunning = true;
    this.hasLowBeam = true;
    this.hasLights = true;
    this.hasTailLights = true;
  }

  public void stopCar() {
    this.isRunning = false;
    turnOffLights();
  }

  public void turnOnLights() {
    this.hasLights = true;
    this.hasLowBeam = true;
    this.hasTailLights = true;
  }

  public void turnOffLights() {
    this.hasLights = false;
    this.hasHighBeam = false;
    this.hasLowBeam = false;
    this.hasTailLights = false;
  }

  public void setHighBeam() {
    this.hasHighBeam = true;
    this.hasLights = true;
    this.hasLowBeam = false;
  }

  public void setLowBeam() {
    this.hasLowBeam = true;
    this.hasLights = true;
    this.hasHighBeam = false;
  }

  public void useHazardLights() {
    this.hazardLightsOn = true;
  }

  public void stopUsingHazardLights() {
    this.hazardLightsOn = false;
  }

  public void accelerate() {
    if (isRunning) {

      if (currentSpeed + 10 <= 180) {
        currentSpeed += 10;
      }
      gasState = 1;
    }
  }

  public void brake() {
    if (isRunning) {
      gasState = -1;
    }
  }

  public void releaseGasAndBrake() {
    gasState = 0;
  }



}

