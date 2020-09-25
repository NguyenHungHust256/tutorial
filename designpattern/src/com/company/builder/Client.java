package com.company.builder;

public class Client {
    public static void main(String[] args) {
        MemberBuilder memberBuilder = new MemberConcreteBuilder()
                .setFirstName("Nguyen")
                .setLastName("Ba Hung")
                .setPhone("039493212")
                .setDayOfBirth("25/06/1997");

        System.out.println(memberBuilder.build().toString());
    }
}
