package com.company.abstractfactory;

public class SquareFactory extends AbstractFactory{
    @Override
    public StraightShape getStraight() {
        return new StraightSquare();
    }

    @Override
    public RoundShape getRound() {
        return new RoundSquare();
    }
}
