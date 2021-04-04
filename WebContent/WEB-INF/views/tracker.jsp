<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <script type="text/javascript" src="script/script.js"></script>
</head>

<body>

<header>

   <jsp:include page="header.jsp"/> 

</header>





<h3>Here's your visual snapshot:</h3>

<div class="pixelDisplay">
<c:forEach items="${model.checkIn}" var="pixel">
	<div class ="pixel-${pixel.getFeelValue()}"></div>
 </c:forEach>
</div>




<h4>Snapshot Details:</h4>

<c:forEach items="${model.checkIn}" var="item">
    <p>On ${item.getDate()}, you felt:<a href="details">${item.getFeelValue()}</a></p>
  </c:forEach>


<div>
<h4></h4>
    </div>

<footer>
<jsp:include page="footer.jsp"/>
</footer>

</body>

</html>