package org.example.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

@WebServlet("/home")
public class MainServlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");

        User usr = new User(name, email);

        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sfc = cfg.buildSessionFactory();
        Session session = sfc.openSession();

        Transaction t = session.beginTransaction();
        session.persist(usr);
        t.commit();
        session.close();
        System.out.println("done ------------");
        PrintWriter pw = resp.getWriter();
        
        pw.println("Successfull !!!");
    }
}
