package bel.mmkle.servlet.driver;

import bel.mmkle.bean.CarBean;
import bel.mmkle.bean.DriverBean;
import bel.mmkle.entity.Cars;
import bel.mmkle.entity.Drivers;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Сервлет для добавления сущности водитель
 */

@WebServlet("/drivers")
public class DriverServlet extends HttpServlet {
    @EJB
    private CarBean carBean;

    @EJB
    private DriverBean driverBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String regNum = req.getParameter("regNum");
            String name = req.getParameter("name");
            String carRegNum = req.getParameter("carRegNum");
            Drivers drivers = new Drivers();
            Long carId = carBean.findCarIdByRegNum(carRegNum);
            Cars cars = carBean.findCarById(carId);
            drivers.setCar(cars);
            drivers.setName(name);
            drivers.setRegNum(regNum);
            driverBean.save(drivers);
            resp.sendRedirect("/lab6/menu");
        } catch (Exception ex){
            req.setAttribute("message", ex.getMessage());
            getServletContext().getRequestDispatcher("/error.jsp").forward(req, resp);
        }
    }
}
