package tdd.uppgift.grupp;

public class Car  {
  private boolean hasLights;
  private boolean hasHighBeam;
  private boolean hasLowBeam;

  public Car() {
    this.hasLights = false;
    this.hasHighBeam = false;
    this.hasLowBeam = false;
  }

  public boolean hasLights() {
    return hasLights;
  }

  public void turnOnLights() {
    this.hasLights = true;
    this.hasLowBeam = true;
  }

  public void turnOffLights() {
    this.hasLights = false;
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

  public boolean hasHighBeam() {
    return hasHighBeam;
  }

  public boolean hasLowBeam() {
    return hasLowBeam;
  }

}

