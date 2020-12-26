<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LZQ
  Date: 2020/12/24
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<style>

    .div_main{
        margin-left: 300px;
    }
    .div_li{
        width: 30%;
        float: left;
        height: 50px;
        font-size: 20px;

    }
</style>
<body>
        <div class="div_main">
            <c:forEach items="${ownBicycles}" var="ownbicycle"  varStatus="i" >
                <div class="div_li">
                <img src="${pageContext.request.contextPath}/images/${ownbicycle.path}"
                     width="200px" height="200px"/><br>
                <br>
                上传时间：${ownbicycle.time}<br>
                状态：<c:if test="${ownbicycle.status==0}">待审核</c:if>
                </div>
            </c:forEach>
        </div>
</body>
</html>
