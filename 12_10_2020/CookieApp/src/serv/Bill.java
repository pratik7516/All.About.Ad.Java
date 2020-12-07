package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Bill")
public class Bill extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String> al = new ArrayList<>();
		
		Cookie arr[] = request.getCookies();
		if(arr!=null) {
			for(Cookie c : arr) {
				al.add(c.getValue());
			}
		}
		
		
		String i = request.getParameter("iron");
		if(i!=null) {
			al.add(i);
		}
		
		String m = request.getParameter("mixer");
		if(m!=null) {
			al.add(m);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<header>");
		out.print("<title>Bill");
		out.print("</title>");
		out.print("</header>");
		out.print("<body>");
		
		out.print("<h1>Items : </h1>");
		for(String itm : al) {
			out.print("<h2>"+itm+"</h2>");
		}
		out.print("</body>");
		out.print("</html>");
	}

}
