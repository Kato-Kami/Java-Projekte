public class Messwert {
    private final String sensorId;
    private final long zeitstempel;
    private final double temperatur;

    public Messwert(String sensorId, long zeitstempel, double temperatur) {
        this.sensorId = sensorId;
        this.zeitstempel = zeitstempel;
        this.temperatur = temperatur;
    }

    public String getSensorId() {
        return sensorId;
    }
    public long getZeitstempel() {
        return zeitstempel;
    }

    public double getTemperatur() {
        return temperatur;
    }
}
