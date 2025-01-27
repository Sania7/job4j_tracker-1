package job4j.collection;

import java.util.ArrayList;


// 1. Телефонный справочник на базе ArrayList [#41598 #117265]
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (person.getName().contains(key)
            || person.getSurname().contains(key)
            || person.getPhone().contains(key)
            || person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}
