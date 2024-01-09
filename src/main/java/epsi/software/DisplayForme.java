package epsi.software;

import epsi.software.Models.Line;
import epsi.software.Models.Pyramid;
import epsi.software.Models.IShape;
import epsi.software.Models.Square;

import java.util.ArrayList;
import java.util.List;

/**
 * Programme d'affichage de forme
 */
public class DisplayForme {
    public static void main(String[] args) {


        IShape line_5 = new Line("5");
        IShape line_8 = new Line(8, "8");
        IShape square = new Square(4, "4");
        IShape pyramid_5 = new Pyramid();
        IShape pyramid_6 = new Pyramid(6);

//        for (int i = 0; i < 3 ; i++) line_5.display();
//        for (int i = 0; i < 2 ; i++) line_8.display();
//        for (int i = 0; i < 4 ; i++) square.display();
//        for (int i = 0; i < 3 ; i++) pyramid_5.display();
//        for (int i = 0; i < 2 ; i++) pyramid_6.display();

        List<IShape> formes = new ArrayList<IShape>();
        formes.add(line_5);
        formes.add(line_8);
        formes.add(square);
        ShapeServer.dipslayShapeList(formes);
    }
}
