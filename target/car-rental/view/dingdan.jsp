<%--
  Created by IntelliJ IDEA.
  User: LZQ
  Date: 2020/12/21
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .div_li{
            width: 250px;
            float: left;
            height: 50px;
            font-size: 20px;
        }
        .div_tim{
            width: 400px;
            float: left;
            height: 50px;
            font-size: 20px;
        }
        .div_main{
            margin-left: 300px;
        }
    </style>
</head>

<body>
    <div class="div_main">
        <div class="div_li">编号</div>
        <div class="div_li">订单号</div>
        <div class="div_li">用户</div>
        <div class="div_li">价格</div>
        <div class="div_tim">下单时间</div>

    </div>
    <div class="div_main">
        <c:forEach items="${dingdanlist}" var="dingdan"  varStatus="i" >
            <div class="div_li">${dingdan.id}</div>
            <div class="div_li">${dingdan.dingdanhao}</div>
            <div class="div_li">${dingdan.username}</div>
            <div class="div_li">${dingdan.price}</div>
            <div class="div_tim">${dingdan.date}</div>
        </c:forEach>

    </div>


</body>
</html>
