<%--
  Created by IntelliJ IDEA.
  User: LZQ
  Date: 2020/12/6
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .div-main{
            background-color: black;
            height: 100%;
            width: 200px;
        }
        .sidebar-menu{
            margin: -2px 0 0;
            padding: 0;
        }
        .name{
            color: white;
            font-weight: 200;
            margin-top: 0px;
            padding-top: 15px;
            padding-left: 30px;
        }
        .li{
            margin-top: 25px;
            padding-left: 30px;
        }
    </style>
</head>
<body>
<div  class="div-main">
    <!-- sidebar menu start-->
    <ul class="sidebar-menu">
        <h5 class="name">欢迎您:${sessionScope.users.name }</h5>

        <c:if test="${sessionScope.role==1 }">
            <li class="li">
                <a href="">
                    <span>首页</span>
                </a>
            </li>

            <li class="li">
                <a href="">
                    <i class="fa fa-cart-plus"></i><span>我的购物车</span>
                </a>
            </li>
            <li class="li">
                <a href="">
                    <i class="fa fa-book"></i><span>我的订单</span>
                </a>
            </li>
            <li class="li">
                <a href="">
                    <i class="fa fa-comments-o"></i><span>留言管理</span>
                </a>
            </li>
            <li class="li">
                <a href="">
                    <i class="fa fa-user"></i><span>个人中心</span>
                </a>
            </li>
            <li class="li">
                <a href="">
                    <i class="fa fa-cogs"></i><span>修改密码</span>
                </a>
            </li>
        </c:if>
    </ul>
    <!-- sidebar menu end-->
</div>
</body>
</html>
