<%@ page import="com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh">

<head>
    <style>
        .div_header{
            background-color: black;
            height: 45px;
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
        <b class="toubu">百色电动车租赁<span style="color: #4ecdc4">管理系统</span></b>
        <div class="div_youbian">

            <c:if test="${sessionScope.users!=null}">
                <a class="youbian" style="color: white">欢迎您：${sessionScope.users.name }</a>
                <a class="youbian" href="index.jsp">个人中心</a>
                <a class="youbian" href="logout">注销</a>
            </c:if>

        </div>

    </div>
</body>

</html>
