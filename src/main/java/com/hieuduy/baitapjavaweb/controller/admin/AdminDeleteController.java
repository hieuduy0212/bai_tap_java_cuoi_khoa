package com.hieuduy.baitapjavaweb.controller.admin;

import com.hieuduy.baitapjavaweb.service.StaffService;
import com.hieuduy.baitapjavaweb.service.impl.StaffServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/view/admin/delete"})
public class AdminDeleteController extends HttpServlet {
    StaffService staffService = new StaffServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        System.out.println(id);
        staffService.delete(Integer.parseInt(id));
        resp.sendRedirect(req.getContextPath() + "/view/admin/staffs");
    }
}
