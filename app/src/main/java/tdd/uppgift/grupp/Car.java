package tdd.uppgift.grupp;

public class Car implements CarInterface{
   public boolean lightsOn = false;
   public boolean backLightsOn = true;
   public boolean halfLight = false;
   public boolean carOn = false;



   @Override
   public void switchLightsOn() {
      this.lightsOn = true;
   }
   @Override
   public void switchBackLightsOn() {
      this.backLightsOn = true;
   }
   @Override
   public void wholeLight() {
        this.halfLight = false;
   }
   @Override
   public void startCar() {
        this.carOn = true;
   }

   @Override
   public void turnOffLights() {
      this.lightsOn = false;
      this.backLightsOn = false;
      this.halfLight = false;
   }

    @Override
   public void turnOffCar() {
      this.carOn = false;
      turnOffLights();
   }
}
