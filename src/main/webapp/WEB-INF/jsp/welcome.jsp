<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<!-- 
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Spring Boot</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">

		<div class="starter-template">
			<h1>Welcome to Friends Suggestor Using Image ! ! !</h1>
<%-- 			<h2>Message: ${message}</h2> --%>
		</div>

	</div>
	<!-- /.container -->
	<br/>
	<table style="width: 100px;">
	<tr>
	     <td>
     <form method="POST" action="/uploadpraveen" enctype="multipart/form-data">
     
     
	     	 <label>Praveen Photo Upload &nbsp;<input type="file" name="file" id="file" /></label>
	    	 <label><input type="submit" name="button" id="button" value="Submit" /></label>
	     
	    
   
     
</form>
</td>
 <td>
  <form method="POST" action="/uploadsenthil" enctype="multipart/form-data">
<!--      <table style="width: 100px;"> -->
<!--      <tr> -->
	  
	     
	     	 <label>Senthil Photo Upload &nbsp;<input type="file" name="file" id="file" /></label>
	    	 <label><input type="submit" name="button" id="button" value="Submit" /></label>
	 
	  
<!--      </tr> -->
<!--      </table> -->
</form>
    </td>
     <td>
  <form method="POST" action="/uploadvinoth" enctype="multipart/form-data">
<!--      <table style="width: 100px;"> -->
<!--      <tr> -->
	   
	     
	     	 <label>Vinoth Photo Upload &nbsp;<input type="file" name="file" id="file" /></label>
	    	 <label><input type="submit" name="button" id="button" value="Submit" /></label>
	    
<!--      </tr> -->
 
</form>
 </td>
   </tr>
    </table>
	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
