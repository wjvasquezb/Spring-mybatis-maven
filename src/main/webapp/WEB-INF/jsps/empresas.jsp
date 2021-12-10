<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DEMO</title>
</head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<body>

	<div class="container">
		<h1>Lista de  Empresas</h1>
		
		<hr />
		<table border="1" class="table table-striped table-bordered">
			<thead class="thead-dark">
				<tr>
					<th>Razón Social</th>

				</tr>
			</thead>
			<c:forEach items="${empresalista}" var="e">

				<tbody>
					<tr>
						<td>${e.nombre}</td>

					</tr>
				</tbody>
			</c:forEach>
		</table>
	</div>

</body>
</html>