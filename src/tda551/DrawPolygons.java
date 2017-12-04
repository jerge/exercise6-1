package tda551;

import tda551.adapter.*;

public class DrawPolygons {

  public static PolygonModel initPolygons() {
    PolygonModel polygons = new PolygonModel();

    polygons.addPolygon(PolygonFactory.createSquare(50, 50));
    polygons.addPolygon(PolygonFactory.createTriangle(100, 100));
    polygons.addPolygon(PolygonFactory.createRectangle(50, 150));

    return polygons;
  }

  public static void main(String[] args) {
    PolygonModel model = initPolygons();
    PolygonViewer view = new PolygonViewer(model);
    PolygonController controller = new PolygonController(model, view);

    controller.animate();
  }
}