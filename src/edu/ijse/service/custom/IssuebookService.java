/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.IssuebookDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface IssuebookService extends SuperService{
    String add(IssuebookDto issuebookDto) throws Exception;
    String update(IssuebookDto issuebookDto) throws Exception;
    String delete(String Bid) throws Exception;
    IssuebookDto get(String Bid) throws Exception;
    ArrayList<IssuebookDto> getAll() throws Exception;
}

