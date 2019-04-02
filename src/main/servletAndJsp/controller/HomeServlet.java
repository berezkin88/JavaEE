package main.servletAndJsp.controller;

import main.servletAndJsp.model.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Aleksandr Beryozkin
 */

@WebServlet(name = "HomeServlet", urlPatterns = "")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Person> lst = new LinkedList<>(populatePeople());
        req.setAttribute("people", lst);

        RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/views/home.jsp");
        rd.forward(req, resp);
    }

    private List<Person> populatePeople() {
        List<Person> people = new LinkedList<>();

        Person slava = new Person("Slava", "Gorbin");
        Person boris = new Person("Boris", "Goblin");
        Person serge = new Person("Serge", "Abramov");

        people.add(slava);
        people.add(boris);
        people.add(serge);

        return people;
    }
}
