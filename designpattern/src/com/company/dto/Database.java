package com.company.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    public static List<MemberModel> memberModels = new ArrayList<>(
        Arrays.asList(
                new MemberModel(0, "Nguyen Ba Hung", "hungpronguyen256@gmail.com", "0395932468"),
                new MemberModel(1, "Nguyen Quang Quy", "quangquy97@gmail.com", "038838845"),
                new MemberModel(2, "Nguyen Quang Hung", "quangquy94@gmail.com", "038838849"),
                new MemberModel(3, "Nguyen Quang Tung", "quangquy95@gmail.com", "038838859"),
                new MemberModel(4, "Cao Thanh Quy", "quangquy92@gmail.com", "038838869"),
                new MemberModel(5, "Cao Thanh Tung", "quangquy93@gmail.com", "038838879")
        ));
}
