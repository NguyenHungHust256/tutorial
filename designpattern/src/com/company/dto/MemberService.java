package com.company.dto;

public class MemberService {
    private MemberDao memberDao;

    public MemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public MemberDTO getUser(int id){
        return convertToDTO(memberDao.get(id).get());
    }

    private MemberModel convertToModel(MemberDTO dto) {
        MemberModel model = new MemberModel();
        model.setId(dto.getId());
        model.setName(dto.getName());
        return model;
    }

    private MemberDTO convertToDTO(MemberModel model) {
        MemberDTO dto = new MemberDTO();
        dto.setId(model.getId());
        dto.setName(model.getName());
        return dto;
    }
}
