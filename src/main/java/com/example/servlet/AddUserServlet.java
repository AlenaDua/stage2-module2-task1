package com.example.servlet;

import java.io.IOException;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.Warehouse;
import com.example.User;

public class AddUserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve the firstName and lastName parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        // Create a new user object
        User user = new User(firstName, lastName);

        // Save the user in the Warehouse (assuming Warehouse is a class managing user storage)
        Warehouse.addUser(user);

        // Set the user as a request attribute to be accessed in the /add page
        request.setAttribute("user", user);

        // Forward the request to the /add page
        request.getRequestDispatcher("/jsp/add.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Forward the request to the /users page
        request.getRequestDispatcher("/jsp/add.jsp").forward(request, response);
    }

}
