<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Arrive App</title>

<link rel="stylesheet" href="/resources/css/style.css">

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/style.css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/foundation-sites@6.6.3/dist/css/foundation.min.css"
	integrity="sha256-ogmFxjqiTMnZhxCqVmcqTvjfe1Y/ec4WaRj/aQPvn+I="
	crossorigin="anonymous">

</head>

<body>
	<div class="pageDiv">
		<header>

			<jsp:include page="header.jsp" />

		</header>


		<div class="pageWrap">

			<h3 class="pageHeader">
				Here's your Arrive snapshot: <br> <img class="face"
					src="<%=request.getContextPath()%>/resources/images/Bad.png"
					alt="bad"> <img class="face"
					src="<%=request.getContextPath()%>/resources/images/Poor.png"
					alt="poor"> <img class="face"
					src="<%=request.getContextPath()%>/resources/images/Neutral.png"
					alt="neutral"> <img class="face"
					src="<%=request.getContextPath()%>/resources/images/Okay.png"
					alt="okay"> <img class="face"
					src="<%=request.getContextPath()%>/resources/images/Great.png"
					alt="great">
			</h3>



			<div class="pixelDisplay">
				<c:forEach items="${model.checkIn}" var="pixel">

					<div class="${model.user.getPixelPref()}-${pixel.getFeelValue()}"
						onClick="window.location='checkIn/details/${pixel.getId()}'">


					</div>
				</c:forEach>
			</div>



			<div>
				<h4></h4>
			</div>

			<div style="width: 15vw; margin-left: auto; margin-right: auto;">
				<form action="pixelUpdate" method="GET">
					<label for="pixel">Check in Display:</label> <select name="pixel"
						id="pixel">
						<option value="box"></option>
						<option value="pixel">Circles</option>
						<option value="box">Squares</option>



					</select> <input type="submit" name="update" value="Update Preference">
				</form>

			</div>
		</div>

		<jsp:include page="footer.jsp" />

	</div>
</body>

</html>