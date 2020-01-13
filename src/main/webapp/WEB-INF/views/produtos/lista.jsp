<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livros de Java, Android, iPhone, PHP, Ruby e muito mais - Casa do Código</title>
</head>
<body>
	<h1>Lista de produtos</h1>
	<table>
		<tr>
			<td>Titulo</td>
			<td>Descrição</td>
			<td>Paginas</td>
		</tr>
		<c:forEach items="${produtos}" var= "produto">
			<tr>
				<td>${produto.titulo }</td>
				<td>${produto.descricao }</td>
				<td>${produto.paginas }</td>
				
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>