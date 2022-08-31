<%@page import="com.bootcamphw.hw02.manager.UserManagerLocal"%>
<%@page import="com.bootcamphw.hw02.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String username=request.getAttribute("Username")==null?null:(String)request.getAttribute("Username");
    String password=request.getAttribute("Password")==null?null:(String)request.getAttribute("Password");
    boolean userExists=false;
    if(!(username==null&&(password==null))){
    	
    	UserManagerLocal um=new UserManagerLocal();
    	if(um.findByUsername(username)==null)
    	{
    		User user=new User(); 
        	user.setUsername((String)request.getAttribute("Username"));
        	user.setPassword((String)request.getAttribute("Password"));
        	um.insert(user);
        	response.sendRedirect("Login.jsp");
        	userExists=false;
    	}else{
    		userExists=true;
    	}
    	
    	
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
<input type="submit" value="Sign In" name="calculated"/><br/>
<% if(userExists){ %>
	<p>This user already exits</p>
<%} %>
</form>
</body>
</html>