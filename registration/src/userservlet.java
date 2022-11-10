import registration.user;
import registration.userd;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/register")
public class userservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private userd userd;

    public void init() {
        userd = new userd();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String mail = request.getParameter("mail");
        int dob = Integer.parseInt(request.getParameter("dob"));

        user u = new user();
        
        u.setUsername(username);
        u.setPassword(password);
        u.setmail(mail);
        u.setdob(dob);

        try {
            userd.registerEmployee(u);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("userdetail.jsp");
    }
}