package com.company.factory;

public class Client {
    public static void main(String[] args) {
        System.out.println(PolygonFactory.getPolygon(PolyType.TRIANGLE).getType());
    }
}
