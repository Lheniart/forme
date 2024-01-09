package epsi.software;

import epsi.software.Models.IShape;

import java.util.List;

public class ShapeServer {
    public static void displayList(List<IShape> formes) {
        for (IShape f : formes){
            f.display();
            System.out.println();

        }

    }
}
