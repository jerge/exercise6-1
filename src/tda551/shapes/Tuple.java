package tda551.shapes;

public final class Tuple {
    private final int x;
    private final int y;

    public Tuple( int x, int y ) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Tuple getPoint() {
        return new Tuple( x, y );
    }
}
