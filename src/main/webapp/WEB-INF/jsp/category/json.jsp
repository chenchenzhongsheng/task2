<%--
  Created by IntelliJ IDEA.
  User: BSR
  Date: 2017/8/29
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>

<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>




  <%--  <json:array name="category" var="category" items="${category}>
    <json:object>
        <json:object>
            <json:property name="name" value="${category.name}"/>
            <json:property name="id" value="${category.id}" />

</json:object>
</json:array>

</json:object>--%>
 <%--   <json:object>

        <json:array name="category" var="category" items="${category}">
            <json:object>
                <json:property name="name" value="${category.name}"/>
                <json:property name="id" value="${category.id}" />


            </json:object>
        </json:array>
        <json:object>--%>
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

</body>
</html>
