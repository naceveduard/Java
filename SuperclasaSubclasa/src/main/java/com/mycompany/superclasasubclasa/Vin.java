package com.mycompany.superclasasubclasa;


public class Vin extends Produs {
    
    public double taxaAlc;
    public final double taxaAlcProcent = 0.1;
    public double pretFinalVin;
    int volum = 1;
    
   
    Vin(String nume, int codBare, int pret, int volum){
        
        super(nume, codBare, pret);
        taxaAlc = pret*taxaAlcProcent;
        pretFinalVin = super.pretFinal+taxaAlc;
        
        
        

      }
    
    
}
