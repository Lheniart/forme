package epsi.software;

import epsi.software.Models.Line;
import epsi.software.Models.Pyramid;
import epsi.software.Models.Square;

/**
 * Programme d'affichage de forme
 */
public class DisplayForme {
    public static void main(String[] args) {


        Line line_5 = new Line("5");
        Line line_8 = new Line(8, "8");
        Square square = new Square(4, "4");
        Pyramid pyramid_5 = new Pyramid();
        Pyramid pyramid_6 = new Pyramid(6);

        for (int i = 0; i < 3 ; i++) line_5.display();
        for (int i = 0; i < 2 ; i++) line_8.display();
        for (int i = 0; i < 4 ; i++) square.display();
        for (int i = 0; i < 3 ; i++) pyramid_5.display();
        for (int i = 0; i < 2 ; i++) pyramid_6.display();
    }
}