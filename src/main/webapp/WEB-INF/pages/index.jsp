<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <body>
        <h2>Spring MVC and List Example</h2>

        <c:if test="${not empty names}">

            <ul>
                <c:forEach var="name" items="${names}">
                    <c:if test="${name=='Maliheh'}">
                        <li>bara mitt namn! ${name}</li>
                    </c:if>

                </c:forEach>
            </ul>
        </c:if>

        <c:if test="${not empty testing}">
            <ul>
                <c:forEach var="tst" items="${testing}">
                    <li>${tst}</li>
                    </c:forEach>
            </ul>

        </c:if>

    </body>
</html>
