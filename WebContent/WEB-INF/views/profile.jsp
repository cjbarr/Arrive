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









    <div id="profileBody">
    
<h3 class="pageHeader">Profile</h3>
        <h4>Here are your account details</h4>
        <br>
        <br>
        <p><b>First Name:</b> ${model.getFirstName()}</p>
         <p><b>Last Name:</b> ${model.getLastName()}</p>
        <p><b>Email:</b> ${model.getEmail()}</p>
             <br>
                  <br>
                       
                            
        
        
  
	  <form action= "logOut" method="GET">

   <input type="submit" name="logOut" value="Log Out">
    </form> 
    



    </div>


<footer>
<jsp:include page="footer.jsp"/>
</footer>
</div>
</body>



</html>