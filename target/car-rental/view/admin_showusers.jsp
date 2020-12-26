<%--
  Created by IntelliJ IDEA.
  User: LZQ
  Date: 2020/12/21
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        .div_li{
            width: 12%;
            float: left;
            height: 50px;
            font-size: 20px;
            border: solid 1px;
        }

        .div_cz{
            width: 19%;
            float: left;
            height: 50px;
            font-size: 20px;
            border: solid 1px;
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
</head>
<body >
<div class="div_main">
    <div class="div_li">姓名</div>
    <div class="div_li">密码</div>
    <div class="div_li">状态</div>
    <div class="div_li">电话</div>
    <div class="div_li">地址</div>
    <div class="div_cz">删除</div>
    <div class="div_cz">修改</div>
</div>


<div class="div_main">

    <c:forEach items="${userArrayList}" var="users"  varStatus="a" >
        <div class="div_li">${users.name}</div>
        <div class="div_li">${users.password}</div>
        <div class="div_li">${users.lockState}</div>
        <div class="div_li">${users.phone}</div>
        <div class="div_li">${users.address}</div>
        <div class="div_cz">
            <a href="${pageContext.request.contextPath}/admin/DeleteUser?username=${users.name}">
                <button>删除用户</button></a>

        </div>
        <div class="div_cz">
            <a href="${pageContext.request.contextPath}/admin/UpdataLockState?username=${users.name}">
                <button>解封/封用户</button></a>
        </div>

    </c:forEach>

</div>



</body>
</html>
