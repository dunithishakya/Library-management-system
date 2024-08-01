/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Controller;

import edu.ijse.dto.CategoryDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController() {
        this.categoryService = (CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);
    }

    public String add(CategoryDto categoryDto) throws Exception {
        return categoryService.add(categoryDto);
        
        
    }
    public String update(CategoryDto categoryDto) throws Exception{
        return categoryService.update(categoryDto);
    }
    
    public String delete(String id) throws Exception{
        return categoryService.delete(id);
    }
     public ArrayList<CategoryDto> getAll() throws Exception{
        return categoryService.getAll();
    }

    public CategoryDto get(String id) throws Exception {
        return categoryService.get(id);
    }

   
   
}

