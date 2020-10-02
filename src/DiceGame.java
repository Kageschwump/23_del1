import Models.Player;
import Models.ShuffleCup;

import java.util.Scanner;

public class DiceGame {

    int wincondition = 40;
    boolean winWith2Pairs = false;

    public void createDiceGame()
    {
        Scanner input = new Scanner(System.in);
        GameManager game = new GameManager();
        System.out.print("Player 1 name: ");
        Player player1 = game.createPlayer(1, input.nextLine());
        System.out.print("Player 2 name: ");
        Player player2 = game.createPlayer(2, input.nextLine());
        ShuffleCup shuffleCup = game.createShuffleCup();


        while(true){

            playerturn(player1,shuffleCup);

            if(winWith2Pairs){
                System.out.println(player1.getName() + " WINS!");
                break;
            }

            if(gameOver(player1, shuffleCup))
            {
                System.out.println(player1.getName() + " WINS!");
                break;
            }

            playerturn(player2,shuffleCup);

            if(winWith2Pairs){
                System.out.println(player1.getName() + " WINS!");
                break;
            }

            if(gameOver(player2, shuffleCup))
            {
                System.out.println(player2.getName() + " WINS!");
                break;
            }

        }

    }

    public void playerturn(Player player, ShuffleCup shuffleCup)
    {
        System.out.println(player.getName() + "'s Score is: " + player.getScore());
        System.out.println("Press 'Enter' to roll");
        // We use the try catch method to handle any given exception, if values does not comply with read()
        try {
            System.in.read();
        } catch (Exception e)
        {
            System.out.println(e);
        }
        int roll = shuffleCup.roll();
        if(shuffleCup.getLastRoll()==12 && roll == 12){
            winWith2Pairs = true;
            return;
        }
        shuffleCup.setLastRoll(shuffleCup.getDice1().getFaceValue() + shuffleCup.getDice2().getFaceValue());
        player.updateScore(roll);
        shuffleCup.showRoll();


        // if a player hits a pair of ones, the player loses all their points
        if(shuffleCup.getDice1().getFaceValue() == 1 && shuffleCup.getDice2().getFaceValue() == 1) {
            player.setScore(0);
            System.out.println(player.getName() + " loses all of their points");
            System.out.println("-----------------------------------------------");
        }


        //If the player rolls a pair, the player gets another turn
        else if(checkSameCombination(shuffleCup) && !gameOver(player, shuffleCup)){
            System.out.println(player.getName() + " gets another turn!");
            playerturn(player, shuffleCup);
        }
        else {
            System.out.println(player.getName() + "'s new score is: " + player.getScore());
            System.out.println("-----------------------------------------------");
        }

    }

    //Checks if game is over, which it is if a players score is above 40 and the two dice are a pair
    public boolean gameOver(Player player, ShuffleCup shuffleCup)
    {
        if(player.getScore()>=wincondition&&checkSameCombination(shuffleCup))
        {
                return true;
        }

        return false;
    }

    //Checks if the dice are a pair
    public boolean checkSameCombination(ShuffleCup shuffleCup)
    {
        boolean sametwo;
        if(shuffleCup.getDice1().getFaceValue()==shuffleCup.getDice2().getFaceValue()){
            sametwo = true;
        } else {
            sametwo = false;
        }
        return sametwo;

    }

}
