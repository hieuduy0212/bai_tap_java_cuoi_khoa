package com.hieuduy.baitapjavaweb.controller.admin;

import com.hieuduy.baitapjavaweb.model.User;
import com.hieuduy.baitapjavaweb.service.StaffService;
import com.hieuduy.baitapjavaweb.service.impl.StaffServiceImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/view/admin/staffs"})
public class AdminStaffListController extends HttpServlet {
    StaffService staffService = new StaffServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //show all nhan vien
        List<User> listUser = new ArrayList<>();
        listUser = staffService.getAll();
        req.setAttribute("listuser", listUser);
        RequestDispatcher rd = req.getRequestDispatcher("/view/admin/staffs.jsp");
        rd.forward(req, resp);
    }
}
