/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Controller;

import edu.ijse.dto.ReturnbookDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.ReturnbookService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ReturnBookController {
  private final ReturnbookService returnbookService;

    public ReturnBookController() {
        this.returnbookService = (ReturnbookService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RETURNBOOK);
    }

    public String add(ReturnbookDto returnbookDto) throws Exception {
        returnbookService.add(returnbookDto);
        return null;
    }
    public String update(ReturnbookDto returnbookDto) throws Exception{
        return returnbookService.update(returnbookDto);
    }
    
    public String delete(String bid) throws Exception{
        return returnbookService.delete(bid);
    }
     public ArrayList<ReturnbookDto> getAll() throws Exception{
        return returnbookService.getAll();
    }

    public ReturnbookDto get(String bid) throws Exception {
        return returnbookService.get(bid);
    }

   
   
}
