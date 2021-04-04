//Write a Java program that lets the user enter 100 numerical values into an array and
//then creates two new arrays, pos and neg. Array pos should contain positive values,
//whereas array neg should contain the negative ones. The value 0 (if any) should not be
//added to either of the final arrays, pos or neg.
//Next, design the corresponding flowchart fragment only for that part of your program
//that creates the arrays pos and neg.

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        double[] positive = new double[10];
        double[] negative = new double[10];
        double[] array = new double[10];
        for(int i = 0; i<=array.length-1;i++){
            System.out.println("Enter a number:");
            array[i] = Double.parseDouble(line.readLine());
        }
        int pos_index=0;
        int neg_index=0;
        for(int i = 0; i<=array.length-1;i++){
            if(array[i]>0){
                positive[pos_index] = array[i];
                pos_index++;
            }else if(array[i]<=0){
                negative[neg_index] = array[i];
                neg_index++;
            }
        }
        System.out.println("Array with positive:");
        for(int i =0; i<=pos_index-1;i++){
            System.out.println(positive[i]);
        }
        System.out.println("Array with negative:");
        for(int i = 0; i<=neg_index-1;i++){
            System.out.println(negative[i]);
        }
    }
}
