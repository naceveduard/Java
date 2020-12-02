 package com.mycompany.superclasasubclasa;


public class Produs {
    
    public String nume;
    public int codBare;
    public int pret;
    public final double taxa= 20/100;
    public double pretFinal;
    
    Produs(String nume, int codBare, int pret){
        
        this.nume=nume;
        this.codBare=codBare;
        this.pret=pret;
        pretFinal= pret+pret*20/100;
        
        
    }
    
    }
    

