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

    public void hasReachedRetirementAge (Person person) {

        if (person.gender.equals(Gender.MALE) && person.age >= 65) {
            System.out.println(person.name + " " + person.surname + " :wiek emerytalny jest osiagnięty.");
        } else if (person.gender.equals(Gender.FEMALE) && person.age >= 60) {
            System.out.println(person.name + " " + person.surname + " :wiek emerytalny jest osiagnięty.");
        }else {
            System.out.println(person.name + " " + person.surname + " :wiek emerytalny NIE jest osiągniety.");
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
