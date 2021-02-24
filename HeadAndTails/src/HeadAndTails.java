import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeadAndTails {
    public static void main(String[] args) throws IOException {

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in), 1);
        String line = "";
        String  predictieRezultat;
        String toss;
        String result;
        String player1 = "Player One ";
        String player2 = "Player Two ";
        int tosses = 1;
        int numberGames=0;
        int scorePlayer1=0;
        int scorePlayer2=0;
        double procent1=0;
        double procent2=0;
        do {
            if(tosses == 1){
                System.out.println("Choose the number of games");
                numberGames = Integer.parseInt(keyboard.readLine());
            }

            double rand = Math.random();
           System.out.println(player1 + " toss the coin, "  + player2 + " guess");
           System.out.println(player2 + " add what you think it will be:");
           predictieRezultat = keyboard.readLine();
           System.out.println(player1 + " press Enter to toss the coin ");
            toss = keyboard.readLine();

            if (rand < 0.5) {
                result = "head";
                System.out.println("Head");
            } else {
                result = "tails";
                System.out.println("Tails");
            }
            if(predictieRezultat.equals(result)){
                System.out.println(player2 + " won");
                if(player2.equals("Player Two ")){
                    scorePlayer2++;
                }else{
                    scorePlayer1++;
                }
                player1 = player1 + player2;
                player2 = player1.substring(0, player1.length() - player2.length());
                player1 = player1.substring(player2.length());
            }else{
                if(player2.equals("Player Two ")){
                    scorePlayer1++;
                }else{
                    scorePlayer2++;
                }
                System.out.println(player2 + " lost");
            }
            System.out.println("Do you want to cointinue? (yes/no)?");
            line = keyboard.readLine();
            tosses++;
            procent1 = 100*scorePlayer1/numberGames;
            procent2 = 100*scorePlayer2/numberGames;
        }while(line.equals("yes") && tosses<=numberGames);
        System.out.println("Player 1 score:" + scorePlayer1 + " Procent: " + procent1);
        System.out.println("Player 2 score:" + scorePlayer2 + " Procent: " + procent2);
        }


    }

