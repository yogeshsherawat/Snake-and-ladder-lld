

public class PlayerServiceExectuor{



    public void movePlayer(Player player, int diceValue){
        int currentPosition = player.getPosition();
        newPosition = position + diceValue;
        // i did not think the part where player can go beyond board size
        // so adding now after seeing
        if(newPosition>board.getSize())
        sout("can't go ahead");
        newPosition = checkIfLadderTailOrSnakeHead(newPosition);
        player.setPosition = newPosition;
    }

    public int checkIfLadderTailOrSnakeHead(position){
        for(Ladder ladder:ladderList){
            // some code here
        }
        for(Snake snake:snakeList){
            // some code here
        }
        return position;
    }
}
