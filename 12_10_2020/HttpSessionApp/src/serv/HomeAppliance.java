package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HomeAppliance")
public class HomeAppliance extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		
		String f = request.getParameter("fan");
		if(f!=null) {
			session.setAttribute("fan", f);
		}
		
		String c = request.getParameter("cooler");
		if(c!=null) {
			session.setAttribute("cooler", c);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<header>");
		out.print("<title>HomeAppliance");
		out.print("</title>");
		out.print("</header>");
		out.print("<body>");
		out.print("<form action='Bill' >");
		out.print("<input type='checkbox' name='iron' value='IRON' >IRON<br>");
		out.print("<input type='checkbox' name='mixer' value='MIXER' >MIXER<br>");
		out.print("<input type='submit' value='Bill' ><br>");
		
		
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
