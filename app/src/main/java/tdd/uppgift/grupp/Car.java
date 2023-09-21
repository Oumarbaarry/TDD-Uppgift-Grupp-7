package tdd.uppgift.grupp;

public class Car {
   public boolean lightsOn = false;
   public boolean backLightsOn = true;
   public boolean halfLight = false;

   public void switchLightsOn() {
      this.lightsOn = true;
   }

   public void switchBackLightsOn() {
      this.backLightsOn = true;
   }

   public void wholeLight() {
        this.halfLight = false;
   }
}
