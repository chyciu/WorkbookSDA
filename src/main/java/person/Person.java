package person;

public class Person {

    private String name;
    private String surname;
    private Gender gender;
    private int age;
    private String pesel;

    public Person(String name, String surname, Gender gender, int age, String pesel) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.pesel = pesel;
    }

    public static void hasReachedRetirementAge (Person person) {

        if (person.gender.equals(Gender.MALE) && person.age >= 65) {
            System.out.println(person.name + " " + person.surname + ": wiek emerytalny jest osiagnięty.");
        } else if (person.gender.equals(Gender.FEMALE) && person.age >= 60) {
            System.out.println(person.name + " " + person.surname + ": wiek emerytalny jest osiagnięty.");
        }else {
            System.out.println(person.name + " " + person.surname + ": wiek emerytalny NIE jest osiągniety.");
        }
    }

    public static void ageDifference (Person person, Person personA) {

        int ageDiff = person.age - personA.age;

        if (ageDiff == 1) {
            System.out.println("Różnica wieku pomiędzy: " + person.name + " " + person.surname+
                    " " + "oraz " + personA.name + " " + personA.surname + " wynosi " + Math.abs(ageDiff) + " rok.");
        } else if (ageDiff == 2 || ageDiff == 3 || ageDiff == 4) {
            System.out.println("Różnica wieku pomiędzy: " + person.name + " " + person.surname+
                    " " + "oraz " + personA.name + " " + personA.surname + " wynosi " + Math.abs(ageDiff) + " lata.");
        } else {
            System.out.println("Różnica wieku pomiędzy: " + person.name + " " + person.surname+
                    " " + "oraz " + personA.name + " " + personA.surname + " wynosi " + Math.abs(ageDiff) + " lat.");
        }
    }

    public static void howManyToRetire (Person person) {

        int maleRetire = 65;
        int femaleRetire = 60;
        int howMany;

        if (person.gender.equals(Gender.MALE)) {
            howMany = maleRetire - person.age;
                if (howMany > 0) {
                    System.out.println(person.name + " " + person.surname + ": " + " do emerytury brakuje " + howMany + " lat.");
                } else {
                    System.out.println(person.name + " " + person.surname + ": " + " osoba osiągnęła już wiek emerytalny.");
                }
        } else if (person.gender.equals(Gender.FEMALE)) {
            howMany = femaleRetire - person.age;
            if (howMany > 0) {
                System.out.println(person.name + " " + person.surname + ": " + " do emerytury brakuje " + howMany + " lat.");
            } else {
                System.out.println(person.name + " " + person.surname + ": " + " osoba osiągnęła już wiek emerytalny.");
            }
        }
    }
}



//• Stwórz klasę person.Person
//        ◦ dodaj pola: name, surname, gender, age, pesel
//        ◦ dodaj metodę sprawdzającą, czy dana osoba osiągnęła wiek emerytalny (np.
//        hasReachedRetirementAge()); dla kobiet wiek emerytalny przyjmijmy >=60 lat, a dla mężczyzn >=65 lat
//        ◦ dodaj metodę zwracającą różnicę wieku pomiędzy daną osobą a inną osobą
//        ▪ niech metoda przyjmuje parametr typu person.Person
//        ▪ niech nie zwraca wartości ujemnych jako różnicy lat
//        ◦ dodaj metodę, która wylicza i zwraca, ile lat brakuje do emerytury
