package tdd.uppgift.grupp;

public class Car  {
  private boolean hasLights;
  private boolean hasHighBeam;
  private boolean hasLowBeam;
  private boolean hasTailLights;
  private boolean isRunning;

  public Car() {
    this.isRunning = false;
    this.hasLights = false;
    this.hasHighBeam = false;
    this.hasLowBeam = false;
    this.hasTailLights = false;
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



}

