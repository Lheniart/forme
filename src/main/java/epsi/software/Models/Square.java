package epsi.software.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Square extends ShapeAbs implements IShape {
    private String symbole = "*";

    public Square(int height) {
        super(height);

    }

    public Square(int height, String symbole) {
        super(height);
        this.symbole = symbole;
    }

    @Override
    public void display() {
        System.out.println("Carré");
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.height; j++) {
                System.out.print(this.symbole);
            }
            System.out.println();
        }
    }
}
