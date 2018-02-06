package tda551.shapes;

import java.awt.*;

public interface IPoint {

    IPoint getPoint();

    IPoint move(int x, int y);

    int getX();
    int getY();
}
