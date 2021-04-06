<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Arrive App</title>
   
    <link rel="stylesheet" href="/resources/css/style.css">
    
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/foundation-sites@6.6.3/dist/css/foundation.min.css"
        integrity="sha256-ogmFxjqiTMnZhxCqVmcqTvjfe1Y/ec4WaRj/aQPvn+I=" crossorigin="anonymous">

</head>





<body>
<div class="pageDiv">


<header>

   <jsp:include page="header.jsp"/> 

</header>

<div class="pageWrap">



	  <form action= "logInAttempt" method="GET">
	  
	  
		<label>Email</label> 	<input type="text" name="email"><br>
	<label>Password</label> 		<input type="text" name="password">

   <input type="submit" name="logIn" value="Log In">
    </form> 



    </div>

</div>
<footer>
<jsp:include page="footer.jsp"/>
</footer>
</div>
</body>



</html>