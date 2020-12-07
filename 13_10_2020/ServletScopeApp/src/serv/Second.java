package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Second")
public class Second extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String r = (String)request.getAttribute("req");
		
		HttpSession session = request.getSession(true);
		
		String s = (String)session.getAttribute("ses");
		
		ServletContext cntx = request.getServletContext();
		String c = (String)cntx.getAttribute("cont");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Req = "+r);
		out.println("Session = "+s);
		out.println("ServletContext = "+c);
		
	}

}
