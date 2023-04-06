import entity.Dice;
import entity.Player;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> players;
    Player winner;
    public Game(int boardSize, int numberOfSnakes , int numberOfLadders, int diceCount) {
        this.winner = null;
        this.players = new LinkedList<>();
        initializeGame(boardSize, numberOfSnakes, numberOfLadders, diceCount);
    }
    void initializeGame(int boardSize, int numberOfSnakes , int numberOfLadders, int diceCount){
        this.board = new Board(boardSize, numberOfSnakes, numberOfLadders);
        this.dice = new Dice(diceCount);
    }
    void addPlayer(String id){
        Player p =  new Player(id);
        players.add(p);
    }
    void startGame(){
        //get current turn player
        while(winner==null) {
            Player p = findPlayerTurn();
            System.out.println("Current Player is - " + p.id + " current pos " + p.getCurrentPos());
            int nums = this.dice.rollDice();
            int newPos = p.getCurrentPos() + nums;
            if (newPos == board.cells.length * board.cells.length - 1) {
                winner = p;
                System.out.println("Winner is - " + p.id);
                return;
            }
            if(newPos<board.cells.length * board.cells.length - 1)
                p.setCurrentPos(newPos);
        }
    }
    Player findPlayerTurn(){
        Player p = players.pollFirst();
        players.addLast(p);
        return p;
    }
}
