package com.hieuduy.baitapjavaweb.controller;

import com.hieuduy.baitapjavaweb.model.User;
import com.hieuduy.baitapjavaweb.service.RegisterService;
import com.hieuduy.baitapjavaweb.service.impl.RegisterServiceImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.ir.RuntimeNode;

import java.io.IOException;

@WebServlet(urlPatterns = {"/view/client/register"})
public class RegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/view/client/register.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String fullname = req.getParameter("fullname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        RequestDispatcher rd = req.getRequestDispatcher("/view/client/register.jsp");
        if(fullname == null || fullname.isEmpty()){
            req.setAttribute("status", "invalidFullname");
            rd.forward(req, resp);
            return;
        }else if(email == null || email.isEmpty()){
            req.setAttribute("status", "invalidEmail");
            rd.forward(req, resp);
            return;
        }else if(username == null || username.isEmpty() || username.contains(" ")){
            req.setAttribute("status", "invalidUsername");
            rd.forward(req, resp);
            return;
        }else if(password == null || password.isEmpty()){
            req.setAttribute("status", "invalidPassword");
            rd.forward(req, resp);
            return;
        }
        RegisterService registerService = new RegisterServiceImpl();
        User user = new User(username, password, fullname, email, 0);
        boolean ok = registerService.RegisterUser(user);
        if(ok) { // dangg ky thanh cong
            resp.sendRedirect(req.getContextPath() + "/");
        }else{ // dang ky fail
            req.setAttribute("status", "failRegister");
            rd.forward(req, resp);
            return;
        }
    }
}
