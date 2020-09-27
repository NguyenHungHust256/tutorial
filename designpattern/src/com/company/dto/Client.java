package com.company.dto;

public class Client {
    public static void main(String[] args) {
        MemberService memberService = new MemberService(new MemberDaoImp());
        System.out.println(memberService.getUser(1).getName());
    }
}
