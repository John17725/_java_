import Models.Person;
import Enums.Gender;
import Service.PersonService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            PersonService personService = new PersonService();
            List<Person> persons = new ArrayList<>(List.of(
                    new Person("Jesus", 25, Gender.MALE, "jesus@gmail.com", "Ciudad de México"),
                    new Person("Maria", 30, Gender.FEMALE, "maria30@hotmail.com", "Guadalajara"),
                    new Person("Carlos", 22, Gender.MALE, "carlos22@yahoo.com", "Monterrey"),
                    new Person("Ana", 28, Gender.FEMALE, "ana_28@gmail.com", "Puebla"),
                    new Person("Luis", 35, Gender.MALE, "luis@outlook.com", "Toluca"),
                    new Person("Fernanda", 27, Gender.FEMALE, "fer.nanda@gmail.com", "Querétaro"),
                    new Person("Miguel", 31, Gender.MALE, "miguelito31@gmail.com", "León"),
                    new Person("Sofia", 24, Gender.FEMALE, "sofia.love@hotmail.com", "Tijuana"),
                    new Person("Jorge", 29, Gender.MALE, "jorge.mtz@gmail.com", "Cancún"),
                    new Person("Valeria", 26, Gender.FEMALE, "val.valeria@yahoo.com", "Naucalpan"),
                    new Person("Eduardo", 33, Gender.MALE, "ed.garcia@gmail.com", "Aguascalientes"),
                    new Person("Lucia", 21, Gender.FEMALE, "lucia21@hotmail.com", "Chihuahua"),
                    new Person("Andres", 36, Gender.MALE, "andres_theman@gmail.com", "Saltillo"),
                    new Person("Paola", 23, Gender.FEMALE, "paola.23@outlook.com", "Veracruz"),
                    new Person("Rafael", 38, Gender.MALE, "rafa_38@gmail.com", "Morelia"),
                    new Person("Camila", 25, Gender.FEMALE, "camila.luna@gmail.com", "San Luis Potosí"),
                    new Person("Diego", 32, Gender.MALE, "diego.32@gmail.com", "Culiacán"),
                    new Person("Daniela", 29, Gender.FEMALE, "dani_29@hotmail.com", "Hermosillo"),
                    new Person("Sebastian", 27, Gender.MALE, "sebas27@gmail.com", "Villahermosa"),
                    new Person("Brenda", 34, Gender.FEMALE, "brenda.34@yahoo.com", "Xalapa"),
                    new Person("Oscar", 40, Gender.MALE, "oscar_40@live.com", "Mazatlán"),
                    new Person("Alejandra", 28, Gender.FEMALE, "alejandra28@gmail.com", "Cuernavaca"),
                    new Person("Ivan", 26, Gender.MALE, "ivan.mtz@gmail.com", "Colima"),
                    new Person("Mariana", 22, Gender.FEMALE, "mariana22@outlook.com", "Tepic"),
                    new Person("Hector", 30, Gender.MALE, "hector_30@hotmail.com", "Veracruz"),
                    new Person("Patricia", 37, Gender.FEMALE, "paty_37@gmail.com", "La Paz"),
                    new Person("Armando", 33, Gender.MALE, "armando33@yahoo.com", "Torreón"),
                    new Person("Claudia", 24, Gender.FEMALE, "claudia.c@gmail.com", "Oaxaca"),
                    new Person("Julio", 29, Gender.MALE, "julio_29@gmail.com", "Oaxaca"),
                    new Person("Veronica", 31, Gender.FEMALE, "vero_31@outlook.com", "Oaxaca"),
                    new Person("Alberto", 35, Gender.MALE, "alberto35@hotmail.com", "Ensenada"),
                    new Person("Lorena", 27, Gender.FEMALE, "lorena_27@gmail.com", "Torreón"),
                    new Person("Ricardo", 23, Gender.MALE, "ricardo_23@gmail.com", "Celaya"),
                    new Person("Martha", 36, Gender.FEMALE, "martha36@yahoo.com", "Pachuca"),
                    new Person("Francisco", 38, Gender.MALE, "frankie38@gmail.com", "Acapulco"),
                    new Person("Isabel", 25, Gender.FEMALE, "isabel_25@outlook.com", "Texcoco"),
                    new Person("Raul", 34, Gender.MALE, "raul_34@hotmail.com", "Ciudad Juárez"),
                    new Person("Carla", 28, Gender.FEMALE, "carla28@gmail.com", "Texcoco"),
                    new Person("Adrian", 30, Gender.MALE, "adrian30@gmail.com", "Naucalpan"),
                    new Person("Natalia", 26, Gender.FEMALE, "natalia.26@live.com", "Texcoco")
            ));
            List<Person> peopleLiveInCuliacan = personService.getPersonsLiveInCity(persons, "Culiacán");
            System.out.println(peopleLiveInCuliacan.size()+" Live in Culiacán");

            System.out.println("Get people live in Oaxaca and have than 18 years");
            List<Person> peopleOaxa = personService.getPersonsByCityAndAge(persons, "Oaxaca", 18);
            System.out.println(peopleOaxa.size()+" peoples live in Oaxaca");
            peopleOaxa.forEach(person -> {
                System.out.println(person.toString());
            });


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}