<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LZQ
  Date: 2020/12/6
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>个人中心</title>
</head>
<body style="background-color: #eeeeee">
    <%@include file="header.jsp" %>
    <%@include file="zuobian.jsp" %>
        <c:if test="${path=='dingdan'}">
            <%@include file="dingdan.jsp"%>
        </c:if>
        <c:if test="${path=='gouwuche'}">
            <%@include file="gouwuche.jsp"%>
        </c:if>
        <c:if test="${path=='showuserinfo'}">
            <%@include file="showuserinfo.jsp"%>
        </c:if>
        <c:if test="${path=='addCar'}">
            <%@include file="addCar.jsp"%>
        </c:if>

        <c:if test="${path=='showOwnerCar'}">
            <%@include file="showownercar.jsp"%>
        </c:if>
</body>
</html>
