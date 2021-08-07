package newguessgame;

public class Player {
    private int number;
    private String name;
    private int myPick;

    public void guess( Player p) {
        number = (int)(Math.random() * 10);
        System.out.println(name + " is guessing " + number + " about " + p.getName() + ".");
    }

    public int getNumber() {
        return number ;
    }

    public boolean setName(String n) {
        if(n == null)
            return false;
        name = n ;
        return true;
    }

    public String getName() {
        return name;
    }

    public void pickNumber() {

        myPick= (int)(Math.random() * 10);
        System.out.println(name + " has picked " + myPick);
    }

    public boolean askToGuess(Player self, Player theOther) {
        theOther.guess(self);
        int n = theOther.getNumber();
        if (n == myPick) {
            return true;
        }
        return false;
    }
}
