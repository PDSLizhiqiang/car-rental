<%--
  Created by IntelliJ IDEA.
  User: LZQ
  Date: 2020/12/21
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"  isELIgnored="false"%>
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
            width: 300px;
            float: left;
            height: 50px;
            font-size: 20px;
        }
        .div_main{
            margin-left: 20%;
            background-color: #4ecdc4;
        }
        .div_tu{
            font-size: 20px;
            width: 100%;
            height: 50px;
        }
        .div_l2{
            font-size: 20px;
            width: 20%;
            float: left;
            height: 250px;
            font-size: 20px;
            background-color: white;
        }
        .div_main2{
            margin-left: 20%;
        }
        .div_l3{
            width: 20%;
            float: left;
            height: 250px;
            font-size: 20px;
        }
        button {
            width: 200px;
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
            font-size:125%
        }

    </style>
</head>

<body style="position: fixed">
    <div class="div_main">
        <div class="div_li">编号</div>
        <div class="div_li">价格</div>
        <div class="div_li">加购时间</div>
        <div class="div_tu">商品</div>
    </div>
    <div class="div_main2">
        <c:forEach items="${allGoodsCar}" var="carxiang"  varStatus="i" >
            <div class="div_l2">${carxiang.id}</div>
            <div class="div_l2">${carxiang.price}</div>
            <div class="div_l2">${carxiang.date}</div>
            <div class="div_l2">
                <img src="${pageContext.request.contextPath}/images/${carxiang.path}" style="width: 250px;height: 250px"/>
            </div>
            <div class="div_l3" >
              <a href="${pageContext.request.contextPath}/removeBicycle?id=${carxiang.id}"> <button>移除购物车</button></a><br>
              <a href="${pageContext.request.contextPath}/rentBicyclefromCar?username=${users.name}&price=${carxiang.price}&id=${carxiang.id}">  <button>租用</button></a>
            </div>
        </c:forEach>

    </div>



</body>
</html>
