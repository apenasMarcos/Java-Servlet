<%@page
	import="java.io.IOException, br.com.marcos.gerenciador.domains.Empresa, java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/removeempresa?id=" var="linkServletRemoveEmpresa" />
<c:url value="/mostraempresa?id=" var="linkServletMostraEmpresa" />


<html>
<head>
<meta charset="UTF-8">
<title>Lista Empresas</title>
</head>
<body>
	<c:if test="${not empty empresa}">
			Empresa ${empresa} cadastrada com sucesso!
		</c:if>

	Lista de empresas:
	<br />

	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nome }-<fmt:formatDate
					value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" /> <a
				href="${linkServletRemoveEmpresa}${empresa.id}">remove</a> <a
				href="${linkServletMostraEmpresa}${empresa.id}">editar</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>