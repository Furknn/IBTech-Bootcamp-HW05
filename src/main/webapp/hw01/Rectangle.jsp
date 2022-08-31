<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.bootcamphw.hw01.math.RectangleCalc" %>

    <%
    
    String width = request.getParameter("Width");
    String height =  request.getParameter("Height");
    double widthDouble= 0.0;
    double heightDouble= 0.0;
    
    try{
    	widthDouble= Double.parseDouble(width);
    	heightDouble= Double.parseDouble(height);
    }catch(Exception e){    	
    	e.printStackTrace();
    }
    RectangleCalc rect = new RectangleCalc(widthDouble,heightDouble);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Rectangle.jsp" method="POST">
Genislik:<input type="text" name="Width" value="<%=width%>"/><br/><br/>
Yukseklik:<input type="text" name="Height" value="<%=height%>"/><br/><br/>
<input type="submit" value="Hesapla" name="calculated"/><br/>

Alan: <%= rect.getArea() %><br/>
Cevre: <%= rect.getPerimeter() %>
</form>
</body>
</html>