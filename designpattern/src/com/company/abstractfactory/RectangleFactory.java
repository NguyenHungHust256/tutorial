package com.company.abstractfactory;

public class RectangleFactory extends AbstractFactory {
    @Override
    public StraightShape getStraight() {
        return new StraightRectangle();
    }

    @Override
    public RoundShape getRound() {
        return new RoundRectangle();
    }
}
