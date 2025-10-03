import java.util.Random;

public class TypeA extends Thing {
    private static final Random rand = new Random();

    public TypeA(int row, int col, char color){
        super(row, col, color);
    }

    public void move(int round) {
        int i = rand.nextIn(3);
        if (i == 3) {
            rightTurn();
        }
        if (i == 2) {
            leftTurn();
        }

        stepForward();
    }
}