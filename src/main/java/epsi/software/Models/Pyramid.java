package epsi.software.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Pyramid extends ShapeAbs implements IShape {


    private String symbole = "*";

    public Pyramid(int height) {
        super(height);
    }

    public Pyramid(int height, String symbole) {
        super(height);
        this.symbole = symbole;
    }

    @Override
    public void display() {
        System.out.println("Pyramide");
        for (int i = 1; i <= this.height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(this.symbole);
            }
            System.out.println();
        }
    }
}
