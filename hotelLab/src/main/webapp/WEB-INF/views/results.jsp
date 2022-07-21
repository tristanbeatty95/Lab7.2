<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Results</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
	<h1>Search Results For ${city}:</h1>

<br>
<br>
<table>
<c:forEach var="hotels" items="${hotels}">
<tr>
<td>
${hotels.hotelName}
<br>
Nightly Price: $ ${hotels.pricePerNight}
<br>
</td>
</tr>
</c:forEach>
</table>
<br>
<br>
<br>
<a href="/" class="button">Search a different city</a>
</body>
</html>