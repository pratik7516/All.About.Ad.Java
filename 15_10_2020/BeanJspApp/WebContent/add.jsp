<%@page import="dto.Student"%>
<%

	Student student = new Student();
	
	String p1 = request.getParameter("rollNo");
	int rn = Integer.parseInt(p1);
	student.setRno(rn);
	
	String p2 = request.getParameter("name");
	student.setStudentName(p2);
	
	String p3 = request.getParameter("fee");
	float fee = Float.parseFloat(p3);
	student.setFee(fee);
	
	String p4 = request.getParameter("crs");
	student.setCourse(p4);
	
	session.setAttribute("student", student);
	response.sendRedirect("show.jsp");
	
%>