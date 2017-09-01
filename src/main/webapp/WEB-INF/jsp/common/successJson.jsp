<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 28/7/2017
  Time: 下午 4:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>成功</p>
    <h1>${requestScope.get("cat")}</h1>
    <h1>${cat}</h1>
        <tr>
            <table>

                <%--<input type="text" value="${cat.name}"/>--%>

            </table>



        </tr>

</body>
</html>
