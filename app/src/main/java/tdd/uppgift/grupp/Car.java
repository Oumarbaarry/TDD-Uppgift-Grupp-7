package tdd.uppgift.grupp;

public class Car implements CarInterface{
   public boolean lightsOn;
   public boolean backLightsOn;
   public boolean halfLight;
   public boolean carOn;
   public boolean hazardLightsOn;



   @Override
   public void switchLightsOn() {
      if(carOn){
      this.lightsOn = true;
   }
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

            switchLightsOn();

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

   public void turnOnHazardLight() {
      this.hazardLightsOn = true;
   }

}
