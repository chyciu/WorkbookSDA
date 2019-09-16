package person;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Kowalski", Gender.MALE, 67, "64646565656");
        Person person2 = new Person("Alicja", "Nowak", Gender.FEMALE, 47, "887656677");
        Person person3 = new Person("Ola", "Jakubiak", Gender.FEMALE, 45, "767656544");
        Person person4 = new Person("Janina", "Dzik", Gender.FEMALE, 35, "65656574747");

        Person.hasReachedRetirementAge(person1);
        Person.hasReachedRetirementAge(person2);
        Person.hasReachedRetirementAge(person3);

       Person.ageDifference(person1, person2);
       Person.ageDifference(person2, person3);
       Person.ageDifference(person2, person1);
       Person.ageDifference(person4, person1);

        Person.howManyToRetire(person1);
        Person.howManyToRetire(person3);
        Person.howManyToRetire(person4);

    }

}
