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

@WebServlet(urlPatterns = {"/view/admin/edit"})
public class AdminEditController extends HttpServlet {
    StaffService staffService = new StaffServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        User u = staffService.searchById(Integer.parseInt(id)); // chac chan tra ve 1 user
        req.setAttribute("user", u);
        RequestDispatcher rd = req.getRequestDispatcher("/view/admin/edit.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String fullname = req.getParameter("fullname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        User u = new User(Integer.parseInt(id), password, fullname,email );
        staffService.update(u);
        resp.sendRedirect(req.getContextPath() + "/view/admin/staffs");
    }
}
