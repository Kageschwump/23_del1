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

        while(!gameOver(player1, player2))
        {
            System.out.println(player1.getName() +" Score is: " + player1.getScore());
            System.out.println("Press '1' to roll");
            if(input.nextInt() == 1)
            {
                int roll = shuffleCup.roll();
                player1.updateScore(roll);
                shuffleCup.showRoll();

            }

        }


    }

    public void deleteScore()
    {

    }
    public boolean gameOver(Player player1, Player player2)
    {
        if(player1.getScore()>=wincondition){



            return true;
        }

        if(player2.getScore()>=wincondition){
            return true;
        }
        return false;
    }
    public void extraTurn()
    {

    }
    /*public boolean checkSameCombination()
    {
        if(dice1.getFaceValue()==dice2.getFaceValue()){
            sametwo = true;
        }
        else{
            sametwo = false;
        }

    }*/

}
