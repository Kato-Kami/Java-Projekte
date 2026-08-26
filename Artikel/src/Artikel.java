import java.util.Scanner;
enum lebensmittelgruppe {Obst, Gemuese, Fleisch, Suesswaren}

public class Artikel {
    public String artikelbezeichnung;
    private int artikelnummer;
    private double verkaufspreis;
    private lebensmittelgruppe gruppe;

    Scanner input = new Scanner(System.in);

    public Artikel () {
        System.out.println("\nArtikelbezeichnung: ");
        artikelbezeichnung = input.next();

        // gruppe = lebensmittelgruppe.valueOf(input.nextLine());
        System.out.println("Lebensmittelgruppe (1 = Obst, 2 = Gemuese, 3 = Fleisch, 4 = Suesswaren): ");
        int gruppenZahl = Integer.parseInt(input.next());
        gruppe = lebensmittelgruppe.values()[gruppenZahl-1];


        //artikelnummer = Integer.parseInt(input.nextLine());
        System.out.println("Artikelnummer: ");
        artikelnummer = Integer.parseInt(input.next());

        // verkaufspreis = Double.parseDouble(input.nextLine());
        System.out.println("Preis: ");
        verkaufspreis = Double.parseDouble(input.next());

    }


    public Artikel (String artikelbezeichnung, int artikelnummer, double verkaufspreis, lebensmittelgruppe gruppe) {
        this.artikelbezeichnung = artikelbezeichnung;
        this.gruppe = gruppe;
        this.verkaufspreis = verkaufspreis;
        this.artikelnummer = artikelnummer;
    }

    public double getPreis () {
        return verkaufspreis;
    }

    public void setPreis (double verkaufspreis) {
        this.verkaufspreis = verkaufspreis;
    }

    public String getArtikelbezeichnung() {
        return artikelbezeichnung;
    }

    public void setArtikelbezeichnung(String artikelbezeichnung) {
        this.artikelbezeichnung = artikelbezeichnung;
    }

    public void setartikelnummer(int artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public static void teuersterArtikel(Artikel[] artikel) {
        String teuersterArtikel = artikel[0].getArtikelbezeichnung();
        double hoechsterverkaufspreis = artikel[0].getPreis();

        for (int i = 1; i < artikel.length; i++) {
            if (artikel[i].getPreis() > hoechsterverkaufspreis) {
                hoechsterverkaufspreis = artikel[i].getPreis();
                teuersterArtikel = artikel[i].getArtikelbezeichnung();
            }

        }
        System.out.println(teuersterArtikel);
    }

    @Override
    public String toString () {
        return "Bezeichnung " + artikelbezeichnung + "\nLebenmittelgruppe (1 = Obst, 2 = Gemuese, 3 = Fleisch, 4 = Suesswaren): " + gruppe + "\nArtikelnummer: " + artikelnummer + "\nPreis: " + verkaufspreis + "\n";
    }
}
