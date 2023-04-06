package entity;

public class Player {
    public String id;
    int currentPos;

    public Player(String id) {
        this.id = id;
        this.currentPos = 0;
    }
    void updatePosition(int num){
        this.currentPos+=num;
    }

    public int getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(int currentPos) {
        this.currentPos = currentPos;
    }
}
