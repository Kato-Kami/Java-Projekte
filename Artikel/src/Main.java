import java.util.Scanner;
public static void main(String[] args) {
    Scanner auswahl = new Scanner(System.in);
    Artikel[] artikel = new Artikel[4];
    System.out.println("Bitte 3 Artikel einflegen!");

    // Speichert die ersten drei Artikel per Benutzereingabe
    for (int i = 0; i < 3; i++) {
        artikel[i] = new Artikel();
    }

    // Vierter Artikel über Konstruktor mit Parametern
    artikel[3] = new Artikel("Bounty", 4714, 2.19, lebensmittelgruppe.Suesswaren);


    int zahl;

    // Menü wird solange angezeigt, bis der Benutzer vier Artikel eingegeben hat
    do {
        System.out.println("Was wünschen Sie zu tun?");
        System.out.println("1 = Ändern");
        System.out.println("2 = Ausgabe");
        System.out.println("3 = teuerster Artikel");
        System.out.println("4 = Ende");

        // Liest die Auswahl des Benutzers ein
        zahl = Integer.parseInt(auswahl.nextLine());
        System.out.println("Ihre Auswahl: " + zahl);


        // Auswahl 1: Artikel suchen und ändern
        if (zahl == 1) {
            System.out.println("Bezeichnung des Artikels eingeben?");
            String artikelplz = auswahl.nextLine();
            
            // Speichert, ob ein passender Artikel gefunden wurde
            boolean gefunden = false;

            for (int i = 0; i < artikel.length; i++) {

                // Durchsucht alle Artikel nach der eingegebenen Bezeichnung
                if (artikelplz.equals(artikel[i].getArtikelbezeichnung())) {
                    gefunden = true;
                    
                    //Liest neue Artikelbezeichnung ein
                    System.out.println("Neue Bezeichnung: ");
                    artikel[i].setArtikelbezeichnung(auswahl.nextLine());

                    //Liest neuen Preis ein
                    System.out.println("Neuer Preis: ");
                    artikel[i].setPreis(Double.parseDouble(auswahl.nextLine()));
                    break;

                }

            }

            // Falls kein Artikel mit der Bezeichnung gefunden wurde
            if (!gefunden) {
                System.out.println("Der Artikel existiert nicht! Bitte geben Sie einen Artikel ein, den Sie bereits in den Warenkorb gelegt haben!");
                // continue;
            }


        }

        // Auswahl 2: Gibt alle Artikel aus
        else if (zahl == 2) {
            for (int i = 0; i < artikel.length; i++) {
                System.out.println(artikel[i]);
            }
            // continue;
        }

        // Auswahl 3: Ermittelt den teuersten Artikel und gibt ihn danach aus
        else if (zahl == 3) {
            Artikel.teuersterArtikel(artikel);
            // continue;
        }
    }
    while (zahl != 4);

    // Auswahl 4: Beendet das Programm mit einer Nachricht an den User
    System.out.println("Beehren Sie uns bald wieder! :D");

}
