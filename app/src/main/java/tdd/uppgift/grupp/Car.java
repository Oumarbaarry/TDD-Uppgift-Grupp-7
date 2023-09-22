package tdd.uppgift.grupp;

public class Car implements CarInterface{
   public boolean lightsOn;
   public boolean backLightsOn;
   public boolean halfLight;
   public boolean carOn;
   public boolean hazardLightsOn;
   public boolean hazardlightsOf;
   public int speed;


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

   @Override
   public void turnOnHazardLight() {
      this.hazardLightsOn  = true;
   }
   @Override
   public void turnOffHazardLight() {
      this.hazardlightsOf = true;
   }

   @Override
   public int getSpeed() {

      return speed;
   }
   @Override
   public void accelerate(int amount) {
      if(carOn){
         speed += amount;
      }

   }
}
