
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of birds 3!</h1>
        <c:forEach var="tst" items="${bitdtesting}">
            <c:if test="${n=='Crow'}">
                        <li> bird!${n} </li>
            </c:if>

        <li>${tst}</li>
        </c:forEach>
</body>
</html>
