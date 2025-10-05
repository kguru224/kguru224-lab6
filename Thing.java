import java.util.Random;

public abstract class Thing {
    protected int row;
    protected int col;
    protected int dir;
    protected char lab;

    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = 0; // start North
    }

    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    public void step() {
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        row += dr[dir];
        col += dc[dir];
    }


    public final void move(Random rand) {
        maybeTurn(rand);
        step();
    }

    public abstract void maybeTurn(Random rand);

    @Override
    public String toString() {
        return lab + "," + row + "," + col; 
}

}
