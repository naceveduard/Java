import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import java.util.function.Supplier;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Person {

    public String firstName;
    public String lastName;
    public String birthday;
    public String adress;

    Person(String firstName, String lastName, String birthday, String adress) {  //new object created, with 4 parameters

        this.firstName = firstName; //calling the variable and equals with parameters
        this.lastName = lastName; 
        this.birthday = birthday;
        this.adress = adress;

    }

    public static List<Person> personList(String text) { // this is the method

        List<Person> personToReturn = new ArrayList<Person>();
        //creating a list of persons wich got the string from the text (main class), 
        //this list is created to stock the persons
        String[] stringPersons = text.split(" "); //indicated where to split the text (at space)

        for (int i = 0; i < stringPersons.length; i++) { //going trough all the splited persons

            String[] personsDetails = stringPersons[i].split("\\.|/"); //split again by dot and slash

            int x = 0;

            String stringtoDate = personsDetails[x + 2];


            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
            LocalDate date = LocalDate.parse(stringtoDate, formatter);

            DateTimeFormatter fOut = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
            String output = date.format(fOut);

            Person personToAdd = new Person(personsDetails[x], personsDetails[x + 1], output, personsDetails[x + 3]); //cream o persoana de tipul celei de sus , ii dam parametrii(cei pe care i am primit de la text)
            personToReturn.add(personToAdd);//adding the person in a list of persons


        }
        return personToReturn;

    }
}
