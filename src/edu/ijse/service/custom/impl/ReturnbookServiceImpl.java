/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.ReturnbookDao;
import edu.ijse.dto.ReturnbookDto;
import edu.ijse.entity.ReturnbookEntity;
import edu.ijse.service.custom.ReturnbookService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ReturnbookServiceImpl implements ReturnbookService {

    public ReturnbookServiceImpl() {
    }
    
    private final ReturnbookDao returnbookDao = (ReturnbookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RETURNBOOK);

    public String add(ReturnbookDto returnbookDto) throws Exception {
        ReturnbookEntity entity = getReturnbookEntity(returnbookDto);
        return returnbookDao.create(entity) ? "Success" : "Fail";
    }

    @Override
    public String update(ReturnbookDto returnbookDto) throws Exception {
        ReturnbookEntity entity = getReturnbookEntity(returnbookDto);
        return returnbookDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(String Bid) throws Exception {
        return returnbookDao.delete(Bid) ?  "Success" : "Fail";
    }

    @Override
    public ReturnbookDto get(String Bid) throws Exception {
        ReturnbookEntity entity = returnbookDao.get(Bid);
        if(entity != null){
            return getReturnbookDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<ReturnbookDto> getAll() throws Exception {
        ArrayList<ReturnbookEntity> returnbookEntitys = returnbookDao.getAll();
        if(returnbookEntitys != null && !returnbookEntitys.isEmpty()){
            ArrayList<ReturnbookDto> returnbookDtos = new ArrayList<>();
            
            for (ReturnbookEntity returnbookEntity : returnbookEntitys) {
                returnbookDtos.add(getReturnbookDto(returnbookEntity));
            }
            
            return returnbookDtos;
        }
        return null;
    }
    
    private ReturnbookEntity getReturnbookEntity(ReturnbookDto ReturnbookDto){
        return  new ReturnbookEntity(
                ReturnbookDto.getBid(),
                ReturnbookDto.getMid(), 
                ReturnbookDto.getRdate(),
                ReturnbookDto.getIdate(),
                ReturnbookDto.getFines());
    }
    
    private ReturnbookDto getReturnbookDto(ReturnbookEntity entity){
        return  new ReturnbookDto(
                entity.getBid(),
                entity.getMid(),
                entity.getRdate(),
                entity.getIdate(),
                entity.getFines());
    }

}