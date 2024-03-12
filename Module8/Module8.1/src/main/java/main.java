import java.util.*;
import java.util.Comparator;
public class main{

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Hannu", 20, "Helsinki"));
        persons.add(new Person("Pekka", 23, "Vantaa"));
        persons.add(new Person("Matti", 25, "Espoo"));
        persons.add(new Person("Kalle", 28, "Korso"));

        persons.sort(Comparator.comparingInt(Person::getAge));
        for(Person person : persons){
            System.out.println("Names in ascending order: "+ person.getName()+ " age: "+ person.getAge());
        }
    }
}