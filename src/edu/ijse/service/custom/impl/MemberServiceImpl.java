package edu.ijse.service.custom.impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.MemberDao;
import edu.ijse.dto.MemberDto;
import edu.ijse.entity.MemberEntity;
import edu.ijse.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class MemberServiceImpl implements MemberService {

    public MemberServiceImpl() {
    }
    
    private final MemberDao memberDao = (MemberDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBER);

    public String add(MemberDto memberDto) throws Exception {
        MemberEntity entity = getMemberEntity(memberDto);
        return memberDao.create(entity) ? "Success" : "Fail";
    }

    @Override
    public String update(MemberDto memberDto) throws Exception {
        MemberEntity entity = getMemberEntity(memberDto);
        return memberDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(String id) throws Exception {
        return memberDao.delete(id) ?  "Success" : "Fail";
    }

    @Override
    public MemberDto get(String id) throws Exception {
        MemberEntity entity = memberDao.get(id);
        if(entity != null){
            return getMemberDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
        ArrayList<MemberEntity> memberEntitys = memberDao.getAll();
        if(memberEntitys != null && !memberEntitys.isEmpty()){
            ArrayList<MemberDto> memberDtos = new ArrayList<>();
            
            for (MemberEntity memberEntity : memberEntitys) {
                memberDtos.add(getMemberDto(memberEntity));
            }
            
            return memberDtos;
        }
        return null;
    }
    
    private MemberEntity getMemberEntity(MemberDto memberDto){
        return  new MemberEntity(
                memberDto.getId(),
                memberDto.getTitle(),
                memberDto.getName(), 
                memberDto.getAddress(),
                memberDto.getCity(),
                memberDto.getProvince());
    }
    
    private MemberDto getMemberDto(MemberEntity entity){
        return  new MemberDto(
                entity.getId(),
                entity.getTitle(),
                entity.getName(),
                entity.getAddress(),
                entity.getCity(),
                entity.getProvince());
                
    }

}
