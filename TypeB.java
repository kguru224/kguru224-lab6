import java.util.Random;

public class TypeB extends Thing {
    private int timeSinceLast;

    public TypeB(int row, int col, char lab) {
        super(row, col, lab);
        this.timeSinceLast = 1; // first turn after 10 moves
    }

    @Override
    public void maybeTurn(Random rand) {
        if (timeSinceLast == 10) {
            timeSinceLast = 1; // reset
            int i = rand.nextInt(3);
            if (i == 1) rightTurn();
            else if (i == 2) leftTurn();
        } else {
            timeSinceLast++;
        }
    }
}
