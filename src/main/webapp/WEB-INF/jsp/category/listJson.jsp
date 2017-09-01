<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%--
  Created by IntelliJ IDEA.
  User: BSR
  Date: 2017/8/27
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
<%--<c:forEach items="${user}" var="user" varStatus="st">
    <tr>
        <td>

            <p>name:${user.name}</p>
            <p>id:${user.id}</p>
            <p>qq:${user.qq}</p>
            <p>style:${user.style}</p>
            <p>estimated_time:${user.estimated_time}</p>
            <p>graduate_institutions:${user.graduate_institutions}</p>
            <p>online_id:${user.online_id}</p>
            <p>daily_link:${user.daily_link}</p>
            <p>pledge:${user.pledge}</p>
            <p>senior_tutor:${user.senior_tutor}</p>
            <p>source:${user.source}</p>
            <p>create_at:${user.create_at}</p>

        </td>
    </tr>
</c:forEach>--%>
<json:object>

    <json:array name="st" var="user" items="${user}">
        <json:object>
            <json:property name="id" value="${user.id}" />
            <json:property name="name" value="${user.name}"/>
            <json:property name="qq" value="${user.qq}" />
            <json:property name="style" value="${user.style}" />
            <json:property name="estimated_time" value="${user.estimated_time}" />
            <json:property name="graduate_institutions" value="${user.graduate_institutions}" />
            <json:property name="online_id" value="${user.online_id}" />
            <json:property name="daily_link" value="${user.daily_link}" />
            <json:property name="pledge" value="${user.pledge}" />
            <json:property name="senior_tutor" value="${user.senior_tutor}" />
            <json:property name="source" value="${user.source}" />
            <json:property name="create_at" value="${user.create_at}" />
            <json:property name="updata_at" value="${user.updata_at}" />

        </json:object>
    </json:array>

</json:object>
</html>
