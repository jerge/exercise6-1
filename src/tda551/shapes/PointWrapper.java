package tda551.shapes;

import java.awt.*;

public final class PointWrapper implements IPoint {
    private Point wrappee;

    public PointWrapper( int x, int y ) {
        wrappee = new Point( x, y );
    }

//    public PointWrapper( IPoint point ) {
//        wrappee = new Point( point.getX(), point.getY() );
//    }

    private PointWrapper( Point point ) {
        wrappee = new Point( point.x, point.y );
    }

    public int getX() {
        return wrappee.x;
    }

    public int getY() {
        return wrappee.y;
    }

    @Override
    public IPoint getPoint() {
        return new PointWrapper( wrappee );
    }

    @Override
    public IPoint move( int x, int y ) {
        return new PointWrapper( wrappee.x + x, wrappee.y + y );
    }
}
