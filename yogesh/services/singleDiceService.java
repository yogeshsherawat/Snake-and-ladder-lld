

public class SingleDiceService implements DiceService{
    public int roll(){
        return new Random().nextInt(6) + 1;
    }
}