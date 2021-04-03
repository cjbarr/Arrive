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


<h1>Welcome to Arrive Home</h1>
<p>Arrive is an application that asks users to take a moment and check in. By quantifying your emotions and daily experiences,
     you can look back and see that often days are 
    better than they appear.
</p>

<ul>
<c:forEach items="${model.blog}" var="item">
    ${item}<br>



     <li>${item.getId()} </li>
     <li>${item.getBlogText()} </li>
     <li><img class="blogPic" src="${item.getImageLink()}" alt="blog1Pic"> </li>
     
       </c:forEach>
     
</ul>



<footer>
<jsp:include page="footer.jsp"/>
</footer>
</body>

</html>