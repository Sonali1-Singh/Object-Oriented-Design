public class Main {
    public static void main(String[] args) {
        Game g = new Game(10,4,5, 2);
        g.addPlayer("Subhi");
        g.addPlayer("Prateek");
        g.addPlayer("Nidhi");
        g.addPlayer("Nupur");
        g.startGame();
    }
}