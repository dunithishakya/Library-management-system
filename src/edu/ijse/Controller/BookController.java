/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Controller;

import edu.ijse.dto.BookDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class BookController {
    private final BookService bookService;

    public BookController() {
        this.bookService = (BookService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOKS);
    }

    public String add(BookDto bookDto) throws Exception {
        bookService.add(bookDto);
        return null;
    }
    public String update(BookDto bookDto) throws Exception{
        return bookService.update(bookDto);
    }
    
    public String delete(String id) throws Exception{
        return bookService.delete(id);
    }
     public ArrayList<BookDto> getAll() throws Exception{
        return bookService.getAll();
    }

    public BookDto get(String id) throws Exception {
        return bookService.get(id);
    }

   
   
}

