package com.company.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory squareFactory = FactoryProducer.getFactory(ShapeType.SQUARE);
        squareFactory.getRound().draw();
        squareFactory.getStraight().draw();

        AbstractFactory rectangleFactory = FactoryProducer.getFactory(ShapeType.RECTANGLE);
        rectangleFactory.getStraight().draw();
        rectangleFactory.getRound().draw();
    }
}
