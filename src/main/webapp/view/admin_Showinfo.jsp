<%--
  Created by IntelliJ IDEA.
  User: 31861
  Date: 2020/12/26
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    .div_li{
        width: 30%;
        float: left;
        height: 50px;
        font-size: 20px;

    }
    .div_main{
        margin-left: 20%;
    }
    button {
        float: left;
        width: 100%;
        padding:8px;
        background-color: #428bca;
        border-color: #357ebd;
        color: #fff;
        -moz-border-radius: 10px;
        -webkit-border-radius: 10px;
        border-radius: 10px; /* future proofing */
        -khtml-border-radius: 10px; /* for old Konqueror browsers */
        text-align: center;
        vertical-align: middle;
        border: 1px solid transparent;
        font-weight: 900;
        font-size:125%;
        border: solid 1px;
    }
</style>

<body>
<div class="div_main">

    <c:forEach items="${infoBicycles}" var="ownbicycle"  varStatus="i" >
        <div class="div_li">
        <img src="${pageContext.request.contextPath}/images/${ownbicycle.path}"
             width="200px" height="200px"/><br>
        上传时间：${ownbicycle.time}<br>
        状态：<c:if test="${ownbicycle.status==0}">待审核</c:if>
            <a href="${pageContext.request.contextPath}/admin/ShenHe?id=${ownbicycle.id}">
                <button>同意</button></a>&nbsp;&nbsp;
            <a href="${pageContext.request.contextPath}/admin/QxShenHe?id=${ownbicycle.id}">
                <button>拒绝</button></a>
        <br>
        </div>
    </c:forEach>
</div>
</body>
</html>

