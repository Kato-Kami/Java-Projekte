public class Person {
    
    // Eigenschaften einer Person
    private String name;
    private int alter;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    // Überprüft, ob das Alter im gültigen Bereich liegt (Alter nur zwischen 1 und 150 erlaubt)
    public void verifiziereAlter() throws UngueltigesAlterException {
        if (alter < 0 || alter > 150) {
            throw new UngueltigesAlterException ("Das Alter darf nicht negativ, noch die Altersgrenze von 150 Jahren überschreiten.");
        }
    }

    // Gibt die Eigenschaften der Person als Text zurück
    @Override
    public String toString() {
        return "Name: " + name + ", Alter: " + alter;
    }

    public static void main(String[] args) {
        Person person = new Person("Hendrik", 23);


        try {
            person.verifiziereAlter();

            // Wird nur ausgeführt, wenn keine Exception auftritt
            System.out.println("Dein Alter ist gültig");
            System.out.println(person);

        }

        // Fehlermeldung ausgeben, falls eine Exception aufgetreten ist
        catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }

}
