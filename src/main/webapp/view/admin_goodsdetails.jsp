<%--
  Created by IntelliJ IDEA.
  User: 31861
  Date: 2020/12/26
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background-color: #eeeeee;
        }
        .table_main{
            margin-left: 500px;
            background-color:white;
        }
        .td1{
            text-align: left;
            height: 100px;
            width: 200px;
            margin: 30px 30px 30px 30px;
            text-decoration: underline;
            font-size: 30px;
            color: darkgrey;
        }
        .td2{
            color: darkgrey;
            margin-top: 20px;
            font-size: 30px;
        }
        .td_button{
            margin-left: 100px;
        }
    </style>
</head>
<body>
<%@include file="header.jsp"%>

<form action="<%= request.getContextPath()%>/admin/showcar">
    <table class="table_main">

        <tr>
            <td class="td1">名称</td>
            <td ><input name="name" class="td2" readonly="true" type="text" value="${bicycle.name}"/></td>
        </tr>
        <tr>
            <td class="td1">价格</td>
            <td ><input  class="td2" name="price" readonly="true" type="text" value="${bicycle.price}"></td>
        </tr>
        <tr>
            <td class="td1">图片</td>
            <td class="td2"><img src="${pageContext.request.contextPath}/images/${bicycle.path}" width="600px" height="300px"/></td>
        </tr>
        <tr>
            <td>
                <input  class="td1" type="text" value="${users.name}"  name="username" readonly="true"/>
            </td>
            <td class="td_button">
                <input type="submit" name="submit" value="删除"  style="color: #4ecdc4;width: 60px;height: 60px;font-size: 25px">
                <input type="submit" name = "submit" value="返回"  style="color: #4ecdc4;width: 60px;height: 60px;font-size: 20px">
            </td>
        </tr>
    </table>
</form>


</body>
</html>
