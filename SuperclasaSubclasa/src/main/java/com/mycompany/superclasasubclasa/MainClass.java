
package com.mycompany.superclasasubclasa;


public class MainClass {
    
    public static void main(String [] args) {
    
        
        Vin panciu = new Vin("panciu" , 200700 , 10, 1);
        Ciocolata milka = new Ciocolata("milka" , 220996, 5, 0.3);
        
        System.out.println("Ciocolata");
        System.out.println("Nume:" + " " + milka.nume);
        System.out.println("Cod de bare" + " " + milka.codBare);
        System.out.println("Pret" + " " + milka.pret + " " + "Lei");
        System.out.println("Pretul final" + " " + milka.pretFinal + " " + "Lei");
        System.out.println("Greutate:" + " " + milka.greutate + "g");
        
        System.out.println("Vin");
        System.out.println("Nume:" + " " + panciu.nume);
        System.out.println("Cod de bare" + " " + panciu.codBare);
        System.out.println("Pret" + " " + panciu.pret + " " + "Lei");
        
        System.out.println("Taxa Alcool" + " " + panciu.taxaAlc + " " + "Leu");
        System.out.println("Pretul cu TVA, fara taxa alcool" + " " + panciu.pretFinal +" " + "Lei");
        System.out.println("Pretul final" + " " + panciu.pretFinalVin +" " + "Lei");
        System.out.println("Volum:" + " " + panciu.volum + "L");

        
    }
    
}
