<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/alterarempresa?id=" var="linkServletEditarEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Empresa a ser editada</title>
</head>
<body>

	Empresa a ser alterada:

	<form action="${linkServletEditarEmpresa}${empresa.id}" method="post">

		Nome: <input type="text" name="nome" value="${empresa.nome}">
		Data Abertura - <input type="text" name="data"
			value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />" />
		<input type="submit">
	</form>
</body>
</html>