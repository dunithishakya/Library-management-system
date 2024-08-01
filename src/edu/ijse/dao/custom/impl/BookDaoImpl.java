/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.BookDao;
import edu.ijse.entity.BookEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class BookDaoImpl implements BookDao {

    @Override
    public boolean create(BookEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "INSERT INTO books (Id,  Name, Author ,Year , Total, Available, Category) VALUES (?, ?, ?, ?, ?, ?, ?)",
            t.getId(),  t.getName(),t.getAuthor(),t.getYear(), t.getTotal(), t.getAvailable(), t.getCategory()
        );
    }

    @Override
    public boolean update(BookEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "UPDATE books SET  Name = ?, Author = ?,Year = ?, Total = ?, Available = ?, Category = ? WHERE Id = ?",
            t.getId(),  t.getName(),t.getAuthor(),t.getYear(), t.getTotal(), t.getAvailable(), t.getCategory()
        );
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM books WHERE Id = ?", id);
    }

@Override
    public BookEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM books WHERE Id = ?", id);
        if(rst.next()){
            BookEntity entity = new BookEntity(rst.getString("Id"), 
                   rst.getString("Name"),
                rst.getString("Author"),
                rst.getString("Year"),
                rst.getString("Total"),
                rst.getString("Available"),
                rst.getString("Category")
            ); 
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
        ArrayList<BookEntity> bookEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM books");
        while (rst.next()) {
            BookEntity entity = new BookEntity(
               rst.getString("Id"),
                rst.getString("Name"),
                rst.getString("Author"),
                rst.getString("Year"),
                rst.getString("Total"),
                rst.getString("Available"),
                rst.getString("Category")
            );
            bookEntities.add(entity);
        }
        return bookEntities;
    }

   
}
