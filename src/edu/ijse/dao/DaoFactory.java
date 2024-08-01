/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao;

import edu.ijse.dao.custom.impl.BookDaoImpl;
import edu.ijse.dao.custom.impl.CategoryDaoImpl;
import edu.ijse.dao.custom.impl.IssuebookDaoImpl;
import edu.ijse.dao.custom.impl.MemberDaoImpl;
import edu.ijse.dao.custom.impl.ReturnbookDaoImpl;


/**
 *
 * @author anjan
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type) {
        switch (type) {
            case MEMBER:
                return new MemberDaoImpl();
            case BOOKS:
                return new BookDaoImpl();
            case CATEGORY:
                return new CategoryDaoImpl();
            case ISSUEBOOK:
                return new IssuebookDaoImpl();  
            case RETURNBOOK:
                return new ReturnbookDaoImpl(); 
            default:
                return null;
        }
    }

    public enum DaoTypes {
        MEMBER,BOOKS,CATEGORY,RETURNBOOK,ISSUEBOOK;
    }
}
