import java.time.Instant;
import java.util.List;

public class StreamSensordaten {

    public static void main(String[] args) {
        List<Messwert> messwerte = List.of(
                new Messwert("S1", Instant.parse("2026-01-20T10:00:05Z").toEpochMilli(), 21.5),
                new Messwert("S2", Instant.parse("2026-01-20T10:00:01Z").toEpochMilli(), 28.0),
                new Messwert("S1", Instant.parse("2026-01-20T10:00:02Z").toEpochMilli(), 21.5),
                new Messwert("S1", Instant.parse("2026-01-20T10:00:03Z").toEpochMilli(), 21.5),
                new Messwert("S1", Instant.parse("2026-01-20T10:00:04Z").toEpochMilli(), 21.5)
        );

        // Prüft, ob alle Temperaturen zwischen 50 °C und 80 °C liegen
        boolean alleGueltig = messwerte.stream().allMatch(m -> m.getTemperatur() >= 50.0 && m.getTemperatur() <= 80.0);

        System.out.println("Alle Messwerte gültig: " + alleGueltig);

        // Prüft, ob mindestens eine Temperatur über 70 °C liegt
        boolean anomalieVorhanden = messwerte.stream().anyMatch(m -> m.getTemperatur() > 70.0);

        System.out.println("Anomalie vorhanden: " + anomalieVorhanden);

        // sortiert Messwerte aufsteigend nach ihrem Zeitstempel
        messwerte.stream()
                .sorted((a, b) -> Long.compare(a.getZeitstempel(), b.getZeitstempel()))
                .forEach(m -> System.out.println("Sortierung " + m.getSensorId() + " @ " + m.getZeitstempel())
                );

        // Paralleler Stream für die Berechnung der Durchschnittstemperatur
        double durchschnittAlle = messwerte.parallelStream()
                .map(Messwert::getTemperatur)
                .reduce(
                        new SummeUndAnzahl(0.0, 0),
                        SummeUndAnzahl::addiere,
                        SummeUndAnzahl::kombiniere
                )
                .durchschnitt();

        System.out.println("Durchschnittstemperatur: " + durchschnittAlle);
    }
}
