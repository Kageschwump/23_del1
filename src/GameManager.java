import Models.*;

public class GameManager {



    public void readPlayerScore(Player player)
    {
        System.out.println("Your score: " + player.getScore());
    }

    public Player createPlayer(int id, String name)
    {
        Player player = new Player(id,name);
        return player;
    }

    public ShuffleCup createShuffleCup()
    {
        ShuffleCup shufflecup = new ShuffleCup();
        return shufflecup;
    }

}
