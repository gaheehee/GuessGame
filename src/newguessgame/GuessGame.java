package newguessgame;

public class GuessGame {

    private Player p1;
    private Player p2;
    private Player p3;

    public void startGame(Player a, Player b, Player c) {

        p1 = a;
        p2 = b;
        p3 = c;

        p1.pickNumber();
        p2.pickNumber();
        p3.pickNumber();
        System.out.println();
        System.out.println("Let's start!\n");

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        while (!(p3isRight || p2isRight || p3isRight)) {

            if (!(p1isRight || p2isRight)) {

                System.out.println("Let's guess Tom's number.");
                p2isRight = p1.askToGuess(p1, p2);
                p3isRight = p1.askToGuess(p1, p3);
                System.out.println();

            }

            if (!(p2isRight || p3isRight)) {

                System.out.println("Let's guess Gahee's number.");
                p3isRight = p2.askToGuess(p2, p3);
                p1isRight = p2.askToGuess(p2, p1);
                System.out.println();

            }

            if (!(p3isRight || p1isRight)) {

                System.out.println("Let's guess Minhyeon's number.");
                p1isRight = p3.askToGuess(p3, p1);
                p2isRight = p3.askToGuess(p3, p2);
                System.out.println();

            }

            if(p1isRight) {
                System.out.println(p1.getName() + " got it right. ");
            }
            if(p2isRight) {
                System.out.println(p2.getName() + " got it right. ");
            }
            if (p3isRight) {
                System.out.println(p3.getName() + " got it right.");
            }
        }
    }
}
