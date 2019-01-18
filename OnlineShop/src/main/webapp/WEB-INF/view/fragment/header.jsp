<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<nav class="navbar navbar-default">
		<div class="container-fluid">
		
			<div class="navbar-header">
      			<a class="navbar-brand" href="#">OnlineShop</a>
    		</div>
    		
    		<ul class="nav navbar-nav">
    		
    			<li><a href="#">Home</a></li>
    		
    			<li class="dropdown">
          			
          			<!-- <a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false">Register <span class="caret"></span></a> -->
          	
          			<%-- <ul class="dropdown-menu" role="menu">
            			<li><a href="<spring:url value="/OnlineShop/login"/>">Login</a></li>
            			<li><a href="<spring:url value="/OnlineShop/Alldata" />">Register</a></li>
          			</ul> --%>	
        		</li>
        		
    			<%-- <li class="dropdown">
          		
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false">Resources <span class="caret"></span></a>
          		
          			<ul class="dropdown-menu" role="menu">
          			
            			<li><a href="<spring:url value="/resource/add"/>">Add</a></li>
            			<li><a href="<spring:url value="/resource/find"/>">Find</a></li>
          			</ul>
        		
        		</li>
        		<li>${currentDate}</li> --%>
    		</ul>
    		
		</div>
</nav>



</body>
</html>