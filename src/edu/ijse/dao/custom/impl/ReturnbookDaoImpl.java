/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.ReturnbookDao;
import edu.ijse.entity.ReturnbookEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author DELL
 */
public class ReturnbookDaoImpl implements ReturnbookDao {

    @Override
    public boolean create(ReturnbookEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "INSERT INTO returnbook (BookId,  MemberId, Returndate ,Issuedate,Fines ) VALUES (?, ?, ?,?, ?)",
            t.getBid(),  t.getMid(),t.getRdate(),t.getIdate()
        );
    }

    @Override
    public boolean update(ReturnbookEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "UPDATE returnbook SET   MemberId = ?,Returndate = ?, Issuedate = ?,Fines =?  WHERE BookId = ?",
           t.getBid(),  t.getMid(),t.getRdate(),t.getIdate()
        );
    }

    @Override
    public boolean delete(String Bid) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM returnbooks WHERE BookId = ?", Bid);
    }

@Override
    public ReturnbookEntity get(String Bid) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Returnbooks WHERE BookId = ?", Bid);
        if(rst.next()){
            ReturnbookEntity entity = new ReturnbookEntity(rst.getString("Bid"), 
               rst.getString("Mid"),
                rst.getString("Rdate"),
                rst.getString("Idate"),
                    rst.getString("Fines")
            ); 
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<ReturnbookEntity> getAll() throws Exception {
        ArrayList<ReturnbookEntity> returnbookEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM returnbooks");
        while (rst.next()) {
            ReturnbookEntity entity = new ReturnbookEntity(
               rst.getString("Bid"),
                rst.getString("Mid"),
                rst.getString("Rdate"),
                rst.getString("Idate"),
                rst.getString("Fines")
            );
            returnbookEntities.add(entity);
        }
        return returnbookEntities;
    }

 
   
}
