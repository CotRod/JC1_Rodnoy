package lection17_StreamApi;

import lection17_StreamApi.objects.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        Person person1 = new Person("Наталья", "Копчанова", 58);
        Person person2 = new Person("Александр", "Лушакенко", 64);
        Person person3 = new Person("Николай", "Лушакенко", 14);
        Person person4 = new Person("Сергей", "Рмуас", 49);

        List<Person> bPeople = new ArrayList<>();
        bPeople.add(person1);
        bPeople.add(person2);
        bPeople.add(person3);
        bPeople.add(person4);

        System.out.println(bPeople.stream()
                .filter(person -> person.getLastName().length() + person.getFirstName().length() < 15)
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(new Person()));
    }
}
