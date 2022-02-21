

class Board{
    private int size;
    private List<Snake> snakeList;
    private List<Ladder> ladderList;
    private Map<String,Integer> playerPieces;

    public Board(int size,List<Snake> snakeList, List<Ladder> ladderList, Map<String,Integer> playerPieces){
        this.size = size;
        this.snakeList = snakeList;
        this.ladderList = ladderList;
        this.playerPieces = playerPieces;
    }

    // board size exception
    // ladder exception 
    // snake exception
    // dice count exception
    

}