/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.ReturnbookDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface ReturnbookService extends SuperService{
    String add(ReturnbookDto returnbookDto) throws Exception;
    String update(ReturnbookDto returnbookDto) throws Exception;
    String delete(String Bid) throws Exception;
    ReturnbookDto get(String Bid) throws Exception;
    ArrayList<ReturnbookDto> getAll() throws Exception;
}