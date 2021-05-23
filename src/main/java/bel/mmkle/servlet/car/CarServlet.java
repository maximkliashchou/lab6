package bel.mmkle.servlet.car;

import bel.mmkle.bean.CarBean;
import bel.mmkle.entity.Cars;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Сервлет для создание сущности машины
 */

@WebServlet("/cars")
public class CarServlet extends HttpServlet {
    @EJB
    private CarBean carBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String regNum = req.getParameter("regNum");
            BigDecimal capability = new BigDecimal(req.getParameter("capability"));
            BigDecimal cost = new BigDecimal(req.getParameter("cost"));

            Cars cars = Cars.builder()
                    .regNum(regNum)
                    .capability(capability)
                    .cost(cost)
                    .onRepair(0)
                    .build();

            carBean.save(cars);

            resp.sendRedirect("/lab6/menu");
        } catch (Exception ex){
            req.setAttribute("message", ex.getMessage());
            getServletContext().getRequestDispatcher("/error.jsp").forward(req, resp);
        }
    }
}
