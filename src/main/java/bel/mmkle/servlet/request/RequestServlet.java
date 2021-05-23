package bel.mmkle.servlet.request;

import bel.mmkle.bean.RequestBean;
import bel.mmkle.entity.Requests;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Сервлет для добавления сущности заявка
 */

@WebServlet("/requests")
public class RequestServlet extends HttpServlet {
    @EJB
    private RequestBean requestBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            BigDecimal capability = new BigDecimal(req.getParameter("capability"));
            BigDecimal cost = new BigDecimal(req.getParameter("cost"));

            Requests requests = Requests.builder()
                    .maxCost(cost)
                    .requiredCapability(capability)
                    .build();

            requestBean.save(requests);

            resp.sendRedirect("/lab6/menu");
        } catch (Exception ex) {
            req.setAttribute("message", ex.getMessage());
            getServletContext().getRequestDispatcher("/error.jsp").forward(req, resp);
        }
    }
}
