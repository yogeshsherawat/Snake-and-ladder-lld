

public class SnakeAndLadderServiceExecutor extends SnakeAndLadderService{

    Board board;
    int numberOfPlayers;
    Queue<Player> playerQueue;
    List<Ladder> ladderList;
    List<Snakes> snakeList;
    DiceService diceService;
    Stack<Player> winnersStack;
    PlayerService playerservice;

    public SnakeAndLadderServiceExecutor(){
        this.board = new Board(); // initially will be set to default parameters
        this.playerQueue = new Queue<Player>();
        this.ladderList = new List<Ladder>();
        this.snakeList =new List<Snake>();
        playerservice = new PlayerServiceExectuor();
        numberOfPlayers = 4;
        // initializing queue
        for(int i=1;i<=4;i++){
            this.playerQueue.add(new Player());
        }
    }

    public void setBoardSize(int size){
        this.board.setSize(size);
    }

    public void setSnakes(List<Snake> list){
        this.snakeList = list;
    }

    public void setLadders(List<Snake> list){
        this.ladderList = list;
    }
    public void setDiceService(DiceService anyDiceService){
        this.diceService = anyDiceService;
    }

    public void getCountFromDiceRoll(){
        return diceService.roll();
    }

    public void movePlayer(Player player, int diceValue){
        playerSerice.movePlayer(player,diceValue);
    }

    

    public void changeTurn(){
        this.playerQueue.add(this.playerQueue.poll());
    }

    public void playerHasWon(int position){
        return position==board.getSize();
    }

    public void checkGameStopCondition(){
        return this.playerQueue.size()<numberOfPlayers;
    }
    public void putQualifiedPlayerIntoRankTable(player){
        this.winnersStack.put(player)
    }


    public void startGame(){
        while(checkGameStopCondition()==false){
            Player player = this.playerQueue.peek();
            int diceValue = getCountFromDiceRoll();
            this.movePlayer(plyaer,diceValue);
            boolean checkWin = this.playerHasWon(player.position);
            if(checkWin){
                sout(player.getName() + "has won");
            }
            this.changeTurn();
        }
    }






}