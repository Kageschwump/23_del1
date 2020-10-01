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

        while(!gameOver(player1, player2, shuffleCup)) {

            System.out.println(player1.getName() + " Score is: " + player1.getScore());
            System.out.println("Press '1' to roll");
            if (input.nextInt() == 1) {                                             //Player 1's turn
                int roll = shuffleCup.roll();
                player1.updateScore(roll);
                shuffleCup.showRoll();
                System.out.println(player1.getName() + "'s new score is: " + player1.getScore());

            }

            System.out.println(player2.getName() + " Score is: " + player2.getScore());
            System.out.println("Press '2' to roll");
            if (input.nextInt() == 2) {                                             //Player 2's turn
                int roll = shuffleCup.roll();
                player2.updateScore(roll);
                shuffleCup.showRoll();
                System.out.println(player2.getName() + "'s new score is: " + player2.getScore());

            }

        }

    }

    public void deleteScore()
    {

    }

    //Checks if game is over, if a players score is above 40 and checks if dices are a pair
    public boolean gameOver(Player player1, Player player2, ShuffleCup shuffleCup)
    {
        if(player1.getScore()>=wincondition)
        {

            if(checkSameCombination(shuffleCup))
            {
                return true;
            }

        }

        if(player2.getScore()>=wincondition)
        {

            if(checkSameCombination(shuffleCup))
            {
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
