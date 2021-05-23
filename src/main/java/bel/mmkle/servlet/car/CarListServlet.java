package bel.mmkle.servlet.car;

import bel.mmkle.bean.CarBean;
import bel.mmkle.dto.CarDto;
import bel.mmkle.entity.Cars;
import bel.mmkle.service.CarService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Сервлет для вывода списка всех машин
 */

@WebServlet("/cars/list")
public class CarListServlet extends HttpServlet {
    @EJB
    private CarBean carBean;

    private CarService carService = new CarService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Cars> cars = carBean.findCarsOnRepair();
        List<CarDto> list = carService.convertListToListDto(cars);
        req.setAttribute("list", list);
        getServletContext().getRequestDispatcher("/carOnRepairList.jsp").forward(req, resp);
    }
}
