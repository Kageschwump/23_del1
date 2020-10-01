import Models.Player;

import java.util.Scanner;

public class DiceGame {
    int wincondition = 40;
    public void createDiceGame()
    {
        Scanner input = new Scanner(System.in);
        GameManager game = new GameManager();
        game.createPlayer(1, input.nextLine());
        game.createPlayer(2, input.nextLine());
    }

    public void deleteScore()
    {

    }
    public boolean gameOver(Player player1, Player player2)
    {
        if(player1.getScore()>=wincondition){

            return true
        }

        if(player2.getScore()>=wincondition){
            return true
        }
    }
    public void extraTurn()
    {

    }
    public boolean checkSameCombination()
    {
        if(dice1.getFaceValue()==dice2.getFaceValue()){
            sametwo = true;
        }
        else{
            sametwo = false;
        }

    }

}
