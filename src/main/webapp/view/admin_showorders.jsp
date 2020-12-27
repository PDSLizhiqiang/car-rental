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
            width: 16%;
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
    <div class="div_li">编号</div>
    <div class="div_li">订单号</div>
    <div class="div_li">用户</div>
    <div class="div_li">价格</div>
    <div class="div_li">下单时间</div>
    <div class="div_cz">删除</div>

</div>


<div class="div_main">

    <c:forEach items="${alldingdan}" var="dingdan"  varStatus="a" >
        <div class="div_li">${dingdan.id}</div>
        <div class="div_li">${dingdan.dingdanhao}</div>
        <div class="div_li">${dingdan.username}</div>
        <div class="div_li">${dingdan.price}</div>
        <div class="div_li">${dingdan.date}</div>
        <div class="div_cz">
            <a href="${pageContext.request.contextPath}/admin/deleteDingdan?id=${dingdan.id}">
                <button>删除订单</button></a>
        </div>


    </c:forEach>

</div>



</body>
</html>
