package epsi.software.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public abstract class ShapeAbs {
    protected int height = 5;
    public abstract void display();
}
