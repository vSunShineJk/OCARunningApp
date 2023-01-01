package chapter4.Encapsulation;

public class Swan {

    private int numOfEggs; // private

    public int getNumOfEggs(){ // getter
        return numOfEggs;
    }

    private void setNumOfEggs(int numOfEggs){ // setter
        if (numOfEggs >= 0) // guard condition
            this.numOfEggs = numOfEggs;
    }

}
