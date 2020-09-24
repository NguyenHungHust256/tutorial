package com.company.factory;

public class PolygonFactory {
    private PolygonFactory(){

    }
    public static final Polygon getPolygon(PolyType polyType){
        switch (polyType) {
            case TRIANGLE:
                return new Triangle();
            case SQUARE:
                return new Square();
            case PENTAGON:
                return new Pentagon();
            default:
                throw new IllegalArgumentException("This polygon type is unsupported");
        }
    }
}
