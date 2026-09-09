// Hilfsklasse zur Berechnung von Summe, Anzahl und Durchschnitt

public class SummeUndAnzahl {
    final double summe;
    final long anzahl;

    SummeUndAnzahl(double summe, long anzahl) {
        this.summe = summe;
        this.anzahl = anzahl;
    }

    SummeUndAnzahl addiere(double temperatur) {
        return new SummeUndAnzahl(this.summe + temperatur, this.anzahl + 1);
    }

    SummeUndAnzahl kombiniere(SummeUndAnzahl other) {
        return new SummeUndAnzahl(this.summe + other.summe, this.anzahl + other.anzahl);
    }

    double durchschnitt() {
        return anzahl == 0 ? Double.NaN : (summe/anzahl);
    }
}
