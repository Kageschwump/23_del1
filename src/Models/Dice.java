package Models;

public class Dice {
    private final int MAX = 6;  // maximum face value

    private int faceValue;  // Current face value

    // Constructor
    public Dice(int value) {
        faceValue = value;
    }

    // Throw die, return result
    public int roll() {
        faceValue = (int)(Math.random() * MAX) + 1;
        return faceValue;
    }

    // setter
    public void setFaceValue (int value) {
        faceValue = value;
    }

    // getter
    public int getFaceValue() {
        return faceValue;
    }

    // return face value as a String
    public String toString() {
        String result = "you rolled: " + faceValue;
        return result;
    }

}




