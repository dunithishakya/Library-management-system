/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package edu.ijse.service.custom;

import edu.ijse.dto.MemberDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

public interface MemberService extends SuperService{
    String add(MemberDto memberDto) throws Exception;
    String update(MemberDto memberDto) throws Exception;
    String delete(String id) throws Exception;
    MemberDto get(String id) throws Exception;
    ArrayList<MemberDto> getAll() throws Exception;
}

