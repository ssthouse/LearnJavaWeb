package com.ssthouse.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ssthouse on 10/01/2017.
 */
public class GetServlet extends HttpServlet {

    public static final long serialVersionUID = 1L;

    public GetServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        PrintWriter outputWriter = resp.getWriter();
        outputWriter.println("this is the response of the get reuest");
        outputWriter.close();
    }
}
