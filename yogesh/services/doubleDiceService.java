

public class SingleDiceService implements DiceService{
    public int roll(){
        int dice1_outcome = new Random().nextInt(6) + 1;
        int dice2_outcome = new Random().nextInt(6) + 1;
        return dice1_outcome + dice2_outcome;
    }
}