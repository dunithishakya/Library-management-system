/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;


import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.MemberDao;
import edu.ijse.entity.MemberEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author anjan
 */
public class MemberDaoImpl implements MemberDao {

    @Override
    public boolean create(MemberEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "INSERT INTO member (Id, Title, Name, Address, City, Province) VALUES (?, ?, ?, ?, ?, ?, ?)",
            t.getId(), t.getTitle(), t.getName(), t.getAddress(), t.getCity(), t.getProvince()
        );
    }

    @Override
    public boolean update(MemberEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "UPDATE member SET Title = ?, Name = ?, Address = ?, City = ?, Province = ? WHERE Id = ?",
            t.getTitle(), t.getName(), t.getAddress(), t.getCity(), t.getProvince(), t.getId()
        );
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM member WHERE Id = ?", id);
    }

    @Override
    public MemberEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM member WHERE Id = ?", id);
        if (rst.next()) {
            return new MemberEntity(
                rst.getString("Id"),
                rst.getString("Title"),
                rst.getString("Name"),
                rst.getString("Address"),
                rst.getString("City"),
                rst.getString("Province")
            );
        }
        return null;
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        ArrayList<MemberEntity> memberEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM member");
        while (rst.next()) {
            MemberEntity entity = new MemberEntity(
                rst.getString("Id"),
                rst.getString("Title"),
                rst.getString("Name"),
                rst.getString("Address"),
                rst.getString("City"),
                rst.getString("Province")
            );
            memberEntities.add(entity);
        }
        return memberEntities;
    }
}
