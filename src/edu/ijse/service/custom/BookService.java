/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom;
import edu.ijse.dto.BookDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */


public interface BookService extends SuperService{
    String add(BookDto bookDto) throws Exception;
    String update(BookDto bookDto) throws Exception;
    String delete(String id) throws Exception;
    BookDto get(String id) throws Exception;
    ArrayList<BookDto> getAll() throws Exception;
}
