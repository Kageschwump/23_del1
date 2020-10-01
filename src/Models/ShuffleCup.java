package Models;

public class ShuffleCup {
    private Dice dice1;
    private Dice dice2;
    private int value;

    //Constructor
    public ShuffleCup(){
        Dice dice1 = new Dice(3);
        Dice dice2 = new Dice(3);
        this.dice1 = dice1;
        this.dice2 = dice2;

    }
    //rolls the dice
    public int roll() {
        dice1.setFaceValue(dice1.roll());
        dice2.setFaceValue(dice2.roll());
        value = dice1.getFaceValue() + dice2.getFaceValue();
        return value;

    }

    //checks if the 2 dice show the same value
    public void checkDouble(){
        boolean sametwo;
        if(dice1.getFaceValue()==dice2.getFaceValue()){
            sametwo = true;
        }
        else{
            sametwo = false;
        }
    }

    //getter
    public void showRoll(){
        System.out.println(dice1.getFaceValue() + " " + dice2.getFaceValue());;
    }


}

