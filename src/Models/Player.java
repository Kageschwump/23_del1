package Models;

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
    public void updateScore(int CurrentFaceValue){
        score += CurrentFaceValue;
    }

    public int getScore(){
        return score;
    }

    public String getName() {
        return name;
    }

    public void setScore(int value){
        score = value;
    }


}
