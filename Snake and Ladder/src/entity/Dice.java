package entity;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int count = 0, num =0;
        while(count<diceCount){
            num += ThreadLocalRandom.current().nextInt(1,6);
            //System.out.println("dice number: "+num);
            count++;
        }
        return num;
    }
}
