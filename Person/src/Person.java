public class Person {
    private String name;
    private int alter;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void verifiziereAlter() throws UngueltigesAlterException {
        if (alter < 0 || alter > 150) {
            throw new UngueltigesAlterException ("Das Alter darf nicht negativ, noch die Altersgrenze von 150 Jahren überschreiten.");
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Alter: " + alter;
    }

    public static void main(String[] args) {
        Person person = new Person("Hendrik", 23);


        try {
            person.verifiziereAlter();
            System.out.println("Dein Alter ist gültig");
            System.out.println(person);

        }
        catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }

}
