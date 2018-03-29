package tef.tm42.krishtapovich;

import java.util.ArrayList;
import java.util.List;

class Model {
    private int numSet;
    private int lowerBound;
    private int upperBound;
    private int tries = 0;
    private final List<Integer> yourWay = new ArrayList<>();

    public int getNumSet() {
        return numSet;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public int getTries() {
        return tries;
    }

    public void setNumSet() {
        this.numSet = (int) Math.ceil(Math.random() *
                (upperBound - lowerBound - 1) + lowerBound);
    }

    public void setBounds(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public boolean checkValue(int numGuess) {
        yourWay.add(numGuess);
        tries++;
        if (numGuess == numSet) {
            return true;
        } else if (numGuess > numSet) {
            upperBound = numGuess;
        } else {
            lowerBound = numGuess;
        }
        return false;
    }

    public List<Integer> getYourWay() {
        return yourWay;
    }

}
