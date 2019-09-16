package person;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Kowalski", Gender.MALE, 67, "64646565656");
        Person person2 = new Person("Alicja", "Nowak", Gender.FEMALE, 47, "887656677");
        Person person3 = new Person("Ola", "Jakubiak", Gender.FEMALE, 45, "767656544");

        person1.hasReachedRetirementAge(person1);
        person2.hasReachedRetirementAge(person2);
        person3.hasReachedRetirementAge(person3);

    }

}
