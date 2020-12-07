package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nm = request.getParameter("name");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>from second servlet</h1>");
		out.print("<h1>Name : "+nm+"</h1>");
		out.flush();
		out.close();
	}

}
