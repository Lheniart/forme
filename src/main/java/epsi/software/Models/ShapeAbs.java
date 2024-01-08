package epsi.software.Models;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class ShapeAbs {
    protected int height = 5;
    public abstract void display();
}
