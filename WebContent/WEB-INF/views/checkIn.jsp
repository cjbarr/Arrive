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

<div class="checkInDiv">
    <div>
<h4>How are you feeling?</h4>
                <input type="radio" id="bad" name="checkInValue" value="bad">
                <label for="bad"><img class="face" src="<%=request.getContextPath()%>/resources/images/bad.png" alt="bad"> Bad</label>
                <input type="radio" id="notGood" name="checkInValue" value="notGood">
                <label for="notGood"><img class="face" src="<%=request.getContextPath()%>/resources/images/notgood.png" alt="not good"> Not Good</label>
                <input type="radio" id="neutral" name="checkInValue" value="neutral">
                <label for="neutral"><img class="face" src="<%=request.getContextPath()%>/resources/images/neutral.png" alt="neutral"> Neutral</label>
                <input type="radio" id="okay" name="checkInValue" value="okay">
                <label for="okay"><img class="face" src="<%=request.getContextPath()%>/resources/images/fair.png" alt="okay"> Okay</label>
                <input type="radio" id="great" name="checkInValue" value="great">
                <label for="great"><img class="face" src="<%=request.getContextPath()%>/resources/images/good.png" alt="great"> Great</label>
</div>     
<div>
    <h4>Describe your day:</h4>
    <textarea id="dayText"></textarea>
</div>



<input type="button" value="Check in.">

</div>


<footer>
<jsp:include page="footer.jsp"/>
</footer>
    
</body>

</html>