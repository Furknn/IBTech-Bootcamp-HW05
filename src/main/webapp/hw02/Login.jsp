<%@ page import="com.bootcamphw.hw02.manager.UserManagerLocal" %>
<%@ page import="com.bootcamphw.hw02.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	UserManagerLocal um= new UserManagerLocal();
		String username=(String)request.getParameter("Username");
		String password=(String)request.getParameter("Password");
    	User user=um.findByUsername(username);	
    	
    	boolean correct=true;
    	if(user!=null&&!user.getPassword().equals(password)){
    		correct=false;
    	}else{
    		response.sendRedirect("Home.jsp");
    	}
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Login.jsp" method="POST">
Username:<input type="text" name="Username" value="<%=username%>"/><br/><br/>
Password:<input type="password" name="Password" value="<%=password%>"/><br/><br/>
<input type="submit" value="Login" name="calculated"/><br/>
</form>
</body>
</html>