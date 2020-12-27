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
<%@include file="admin_header.jsp" %>
<%@include file="admin_zuobian.jsp" %>
<c:if test="${path=='showallorder'}">
    <%@include file="admin_showorders.jsp"%>
</c:if>
<c:if test="${path=='showalluser'}">
    <%@include file="admin_showusers.jsp"%>
</c:if>
<c:if test="${path=='shenhe'}">
    <%@include file="admin_Showinfo.jsp"%>
</c:if>

<c:if test="${path=='xiugai'}">
    <%@include file="admin_xiugai.jsp"%>
</c:if>

<c:if test="${path=='zhuce'}">
<%@include file="admin_addAdmin.jsp"%>
</c:if>

<c:if test="${path=='admin'}">
    <%@include file="admin_showadmin.jsp"%>
</c:if>




</body>
</html>
