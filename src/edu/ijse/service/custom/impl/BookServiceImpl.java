/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.BookDao;
import edu.ijse.dto.BookDto;
import edu.ijse.entity.BookEntity;
import edu.ijse.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class BookServiceImpl implements BookService {

    public BookServiceImpl() {
    }
    
    private final BookDao bookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOKS);

    public String add(BookDto bookDto) throws Exception {
        BookEntity entity = getBookEntity(bookDto);
        return bookDao.create(entity) ? "Success" : "Fail";
    }

    @Override
    public String update(BookDto bookDto) throws Exception {
        BookEntity entity = getBookEntity(bookDto);
        return bookDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(String id) throws Exception {
        return bookDao.delete(id) ?  "Success" : "Fail";
    }

    @Override
    public BookDto get(String id) throws Exception {
        BookEntity entity = bookDao.get(id);
        if(entity != null){
            return getBookDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<BookDto> getAll() throws Exception {
        ArrayList<BookEntity> bookEntitys = bookDao.getAll();
        if(bookEntitys != null && !bookEntitys.isEmpty()){
            ArrayList<BookDto> bookDtos = new ArrayList<>();
            
            for (BookEntity bookEntity : bookEntitys) {
                bookDtos.add(getBookDto(bookEntity));
            }
            
            return bookDtos;
        }
        return null;
    }
    
    private BookEntity getBookEntity(BookDto bookDto){
        return  new BookEntity(
                bookDto.getId(),
                bookDto.getName(), 
                bookDto.getAuthor(),
                bookDto.getYear(),
                bookDto.getTotal(),
                bookDto.getAvailable(),
                bookDto.getCategory());
    }
    
    private BookDto getBookDto(BookEntity entity){
        return  new BookDto(
                entity.getId(),
                entity.getName(),
                entity.getAuthor(),
                entity.getYear(),
                entity.getTotal(),
                entity.getAvailable(),
                entity.getCategory());
    }

}

