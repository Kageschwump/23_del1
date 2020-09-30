package Player;

public class Player {
    String name;
    int id;
    int score;

    //constructor
    public Player(int id, String name){
        this.name = name;
        this.id = id;
        this.score = 0;
    }

    //Method for updating players score
    public void UpdateScore(int CurrentFaceValue){
        score += CurrentFaceValue;
    }
}
