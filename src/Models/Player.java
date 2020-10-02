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

    //getter for players score
    public int getScore(){
        return score;
    }

    //getter for players name
    public String getName() {
        return name;
    }

    //setter for players score
    public void setScore(int value){
        score = value;
    }


}
