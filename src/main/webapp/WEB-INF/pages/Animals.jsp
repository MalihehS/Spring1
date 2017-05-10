<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>animals-4</title>
    </head>
    <body>
        <h1>list of animals </h1>
             <ul>
                <c:forEach var="tst" items="${animals}">
                    <li>${tst}</li>
                </c:forEach>
            </ul>
    </body>
</html>
