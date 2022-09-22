<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
	<c:url value="/novaempresa" var="linkServletNovaEmpresa" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro</title>
</head>
<body>
	<form action="${linkServletNovaEmpresa}" method="post">
	
		Nome: <input type="text" name="nome">
		Data Abertura <input type="text" name= "data"/>
		<input type="submit">
	</form>
</body>
</html>