public abstract class Thing {
    protected int row;
    protected int col;
    protected int dir, 
    protected int timeSinceLast;
    protected char color;
    protected boolean isTypeB;
}

public Thing (int row, int col, char color) {
    this.row = row;
    this.col = col;
    this.color = color;
    this.dir = 0; 
    this.timeSinceLast = 0;
    this.isTypeB = false;
}

public abstract void move(int round);

public void print() {
    System.out.println(row + " " + col + " " + color);
}

protected void rightTurn() {
    dir = (dir + 1) % 4;
}

protected void leftTurn() {
    dir = (dir + 3) % 4;
}

protected void stepForward() {
    final int[] dr = {1, 0, -1, 0};
    final int[] dc = {0, 1, 0, -1};
    row += dr[dir];
    col += dc[dir];
}