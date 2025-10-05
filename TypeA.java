import java.util.Random;

public class TypeA extends Thing {
    public TypeA(int row, int col, char lab) {
        super(row, col, lab);
    }

    @Override
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3); // 0=straight,1=right,2=left
        if (i == 1) rightTurn();
        else if (i == 2) leftTurn();
    }
}
