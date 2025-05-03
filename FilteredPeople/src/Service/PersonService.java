package Service;


import Models.Person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonService {
    Predicate<Person> isLegalAge = person -> person.getAge() >= 18;
    Predicate<Person> isLiveInCuliacan = person -> person.getCity().equals("Culiacán");
    Predicate<Person> isLiveInOaxaca = person -> person.getCity().equals("Oaxaca");


    public List<Person> getPersonsLiveInCity(List<Person> persons, String city) {
        return persons.stream().filter(isLiveInCuliacan).collect(Collectors.toList());
    }

    public List<Person> getPersonsByCityAndAge(List<Person> persons, String city, int age) {
        return persons.stream().filter(isLiveInOaxaca.and(isLegalAge)).collect(Collectors.toList());
    }
}
