import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ruleta {

    public static void main(String[] args) throws IOException {

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in), 1);
        String line = "";
        String choice = "";
        String forWhile="";
        int wallet = 50;
        int bet = 1;
        String exactNr="";
        do {
                System.out.println("What`s your choice? Even, odd or exact number?");
            choice = keyboard.readLine();
                int roulleteVal = startRotate();

                if (choice.equals("exact number")) {
                    System.out.println("Add the number (0-35)");
                    exactNr = keyboard.readLine();
                    System.out.println("The number returned by the roullete: " + roulleteVal);

                    if (Integer.parseInt(exactNr) == roulleteVal) {
                        wallet = wallet + 35;
                        System.out.println("You won!! Your wallet has the value:" + wallet);
                    } else {
                        wallet = wallet - bet;
                        System.out.println("You lost!! Your wallet has the value:" + wallet);
                    }
                }
                if(choice.equals("even") || choice.equals("odd")) {
                    System.out.println("The number returned by the roullete: " + roulleteVal);

                    if ((choice.equals("even") && roulleteVal % 2 == 0) || (choice.equals("odd") && roulleteVal % 2 != 0)) {
                        wallet = wallet + bet;
                        System.out.println("You won! Your wallet has the value:" + wallet);
                    } else {
                        wallet = wallet - bet;
                        System.out.println("You lost! Your wallet has the value:" + wallet);
                    }
                }
            System.out.println("Play again? (yes/no)");
            forWhile = keyboard.readLine();
            if(forWhile.equals("no")){
                System.out.println("You left the game with sum:" + wallet);
            }
        }while(forWhile.equals("yes") || forWhile.equals("YES"));
    }

    public static int startRotate() {

        int rand = 0;
        int min = 0;
        int max = 35;
        int range = max - min;

        for (int i = 0; i <= max; i++) {
            rand = (int) (Math.random() * range);
            break;
        }
        return rand;
    }
}


