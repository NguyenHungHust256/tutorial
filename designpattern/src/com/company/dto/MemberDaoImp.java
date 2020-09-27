package com.company.dto;

import java.util.List;
import java.util.Optional;

public class MemberDaoImp implements MemberDao {
    @Override
    public List<MemberModel> getAll() {
        return Database.memberModels;
    }

    @Override
    public Optional<MemberModel> get(int id) {
        return Database.memberModels.stream().filter(u -> u.getId() == id).findFirst();
    }

    @Override
    public void save(MemberModel memberModel) {
        Database.memberModels.add(memberModel);
    }

    @Override
    public void delete(int id) {
        get(id).ifPresent(existUser -> Database.memberModels.remove(existUser));

    }
}
