package com.company.dao;

import java.util.Optional;

public class MemberService {
    private MemberDao memberDao;

    public MemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public Optional<Member> getUser(int id){
        return memberDao.get(id);
    }
    public static void main(String[] args) {
        MemberService memberService = new MemberService(new MemberDaoImp());
        System.out.println(memberService.getUser(0).get().getName());
    }
}
