// Klasse Messwert definiert, wie genau ein bestimmter Messwer aufgebaut ist, die 
// später in StreamSensorDaten in einer Liste als Datenklasse verwendet wird

public class Messwert {
    
    // Eindeutige ID des Sensors, der den Messwert aufgenommen hat
    private final String sensorId;
    
    // Zeitpunkt, zu dem die Messung durchgeführt wurde
    private final long zeitstempel;
    
    // Gemessene Temperatur
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
