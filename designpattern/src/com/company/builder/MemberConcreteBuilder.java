package com.company.builder;

public class MemberConcreteBuilder implements MemberBuilder {
    private String id;
    private String firstName;
    private String lastName;
    private String dayOfBirth;
    private String currentClass;
    private String phone;

    @Override
    public MemberBuilder setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public MemberBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public MemberBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public MemberBuilder setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
        return this;
    }

    @Override
    public MemberBuilder setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
        return this;
    }

    @Override
    public MemberBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public Member build() {
        return new Member(id, firstName, lastName, dayOfBirth, currentClass, phone);
    }
}
