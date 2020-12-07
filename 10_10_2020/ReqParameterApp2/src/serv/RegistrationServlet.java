package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nm = request.getParameter("uname");
		String pass = request.getParameter("upass");
		String gen = request.getParameter("gender");
		String lan[] = request.getParameterValues("languages");
		String addr = request.getParameter("address");
		String city = request.getParameter("city");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Name : "+nm+" </h1>");
		out.print("<h1>Pasword : "+pass+" </h1>");
		out.print("<h1>Gender : "+gen+" </h1>");
		out.print("<h1>Languages: </h1>");
		for(String l : lan) {
			out.print("<h1>"+l+" </h1>");
		}
		out.print("<h1>Address : "+addr+" </h1>");
		out.print("<h1>City : "+city+" </h1>");
		out.flush();
		out.close();
	}

}
