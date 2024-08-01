/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.IssuebookDao;
import edu.ijse.dto.IssuebookDto;
import edu.ijse.entity.IssuebookEntity;
import edu.ijse.service.custom.IssuebookService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class IssuebookServiceImpl implements IssuebookService {

    public IssuebookServiceImpl() {
    }
    
    private final IssuebookDao issuebookDao = (IssuebookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ISSUEBOOK);

    public String add(IssuebookDto issuebookDto) throws Exception {
        IssuebookEntity entity = getIssuebookEntity(issuebookDto);
        return issuebookDao.create(entity) ? "Success" : "Fail";
    }

    @Override
    public String update(IssuebookDto issuebookDto) throws Exception {
        IssuebookEntity entity = getIssuebookEntity(issuebookDto);
        return issuebookDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(String Bid) throws Exception {
        return issuebookDao.delete(Bid) ?  "Success" : "Fail";
    }

    @Override
    public IssuebookDto get(String Bid) throws Exception {
        IssuebookEntity entity = issuebookDao.get(Bid);
        if(entity != null){
            return getIssuebookDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<IssuebookDto> getAll() throws Exception {
        ArrayList<IssuebookEntity> issuebookEntitys = issuebookDao.getAll();
        if(issuebookEntitys != null && !issuebookEntitys.isEmpty()){
            ArrayList<IssuebookDto> issuebookDtos = new ArrayList<>();
            
            for (IssuebookEntity issuebookEntity : issuebookEntitys) {
                issuebookDtos.add(getIssuebookDto(issuebookEntity));
            }
            
            return issuebookDtos;
        }
        return null;
    }
    
    private IssuebookEntity getIssuebookEntity(IssuebookDto IssuebookDto){
        return  new IssuebookEntity(
                IssuebookDto.getBid(),
                IssuebookDto.getMid(), 
                IssuebookDto.getRdate(),
                IssuebookDto.getIdate());
    }
    
    private IssuebookDto getIssuebookDto(IssuebookEntity entity){
        return  new IssuebookDto(
                entity.getBid(),
                entity.getMid(),
                entity.getRdate(),
                entity.getIdate());
    }

}

