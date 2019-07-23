package lecion17_StreamApi;

import lecion17_StreamApi.interfaces.Choice;
import lecion17_StreamApi.objects.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        Person person1 = new Person("Наталья","Копчанова",58);
        Person person2 = new Person("Александр","Лушакенко",64);
        Person person3 = new Person("Николай","Лушакенко",14);
        Person person4 = new Person("Сергей","Рмуас",49);

        List<Person> bPeople = new ArrayList<>();
        bPeople.add(person1);
        bPeople.add(person2);
        bPeople.add(person3);
        bPeople.add(person4);

        Choice pm = (list)->{
            Iterator<Person> itr = list.iterator();
            String fullName = "Oops, something's gone wrong!";
            int age = 0;
            while(itr.hasNext()){
                Person p = itr.next();
                if(p.getAge()>age&&(p.getFirstName().length()+p.getLastName().length())<14){
                    age=p.getAge();
                    fullName = p.getFirstName()+" "+p.getLastName();
                }
            }
            return fullName;
        };

        System.out.println(pm.getPM(bPeople));
    }
}
