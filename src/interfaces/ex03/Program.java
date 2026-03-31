package interfaces.ex03;

import interfaces.ex03.enums.Color;
import interfaces.ex03.model.AbstractShape;
import interfaces.ex03.model.Circle;
import interfaces.ex03.model.Rectangle;
import interfaces.ex03.model.Shape;

public class Program {

    static void main(String[] args) {
        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

    }

}
