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
    

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/foundation-sites@6.6.3/dist/css/foundation.min.css"
        integrity="sha256-ogmFxjqiTMnZhxCqVmcqTvjfe1Y/ec4WaRj/aQPvn+I=" crossorigin="anonymous">
        
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css"/>

</head>

<body>


<div class="pageDiv">
<header>
   <jsp:include page="header.jsp"/> 
</header>


<div class="pageWrap">
<div class="checkInDiv">




<h3 class="pageHeader">How are you feeling?</h3>

			<form action= "checkIn/addCheckIn" method="POST">
			
				<h4>Today's date: <%= java.time.LocalDate.now()%></h4>
				<br>
                <input type="radio" id="bad" name="checkInValue" value="Bad">
                <label for="bad"><img class="face" src="<%=request.getContextPath()%>/resources/images/Bad.png" alt="bad"> Bad</label>
                <input type="radio" id="poor" name="checkInValue" value="Poor">
                <label for="notGood"><img class="face" src="<%=request.getContextPath()%>/resources/images/Poor.png" alt="poor"> Poor</label>
                <input type="radio" id="neutral" name="checkInValue" value="Neutral">
                <label for="neutral"><img class="face" src="<%=request.getContextPath()%>/resources/images/Neutral.png" alt="neutral"> Neutral</label>
                <input type="radio" id="okay" name="checkInValue" value="Okay">
                <label for="okay"><img class="face" src="<%=request.getContextPath()%>/resources/images/Okay.png" alt="okay"> Okay</label>
                <input type="radio" id="great" name="checkInValue" value="Great">
                <label for="great"><img class="face" src="<%=request.getContextPath()%>/resources/images/Great.png" alt="great"> Great</label>
	

   

    <h4>Describe your day:</h4>
    <textarea id="dayText" name="description"></textarea>




<input type="submit" name="add" value="Check In">
</form>


</div>

</div>

<jsp:include page="footer.jsp"/>

    </div>
</body>

</html>