package org.smart4j.chapter1;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/HelloServlet")
public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDatetime = dateFormat.format(new Date());
        request.setAttribute("currentDatetime", currentDatetime);
        request.setAttribute("currentDatetime2", currentDatetime);
        request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);
    }
}
