import entity.Cell;
import entity.Jump;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public Board(int boardSize, int numberOfSnakes , int numberOfLadders) {
        initializeCells(boardSize);
        addSnakesLadders(numberOfSnakes, numberOfLadders);
    }

    private void initializeCells(int boardSize) {
        this.cells = new Cell[boardSize][boardSize];
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                cells[i][j] = new Cell();
            }
        }
    }
    private void addSnakesLadders(int numberOfSnakes, int numberOfLadders) {
        while(numberOfSnakes>0){
            int head = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            int tail = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            if(tail>=head)continue;
            Jump snakeObj = new Jump(head,tail);
            Cell cell = getCell(head);
            cell.jump = snakeObj;
            numberOfSnakes--;
        }
        while(numberOfLadders>0){
            int head = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            int tail = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            if(head>=tail)continue;
            Jump ladderObj = new Jump(head,tail);
            Cell cell = getCell(head);
            cell.jump = ladderObj;
            numberOfLadders--;
        }
    }

    private Cell getCell(int pos) {
        int n = cells.length;
        int i = pos/n;
        int j = pos%n;
        return cells[i][j];
    }
}
