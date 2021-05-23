package bel.mmkle.servlet;

import bel.mmkle.bean.UserBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Сервлет для регистрации польозвателя
 */

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @EJB
    private UserBean userBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userBean.save(req.getParameter("login"), req.getParameter("pass"), Long.valueOf(req.getParameter("roleId")));
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
