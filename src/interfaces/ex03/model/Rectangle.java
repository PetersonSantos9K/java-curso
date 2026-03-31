package interfaces.ex03.model;

import interfaces.ex03.enums.Color;

public class Rectangle extends AbstractShape {

    private Double width;
    private Double height;

    public Rectangle(Color color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }




}
