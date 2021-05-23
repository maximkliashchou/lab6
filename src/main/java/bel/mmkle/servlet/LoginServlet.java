package bel.mmkle.servlet;

import bel.mmkle.bean.UserBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.math.BigInteger;

/**
 * Сервлет для входа пользователя
 */

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @EJB
    private UserBean userBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BigInteger userId = userBean.login(req.getParameter("login"), req.getParameter("pass"));
        if (userId != null){
            HttpSession session = req.getSession();
            session.setAttribute("userId", userId.longValue());
            resp.sendRedirect("/lab6/menu");
        } else {
            req.setAttribute("message", "Неверный логин/пароль");
            getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
