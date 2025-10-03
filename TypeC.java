public class TypeC extends Thing {
    private boolean toogle = true;

    public TypeC(int row, int col, char color) {
        super(row, col, color);
    }

    public void move (int round) {
        if (toggle) {
            row++;
            col++;
        }
        else{
            row++;
            col--;
        }

        toggle = !toggle;
    }
}