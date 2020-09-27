package com.company.dto;

import java.util.List;
import java.util.Optional;

public interface MemberDao {
    List<MemberModel> getAll();
    Optional<MemberModel> get(int id);
    void save(MemberModel memberModel);
    void delete(int id);
}
