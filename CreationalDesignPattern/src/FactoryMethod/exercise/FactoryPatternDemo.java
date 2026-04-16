package FactoryMethod.exercise;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        try {
            shapeFactory.getShape("rectangle").draw();
            shapeFactory.getShape("square").draw();
            shapeFactory.getShape("circle").draw();
            shapeFactory.getShape("triangle").draw();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
