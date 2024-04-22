package com.library.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;


@WebServlet("/load_book")
@MultipartConfig(fileSizeThreshold = 15 * 1024 * 1024, maxFileSize = 30 * 1024 * 1024)
public class UploadBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part filePart = req.getPart("file");
        String name = filePart.getSubmittedFileName();
        filePart.write("C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\books\\" + name);
        resp.getWriter().print("Book upload successfully");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("load_book.jsp");
    }
}
