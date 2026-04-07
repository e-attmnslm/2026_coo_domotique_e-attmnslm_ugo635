import thermos.Thermostat;

public class AdapteurTermostat implements Appareil {
    private Thermostat t;

    public AdapteurTermostat(Thermostat t) {
        this.t = t;
    }

    @Override
    public void allumer() {
        this.t.monterTemperature();
    }

    @Override
    public void eteindre() {
        this.t.baisserTemperature();
    }

    @Override
    public String toString() {
        return "Thermostat: " + "?";
    }
}
