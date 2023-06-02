package com.example.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.Warehouse;
import com.example.User;

public class GetUsersServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Create an instance of the Warehouse class
        Warehouse warehouse = new Warehouse();

        // Retrieve the list of users from the Warehouse instance
        Set<User> users = warehouse.getUsers();

        // Set the users as a request attribute to be accessed in the /users page
        request.setAttribute("users", users);

        // Forward the request to the /users page
        request.getRequestDispatcher("/jsp/users.jsp").forward(request, response);
    }
}







