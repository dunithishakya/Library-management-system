/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Controller;

import edu.ijse.dto.IssuebookDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.IssuebookService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class IssueBookController {
    private final IssuebookService issuebookService;

    public IssueBookController() {
        this.issuebookService = (IssuebookService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ISSUEBOOK);
    }

    public String add(IssuebookDto issuebookDto) throws Exception {
        issuebookService.add(issuebookDto);
        return null;
    }
    public String update(IssuebookDto issuebookDto) throws Exception{
        return issuebookService.update(issuebookDto);
    }
    
    public String delete(String Bid) throws Exception{
        return issuebookService.delete(Bid);
    }
     public ArrayList<IssuebookDto> getAll() throws Exception{
        return issuebookService.getAll();
    }

    public IssuebookDto get(String Bid) throws Exception {
        return issuebookService.get(Bid);
    }

   
   
}

