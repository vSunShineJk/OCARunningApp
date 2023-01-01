package chapter4.LambdaExpression;

public class CheckIfHopper implements CheckTrait{
    public boolean test(Animal a){
        return a.canHop();
    }
}
