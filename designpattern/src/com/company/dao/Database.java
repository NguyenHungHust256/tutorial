package com.company.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    public static List<Member> members = new ArrayList<>(
        Arrays.asList(
                new Member(0, "Nguyen Ba Hung", "hungpronguyen256@gmail.com"),
                new Member(1, "Nguyen Quang Quy", "quangquy97@gmail.com") ));
}
