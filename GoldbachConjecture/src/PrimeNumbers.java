import java.util.ArrayList;

public class PrimeNumbers {

    public static ArrayList getPrimeNumbers(int numberToBeChecked){ //return an array list


        ArrayList<Integer> primeNumbersList = new ArrayList<Integer>();

        for (int num = 3; num <= numberToBeChecked; num=num+2)
        {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if ( isPrime == true )
                primeNumbersList.add(num);
        }

        return primeNumbersList;

    }
}
