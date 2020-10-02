package Models;

public class ShuffleCup {
    private Dice dice1;
    private Dice dice2;
    private int value;
    private int lastRoll;

    //Setter for lastRoll
    public void setLastRoll(int lastRoll) {
        this.lastRoll = lastRoll;
    }

    //getter for lastRoll
    public int getLastRoll() {
        return lastRoll;
    }

    //Constructor
    public ShuffleCup(){
        Dice dice1 = new Dice(3);
        Dice dice2 = new Dice(3);
        this.dice1 = dice1;
        this.dice2 = dice2;

    }
    //Rolls the dice
    public int roll() {
        dice1.setFaceValue(dice1.roll());
        dice2.setFaceValue(dice2.roll());
        value = dice1.getFaceValue() + dice2.getFaceValue();
        return value;

    }

    //Prints the face value of the 2 dice
    public void showRoll(){
        System.out.println(dice1.getFaceValue() + " " + dice2.getFaceValue());;
    }

    //Getter for dice1
    public Dice getDice1() {
        return dice1;
    }

    //Getter for dice 2
    public Dice getDice2() {
        return dice2;
    }


}

