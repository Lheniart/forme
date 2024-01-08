package epsi.software.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Line extends ShapeAbs {

    private String symbole = "*";

    public Line(int height) {
        super(height);

    }

    public Line(int height, String symbole) {
        super(height);
        this.symbole = symbole;
    }

    @Override
    public void display() {
        System.out.println("Ligne");
        for (int i = 1; i <= this.height; i++) System.out.print(this.symbole);
        System.out.println();
    }
}
