//Write a Java program that displays all four-digit integers that satisfy all of
//the following conditions:
// the number’s first digit is greater than its second digit
// the number’s second digit is equal to its third digit
// the number’s third digit is smaller than its fourth digit
//For example, the values 7559, 3110, and 9889 are such numbers.


public class Main {
    public static void main(String[]args){
        int validNum, r;

        int digit1, digit2, digit3, digit4;

        for(int i = 1000; i<=9999; i++){
            digit1 = i%10;
            r= i/10;
            digit2 = r%10;
            r = r/10;
            digit3 = r%10;
            digit4 =r/10;

            if(digit1 > digit2 && digit2 == digit3 && digit3 < digit4){
                validNum = i;
                System.out.println(validNum);
            }
        }
    }
}
