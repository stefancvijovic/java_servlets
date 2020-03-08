<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<%
		String errorF="";
		if(request.getAttribute("errorF")!=null){
			errorF=(String)request.getAttribute("errorF");
		}
		String errorS="";
		if(request.getAttribute("errorS")!=null){
			errorS=(String)request.getAttribute("errorS");
		}
		String errorR="";
		if(request.getAttribute("errorR")!=null){
			errorR=(String)request.getAttribute("errorR");
		}
		String first;
		String second;
		int result=0;
		if(request.getAttribute("first")!=null){
			first=(String)request.getAttribute("first");
		}
		else {
			first = "0";
		}
		if(request.getAttribute("second")!=null){
			second=(String)request.getAttribute("second");
		}
		else {
			second = "0";
		}
		if(request.getAttribute("result")!=null){
			result=(Integer)request.getAttribute("result");
		} else {
			result = 0;
		}
		
	%>

	<form action="../MyWebApp01/servletone" method="post">
	
				  
		1. NUMBER <input type="text" id="first" name="first" value ='<%=first%>'/>
				  <br/>
				  <%=errorF%>
				  <br/>
		2. NUMBER <input type="text" id="second" name="second" value ='<%=second%>'/>
				  <br/>
				  <%=errorS%>
				  <br/>
		RESULT:   <input type="text" id ="text" name = "text" value ='<%=result%>'/>
		 		  <br/>
		 		  <%=errorR%>
				  <br/>
				  <input type="submit" id="plus" name="plus" value="plus"/>
				  <input type="submit" id="minus" name="minus" value="minus"/>
	</form>
</body>
</html>