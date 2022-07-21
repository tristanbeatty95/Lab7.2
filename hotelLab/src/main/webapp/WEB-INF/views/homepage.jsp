<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Triscuit's Hotel Empire</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>

<h1>Search For a Hotel</h1>
<br>
<br>
<br>

<h2>City:</h2>
<br>
<form action="/results">
<select name="city">
<option value="Mobil, Alabama">Mobil, Alabama</option>
<option value="Chicago, Illinois">Chicago, Illinois</option>
<option value="Detroit, Michigan">Detroit, Michigan</option>
</select>
<br>
<br>
<input type="submit" value="Search">
</form>
</body>
</html>