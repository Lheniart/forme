package epsi.software;

import epsi.software.Models.IShape;

import java.util.List;

public class ShapeServer {

    public static void dipslayShapeList(List<IShape> formes) {
        for (IShape f : formes) f.display();
    }

}
