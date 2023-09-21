package tdd.uppgift.grupp;

public class Car {
   public boolean lightsOn = false;
   public boolean backLightsOn = true;

   public void switchLightsOn() {
      this.lightsOn = true;
   }

   public void switchBackLightsOn() {
      this.backLightsOn = true;
   }
}
