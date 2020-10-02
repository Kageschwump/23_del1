package Models;

public class Dice {
    // Maximum face value
    private final int MAX = 6;

    // Current face value
    private int faceValue;

    // Constructor
    public Dice(int value) {
        faceValue = value;
    }

    // Throw die, return result
    public int roll() {
        faceValue = (int)(Math.random() * MAX) + 1;
        return faceValue;
    }

    // Setter
    public void setFaceValue (int value) {
        faceValue = value;
    }

    // Getter
    public int getFaceValue() {
        return faceValue;
    }

    // Return face value as a String
    public String toString() {
        String result = "you rolled: " + faceValue;
        return result;
    }

}




