import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Serv1 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<h2>I AM FROM Serv1 BEGINNING</h2>");
        ServletContext ctx = getServletContext();
        RequestDispatcher rd = ctx.getRequestDispatcher("/s2");
        rd.include(req, res);
        pw.println("<h2>I AM FROM Serv1 ENDING</h2>");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
};