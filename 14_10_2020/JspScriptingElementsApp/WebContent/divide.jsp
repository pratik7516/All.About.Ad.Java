<%@ page errorPage="error_page.jsp" %>
<%@ include file="header.jsp"  %>

<%!
	int res;
	void div(int i,int j){
		res = i/j;
	}
%>
<% 
	String p1 = request.getParameter("num1");
	String p2 = request.getParameter("num2");
	int a = Integer.parseInt(p1);
	int b = Integer.parseInt(p2);
	div(a,b);
%>
<%=res%>
<h1 style="background-color: gray;color: blue;" >
	<%="Result = "+res+""%>
</h1>

