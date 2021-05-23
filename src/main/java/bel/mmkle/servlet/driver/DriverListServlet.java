package bel.mmkle.servlet.driver;

import bel.mmkle.bean.DriverBean;
import bel.mmkle.bean.JourneyBean;
import bel.mmkle.dto.JourneyDto;
import bel.mmkle.entity.Journeys;
import bel.mmkle.service.JourneyService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Сервлет для отображения списка поездок водителя
 */

@WebServlet("/drivers/list")
public class DriverListServlet extends HttpServlet {
    @EJB
    private DriverBean driverBean;

    @EJB
    private JourneyBean journeyBean;

    private JourneyService journeyService= new JourneyService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String regNum = req.getParameter("regNum");
        Long driverId = driverBean.findDriverIdByRegNum(regNum);
        Long carId = driverBean.findCarByDriverId(driverId).getCarId();
        List<Journeys> journeysList = journeyBean.findJourneysForDriver(carId);
        List<JourneyDto> list = journeyService.convertListToListDto(journeysList);
        req.setAttribute("list", list);
        getServletContext().getRequestDispatcher("/driverJourneyList.jsp").forward(req, resp);
    }
}
