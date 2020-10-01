package Models;

public class ShuffleCup {
    private Dice dice1;
    private Dice dice2;
    private int value;

    //Constructor
    public ShuffleCup(Dice dice1, Dice dice2){
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

    public void checkDouble(){
        boolean sametwo;
        if(dice1.getFaceValue()==dice2.getFaceValue()){
            sametwo = true;
        }
        else{
            sametwo = false;
        }
    }

    public int showRoll(){
        return value;
    }


}

