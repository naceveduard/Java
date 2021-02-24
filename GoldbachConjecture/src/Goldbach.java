import  java.util.*;

public class Goldbach {

    public static void main(String[] args) {

        int maxNr = 1100;
        int minNr = 700;
        ArrayList<Integer> evenNrList = new ArrayList<Integer>();
        ArrayList<Integer> primeNumbers = PrimeNumbers.getPrimeNumbers(maxNr);


        for(int i = minNr; i <= maxNr; i = i+2){
          evenNrList.add(i);
        }

        for(int i: evenNrList){
        //(int i = 0; i<evenNrList.size(); i++){
            for(int j: primeNumbers){
                if(j <= i-3){
                    if(primeNumbers.contains(i-j)){
                        int firstNumber = i-j;
                        System.out.println(i + "=" + firstNumber + "+" + j);
                        break;
                    }
                }
            }
        }
    }
    }




























