package com.company.builder;

public interface MemberBuilder {
    MemberBuilder setId(String id);

    MemberBuilder setFirstName(String firstName);

    MemberBuilder setLastName(String lastName);

    MemberBuilder setDayOfBirth(String dayOfBirth);

    MemberBuilder setCurrentClass(String currentClass);

    MemberBuilder setPhone(String phone);

    Member build();
}
