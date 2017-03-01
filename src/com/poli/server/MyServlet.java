package com.poli.server;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    private String massage;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("aplication/json");
        req.setCharacterEncoding("UTF-8");


        double a = Double.parseDouble(req.getParameter("a"));
        double b = Double.parseDouble(req.getParameter("b"));
        double c = Double.parseDouble(req.getParameter("c"));
        double D;
        D = b * b - 4 * a * c;

        if (D < 0) {
            massage = "\"x1\":\"" + (-b / 2 / a) + " + " + (Math.sqrt(-D) / 2 / a) + "i\", \"x2\":\"" + (-b / 2 / a) + " - " + (Math.sqrt(-D) / 2 / a) + "i\"";

        } else {
            massage = "\"x1\":\"" + (-b / 2 / a + Math.sqrt(D) / 2 / a) + "\", \"x2\":\"" + (-b / 2 / a + Math.sqrt(D) / 2 / a) + "\"";

        }
        resp.getWriter().println("{" + massage + "}");
    }

    @Override
    public void destroy() {

    }
}
