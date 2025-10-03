import java.util.Random;

public class TypeB extends Thing{
    private static final Random rand = new Random();

    public TypeB(int row, int col, char color){
        super(row, col, color);
        isTypeB = true;
    }

    public void move(int round) {
        timeSinceLast++;
        if (timeSinceLast == 10) {
            timeSinceLast = 0;
            int i = rand.nextInt(3);
            if (i == 1) {
                rightTurn();
            }
            if (i == 2) {
                leftTurn();
            }

            stepForward();
        }
    }
}