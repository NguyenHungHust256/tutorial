package com.company.dao;

import java.util.List;
import java.util.Optional;

public class MemberDaoImp implements MemberDao{
    @Override
    public List<Member> getAll() {
        return Database.members;
    }

    @Override
    public Optional<Member> get(int id) {
        return Database.members.stream().filter(u -> u.getId() == id).findFirst();
    }

    @Override
    public void save(Member member) {
        Database.members.add(member);
    }

    @Override
    public void delete(int id) {
        get(id).ifPresent(existUser -> Database.members.remove(existUser));

    }
}
