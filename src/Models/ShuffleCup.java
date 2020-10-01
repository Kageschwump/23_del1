package Models;

public class ShuffleCup {
    Dice dice1;
    Dice dice2;
    int value;
    boolean sametwo;
    //Constructor
    public ShuffleCup(Dice dice1, Dice dice2){
        this.dice1 = dice1;
        this.dice2 = dice2;

    }

    public int roll() {
        dice1.setFaceValue(dice1.roll());
        dice2.setFaceValue(dice2.roll());
        value = dice1.getFaceValue() + dice2.getFaceValue();
        return value;

    }

    public void checkdouble(){
        if(dice1.getFaceValue()==dice2.getFaceValue()){
            sametwo = true;
        }
        else{
            sametwo = false;
        }
    }

    public int ShowRoll(){
        return value;
    }


}

