import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MySrv")
public class MySrv extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("uname");
        String password = request.getParameter("pwd");

        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Response</title></head>");
        out.println("<body bgcolor='#ADD8E6'>");

        if ("user".equals(username) && "pswd".equals(password)) {
            out.println("<h1>Welcome, " + username + "!</h1>");
        } else {
            out.println("<h1>Registration Successful!</h1>");
            out.println("<a href='registration.html'>Click for Home Page</a>");
        }

        out.println("</body></html>");
        out.close();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
