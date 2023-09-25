package tdd.uppgift.grupp;

public class Charger {

  private int chargeCapacity;
  private double chargingCost;

  public Charger(int capacity, double cost) {
    this.chargeCapacity = capacity;
    this.chargingCost = cost;
  }

  public double chargeCar(Connector connector) {
    int iterations = 0;
    while (connector.isConnected() && !connector.isCarFullyCharged() && chargeCapacity > 0) {
      connector.chargeCar(10); // Ladda med 10 enheter åt gången
      chargeCapacity -= 10;
      iterations++;
    }

    if (!connector.isConnected()) {
      System.out.println("Anslutning saknas. Ingen laddning utförd.");
      return 0.0; // Om ingen anslutning, returnera noll kostnad
    }

    if (connector.isCarFullyCharged()) {
      double cost = iterations * chargingCost; // Beräkna kostnaden baserat på antalet iterationer och laddningskostnaden
      System.out.println("Bilen är fulladdad efter " + iterations + " iterationer.");
      System.out.println("Kostnaden för laddningen är: " + cost);
      return cost;
    } else {
      System.out.println("Laddningen avbröts. Bilen är inte fulladdad.");
      return 0.0; // Om laddningen avbröts, returnera noll kostnad
    }
  }
}

