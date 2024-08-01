/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.CategoryDao;
import edu.ijse.entity.CategoryEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author DELL
 */
public  class CategoryDaoImpl implements CategoryDao {

    @Override
    public boolean create(CategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "INSERT INTO category (Id,  Name) VALUES (?, ?)",
            t.getId(),  t.getName()
        );
    }

    @Override
    public boolean update(CategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "UPDATE category SET  Name = ? WHERE Id = ?",
            t.getId(),  t.getName()
        );
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM category WHERE Id = ?", id);
    }

@Override
    public CategoryEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category WHERE Id = ?", id);
        if(rst.next()){
            CategoryEntity entity = new CategoryEntity(rst.getString("Id"), 
                   rst.getString("Name")
            ); 
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
        ArrayList<CategoryEntity> categoryEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category");
        while (rst.next()) {
            CategoryEntity entity = new CategoryEntity(
               rst.getString("Id"),
                rst.getString("Name")
            );
            categoryEntities.add(entity);
        }
        return categoryEntities;
    }

    
   
}
