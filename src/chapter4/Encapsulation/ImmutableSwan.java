package chapter4.Encapsulation;

public class ImmutableSwan {

    private int numOfEggs;

    public ImmutableSwan(int numOfEggs){
        this.numOfEggs = numOfEggs;
    }

    public int getNumOfEggs() {
        return numOfEggs;
    }
}
