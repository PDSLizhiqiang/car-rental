<%--
  Created by IntelliJ IDEA.
  User: 31861
  Date: 2020/12/26
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        .div_li{
            width: 49%;
            float: left;
            height: 50px;
            font-size: 20px;
            border: solid 1px;
        }

        .div_main{
            margin-left: 20%;
        }
    </style>
</head>
<body >
<div class="div_main">
    <div class="div_li">管理员名称</div>
    <div class="div_li">管理员密码</div>
</div>


<div class="div_main">
        <div class="div_li">${allAdmin.name}</div>
        <div class="div_li">${allAdmin.password}</div>





</div>



</body>
</html>
