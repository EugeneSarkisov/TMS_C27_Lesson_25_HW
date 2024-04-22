package com.library.servlet;

import com.library.book.RandomBook;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;


@WebServlet("/book")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File randomBook = RandomBook.getBook();
        resp.setContentType("application/octet-stream");
        resp.setHeader("Content-Disposition","attachment; filename=\"" + randomBook.getName() + "\"");
        Files.copy(Path.of(randomBook.getPath()), resp.getOutputStream());
    }
}
