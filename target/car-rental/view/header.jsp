<%--
  Created by IntelliJ IDEA.
  User: LZQ
  Date: 2020/12/6
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
    <style>
        .div_header{
            background-color: black;
            height: 70px;
            width: 100%;
        }
        .toubu{
            font-size: 24px;
            color: #f2f2f2;
            float: left;
            margin-top: 7px;
            margin-left: 10px;
            margin-outside: 7px;
        }
        .div_youbian{
            margin-left: 1200px;
            padding-top: 11px;
        }
        .youbian{
            border: 1px solid #eeeeee;
            border-radius: 4px;
            padding:6px;
            margin: 5px;
            background: #4ecdc4;
        }
    </style>
</head>
<body>
<div class="div_header">
    <b class="toubu">有车行电动车租赁<span style="color: #4ecdc4">管理系统</span></b>
    <div class="div_youbian">

        <c:if test="${sessionScope.users!=null}">
            <a class="youbian" href="${pageContext.request.contextPath}/view/home.jsp">回到前台</a>
            <a class="youbian" href="">退出</a>
        </c:if>
    </div>
</div>
</body>
</html>
