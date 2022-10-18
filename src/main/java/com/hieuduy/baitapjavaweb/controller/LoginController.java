package com.hieuduy.baitapjavaweb.controller;

import com.hieuduy.baitapjavaweb.dao.LoginDao;
import com.hieuduy.baitapjavaweb.dao.impl.LoginDaoImpl;
import com.hieuduy.baitapjavaweb.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jdk.nashorn.internal.ir.RuntimeNode;

import java.io.IOException;
@WebServlet(urlPatterns = {"/view/client/login"})
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/view/client/login.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        LoginDao loginDao = new LoginDaoImpl();
        User u = loginDao.checkLogin(username, password);
        if(u != null){
            HttpSession session = req.getSession();
            session.setAttribute("username", u.getUsername());
            session.setAttribute("fullname", u.getFullname());
            session.setAttribute("email", u.getEmail());
            session.setAttribute("password", u.getPassword());
            session.setAttribute("id", u.getId());
            int is_admin = u.getIs_admin();
            if(is_admin == 1){
                resp.sendRedirect(req.getContextPath() + "/view/admin/homepage");
            }else{
                resp.sendRedirect(req.getContextPath() + "/view/client/homepage");
            }
        }else{
            req.setAttribute("errorMessage", "Tài khoản hoặc mật khẩu không đúng");
            RequestDispatcher rd = req.getRequestDispatcher("/view/client/login.jsp");
            rd.forward(req, resp);
        }
    }
}
