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


public class MainClass {
    public static void main(String [] args){


        String text="John.Davidson/05082004/Belgrade Michael.Barton/01011998/Krakov Ivan.Perkinson/23051986/Moscow Edi.Nacev/20072000/Bucuresti";

        List<Person> persoane = Person.personList(text);

        for(Person edi: persoane){

            System.out.println(edi.firstName + " " + edi.lastName + " " + edi.adress + " " + edi.birthday);
            System.out.println(" ");


        }




    }
}



