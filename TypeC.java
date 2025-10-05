import java.util.Random;

public class TypeC extends Thing {
    private boolean left = true;

    public TypeC(int row, int col, char lab) {
        super(row, col, lab);
    }
    @Override
    public void maybeTurn(Random rand) {
        if (left) leftTurn();
        else rightTurn();
        left = !left;
    }
}
