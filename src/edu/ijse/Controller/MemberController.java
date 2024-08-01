/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Controller;

import edu.ijse.dto.MemberDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.MemberService;
import java.util.ArrayList;

public class MemberController {
    private final MemberService memberService;

    public MemberController() {
        this.memberService = (MemberService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER);
    }

    public String add(MemberDto memberDto) throws Exception {
        System.out.println("Adding member: " + memberDto);
        memberService.add(memberDto);
        return null;
    }

    public String update(MemberDto memberDto) throws Exception {
        return memberService.update(memberDto);
    }

    public String delete(String id) throws Exception {
        return memberService.delete(id);
    }

    public ArrayList<MemberDto> getAll() throws Exception {
        return memberService.getAll();
    }

    public MemberDto get(String id) throws Exception {
        return memberService.get(id);
    }
}
