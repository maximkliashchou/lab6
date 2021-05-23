package bel.mmkle.servlet.driver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Сервлет для перевода на отобрадение форма выбора водителя
 */

@WebServlet("/driver-journey/form")
public class DriverJourneyFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/driverJourneyForm.jsp").forward(req, resp);
    }
}
