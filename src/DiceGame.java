import Models.Player;
import Models.ShuffleCup;

import java.util.Scanner;

public class DiceGame {

    int wincondition = 40;

    public void createDiceGame()
    {
        Scanner input = new Scanner(System.in);
        GameManager game = new GameManager();
        System.out.print("Player 1 name: ");
        Player player1 = game.createPlayer(1, input.nextLine());
        System.out.print("Player 2 name: ");
        Player player2 = game.createPlayer(2, input.nextLine());
        ShuffleCup shuffleCup = game.createShuffleCup();


        while(!gameOver(player2, shuffleCup)) {

            playerturn(player1,shuffleCup);

            if(gameOver(player1, shuffleCup))
            {
                break;
            }

            playerturn(player2,shuffleCup);

        }

    }

    public void playerturn(Player player, ShuffleCup shuffleCup)
    {
        System.out.println(player.getName() + " Score is: " + player.getScore());
        System.out.println("Press 'Enter' to roll");
        // We use the try catch method to handle any given exception, if values does not comply with read()
        try {
            System.in.read();
        } catch (Exception e)
        {
            System.out.println(e);
        }
        int roll = shuffleCup.roll();
        player.updateScore(roll);
        shuffleCup.showRoll();
        System.out.println(player.getName() + "'s new score is: " + player.getScore());
    }

    public void deleteScore()
    {

    }

    //Checks if game is over, if a players score is above 40 and checks if dices are a pair
    public boolean gameOver(Player player, ShuffleCup shuffleCup)
    {
        if(player.getScore()>=wincondition)
        {

            if(checkSameCombination(shuffleCup))
            {
                System.out.println(player.getName() + " WINS!");
                return true;

            }

        }

        return false;
    }

    public void extraTurn()
    {

    }
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
