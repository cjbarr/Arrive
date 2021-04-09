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

</head>

<body>
<div class="pageDiv">

<header>

   <jsp:include page="header.jsp"/> 

</header>


<div class="pageWrap">

<h3 class="pageHeader">The Arrive Blog</h3>

<c:if  test="${model.user.admin ==true}" >
<div>
  <form action ="blogPost" method="POST">
  <label for="blogTitle">Blog Title:</label>
               <input name ="blogTitle" type="text">
                 <label for="bPicUrl">Blog Pic Url:</label>
               <input name = "bPicUrl" type="text">
                 <label for="blogText">Blog Text:</label>
      <textarea id="blogText" name="blogText"></textarea>

      <input type="submit" name="update" value="Post Blog">             
    </form>    
        
</div>
<br>
</c:if>



<c:forEach items="${model.blog}" var="item">
<div class="blogDiv">


	<h2 class="blogTitle">${item.getTitle()}</h2>
     <img class="blogPic" src="${item.getImageLink()}" alt="blog1Pic">
     <p style="background-color:white; padding:.5rem; font-weight:500">${item.getBlogText()}</p>

 </div>    
 <br>
       </c:forEach>
     




</div>


<jsp:include page="footer.jsp"/>

</div>
</body>

</html>