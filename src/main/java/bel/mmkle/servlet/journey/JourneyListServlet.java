package bel.mmkle.servlet.journey;

import bel.mmkle.bean.JourneyBean;
import bel.mmkle.dto.JourneyDto;
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
 * Сервлет для отображения списка поездок
 */

@WebServlet("/journeys/list")
public class JourneyListServlet extends HttpServlet {
    @EJB
    private JourneyBean journeyBean;

    private JourneyService journeyService = new JourneyService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<JourneyDto> list = journeyService.convertListToListDto(journeyBean.findAll());
        req.setAttribute("list", list);
        getServletContext().getRequestDispatcher("/journeysList.jsp").forward(req, resp);
    }
}
