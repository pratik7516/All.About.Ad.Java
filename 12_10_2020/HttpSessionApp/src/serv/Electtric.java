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

@WebServlet("/Electtric")
public class Electtric extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String p = request.getParameter("pc");
		HttpSession session = request.getSession(true);
		if(p!=null) {		
			session.setAttribute("pc", p);
		}
		
		String t = request.getParameter("tv");
		if(t!=null) {	
			session.setAttribute("tv", t);
		}
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<header>");
		out.print("<title>Electric");
		out.print("</title>");
		out.print("</header>");
		out.print("<body>");
		out.print("<form action='HomeAppliance' >");
		out.print("<input type='checkbox' name='fan' value='FAN' >FAN<br>");
		out.print("<input type='checkbox' name='cooler' value='COOLER' >COOLER<br>");
		out.print("<input type='submit' value='Next' ><br>");
		
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
