import java.util.Scanner;
public static void main(String[] args) {
    Scanner auswahl = new Scanner(System.in);
    Artikel[] artikel = new Artikel[4];
    System.out.println("Bitte 3 Artikel einflegen!");


    for (int i = 0; i < 3; i++) {
        artikel[i] = new Artikel();
    }

    // vierter Artikel über Konstruktor mit Parametern
    artikel[3] = new Artikel("Bounty", 4714, 2.19, lebensmittelgruppe.Suesswaren);


    int zahl;

    do {
        System.out.println("Was wünschen Sie zu tun?");
        System.out.println("1 = Ändern");
        System.out.println("2 = Ausgabe");
        System.out.println("3 = teuerster Artikel");
        System.out.println("4 = Ende");


        zahl = Integer.parseInt(auswahl.nextLine());
        System.out.println("Ihre Auswahl: " + zahl);



        if (zahl == 1) {
            System.out.println("Bezeichnung des Artikels eingeben?");
            String artikelplz = auswahl.nextLine();
            boolean gefunden = false;

            for (int i = 0; i < artikel.length; i++) {


                if (artikelplz.equals(artikel[i].getArtikelbezeichnung())) {
                    gefunden = true;
                    System.out.println("Neue Bezeichnung: ");
                    artikel[i].setArtikelbezeichnung(auswahl.nextLine());

                    System.out.println("Neuer Preis: ");
                    artikel[i].setPreis(Double.parseDouble(auswahl.nextLine()));
                    break;

                }

            }

            if (!gefunden) {
                System.out.println("Der Artikel existiert nicht! Bitte geben Sie einen Artikel ein, den Sie bereits in den Warenkorb gelegt haben!");
                // continue;
            }


        }
        else if (zahl == 2) {
            for (int i = 0; i < artikel.length; i++) {
                System.out.println(artikel[i]);
            }
            // continue;
        }
        else if (zahl == 3) {
            Artikel.teuersterArtikel(artikel);
            // continue;
        }
    }
    while (zahl != 4);

    System.out.println("Beehren Sie uns bald wieder! :D");

}
