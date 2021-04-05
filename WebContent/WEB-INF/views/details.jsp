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





<div class="detailsDiv">
    <h3> ${model.getDate()} Details</h3>
    <p>You were doing: ${model.getFeelValue()}</p>
    <img src="<%=request.getContextPath()%>/resources/images/${model.getFeelValue()}.png">
    <h4>You felt:  ${model.getCheckInText()} </h4>
	
	   
	  <form action= "editCheckIn/${model.getId()}" method="GET">

   <input type="submit" name="edit" value="Edit this Check In">
    </form> 
	   
	   <br>
	   
	<form action= "deleteCheckIn/${model.getId()}" method="POST">

   <input type="submit" name="delete" value="Delete this Check In">
    </form>
</div>


    <div>
    </div>

</div>
<footer>
<jsp:include page="footer.jsp"/>
</footer>
</div>

</body>

</html>