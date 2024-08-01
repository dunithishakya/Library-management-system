/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.CategoryDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface CategoryService extends SuperService{
    String add(CategoryDto bookDto) throws Exception;
    String update(CategoryDto bookDto) throws Exception;
    String delete(String id) throws Exception;
    CategoryDto get(String id) throws Exception;
    ArrayList<CategoryDto> getAll() throws Exception;
}
