package com.company.dao;

import java.util.List;
import java.util.Optional;

public interface MemberDao {
    List<Member> getAll();
    Optional<Member> get(int id);
    void save(Member member);
    void delete(int id);
}
