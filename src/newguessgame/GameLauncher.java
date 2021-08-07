package newguessgame;

public class GameLauncher {

    public static void main(String[] args) {

        GuessGame game = new GuessGame();

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        p1.setName("Tom");
        p2.setName("Gahee");
        p3.setName("Minhyeon");

        System.out.println("Guess Game Players are " + p1.getName() + ", " + p2.getName() + " and " + p3.getName() + "\n");

        game.startGame(p1, p2, p3);

    }
}
