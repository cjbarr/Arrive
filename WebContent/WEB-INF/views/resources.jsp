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
    <script type="text/javascript" src="script/script.js"></script>
</head>

<body>

<header>

   <jsp:include page="header.jsp"/> 

</header>




    <h4>Here are some resources regarding mental health:</h4>
    <ul>
    
    
     <li>${model.resource.get(0).getId()} </li>
     <li>${model.resource.get(0).getDescription()} </li>
        <li>${model.resource.get(0).getWeb()} </li>
     <li><img  src="${model.resource.get(0).getLogoPic()}" alt="Pic"> </li>
        <li>http://www.mhresources.org/</li>
        <li>https://www.samhsa.gov/find-help/national-helpline</li>
        <li>https://namimn.org/support/resources/general-mental-health-resources/</li>
        <li>https://mentalhealthmn.org/support/community-resources/statewide-mental-health-resources/</li>

    </ul>

   <footer>
<jsp:include page="footer.jsp"/>
</footer>

</body>

</html>