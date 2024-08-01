/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service;


import edu.ijse.service.custom.impl.BookServiceImpl;
import edu.ijse.service.custom.impl.CategoryServiceImpl;
import edu.ijse.service.custom.impl.IssuebookServiceImpl;
import edu.ijse.service.custom.impl.MemberServiceImpl;
import edu.ijse.service.custom.impl.ReturnbookServiceImpl;


/**
 *
 * @author anjan
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService  getService(ServiceType serviceType){
        switch (serviceType) {
            case MEMBER:
                return new MemberServiceImpl();
           case BOOKS:
                return new BookServiceImpl();
             case CATEGORY:
                return new CategoryServiceImpl();
            case ISSUEBOOK:
                return new IssuebookServiceImpl();
            case RETURNBOOK:
                return new ReturnbookServiceImpl(); 
            default:
                return null;
        }
    }
    
    public enum ServiceType{
       MEMBER,BOOKS,CATEGORY,ISSUEBOOK,RETURNBOOK
    }
}
