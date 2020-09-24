package com.company.abstractfactory;

public class FactoryProducer {
    private FactoryProducer() {

    }
    public static AbstractFactory getFactory(ShapeType shapeType) {
        switch (shapeType) {
            case SQUARE:
                return new SquareFactory();
            case RECTANGLE:
                return new RectangleFactory();
            default:
                throw new UnsupportedOperationException("This shape is unsupported ");
        }
    }
}
