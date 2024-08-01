/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.IssuebookDao;
import edu.ijse.entity.IssuebookEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author DELL
 */
public class IssuebookDaoImpl implements IssuebookDao {

    @Override
    public boolean create(IssuebookEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "INSERT INTO issuebook (BookId,  MemberId, Returndate ,Issuedate ) VALUES (?, ?, ?, ?)",
            t.getBid(),  t.getMid(),t.getRdate(),t.getIdate()
        );
    }

    @Override
    public boolean update(IssuebookEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "UPDATE issuebook SET   MemberId = ?,Returndate = ?, Issuedate = ? WHERE BookId = ?",
           t.getBid(),  t.getMid(),t.getRdate(),t.getIdate()
        );
    }

    @Override
    public boolean delete(String Bid) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM issuebooks WHERE BookId = ?", Bid);
    }

@Override
    public IssuebookEntity get(String Bid) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM issuebooks WHERE BookId = ?", Bid);
        if(rst.next()){
            IssuebookEntity entity = new IssuebookEntity(rst.getString("Bid"), 
               rst.getString("Mid"),
                rst.getString("Rdate"),
                rst.getString("Idate")
            ); 
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<IssuebookEntity> getAll() throws Exception {
        ArrayList<IssuebookEntity> issuebookEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM issuebooks");
        while (rst.next()) {
            IssuebookEntity entity = new IssuebookEntity(
               rst.getString("Bid"),
                rst.getString("Mid"),
                rst.getString("Rdate"),
                rst.getString("Idate")
            );
            issuebookEntities.add(entity);
        }
        return issuebookEntities;
    }

   
}
