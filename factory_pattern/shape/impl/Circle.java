package shape.impl;

import shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle: draw()");
    }
}
