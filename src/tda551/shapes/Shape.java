package tda551.shapes;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {
    private Point centerPoint;
    private int scaleX = 10;
    private int scaleY = 10;
    private double rotation = 0; // Degrees clockwise

    public Point getCenterPoint() {
        return new Point( centerPoint );
    }

    public int getScaleX() {
        return scaleX;
    }

    public int getScaleY() {
        return scaleY;
    }

    public double getRotation() {
        return rotation;
    }

    private Shape( Point center ) {
        this.centerPoint = new Point( center );
    }

    public Shape( int x, int y ) {
        this( new Point( x, y ) );
    }

//    public Shape translate( int x, int y ) {
//        return (centerPoint.move( centerPoint.x + x, centerPoint.y + y ));
//    }

    public void scale( int x, int y ) {
        this.scaleX = scaleX * x;
        this.scaleY = scaleY * y;
    }

    public void rotate( double angle ) {
        this.rotation = rotation + angle;
    }

    public abstract void paint( Graphics g );

//    protected abstract <T extends Shape> T copy();

}