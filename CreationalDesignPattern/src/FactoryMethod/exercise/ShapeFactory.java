package FactoryMethod.exercise;

public class ShapeFactory {
    public Shape getShape(String shape) {
        switch (shape.toLowerCase()) {
            case "circle":
                return new Cricle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                throw new IllegalArgumentException("not supported shape");
        }
    }
}
