import java.math.BigDecimal;
import java.math.RoundingMode;

public class Mitarbeiter {

    private String name;
    private String position;
    private double gehalt;

    public Mitarbeiter (String name, String position, double gehalt) {
        this.name = name;
        this.position = position;
        this.gehalt = gehalt;
    }

    public double erhoeheGehalt(double prozent) {
        gehalt = gehalt * (1 + prozent / 100);
        BigDecimal bd = new BigDecimal(gehalt);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double gerundetesgehalt = bd.doubleValue();
        return gerundetesgehalt;
    }


    public void zeigeInformationen() {
        System.out.println("Mitarbeiter/in: " + name + ", Position: " + position + ", Gehalt: " + gehalt);

    }

    public static void main(String[] args) {
        Mitarbeiter arbeiter1 = new Mitarbeiter("Tim Burners-Lee", "Cloud-Development", 4571.23);
        Mitarbeiter arbeiter2 = new Mitarbeiter("Ada Lovelace", "Algorithm Development", 4505.00);
        Mitarbeiter arbeiter3 = new Mitarbeiter("Bill Gates", "Backend Developer", 5284.61);
        Mitarbeiter arbeiter4 = new Mitarbeiter("Hendrik Witzschel", "Praktikant", 0.00);


        arbeiter1.zeigeInformationen();
        arbeiter2.erhoeheGehalt(5);
        arbeiter2.zeigeInformationen();
        arbeiter3.zeigeInformationen();
        arbeiter4.zeigeInformationen();


    }
}
