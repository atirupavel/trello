package doc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Logout extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException {
        response.setContentType("text/html");
        HttpSession session=request.getSession(false);
if(session!=null){
    session.invalidate();
}
    response.sendRedirect("login.html");}
}
