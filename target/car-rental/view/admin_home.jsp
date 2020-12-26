<%@ page import="com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const" %>
<%@ page import="com.zq.service.imp.BicyclesImp" %>
<%@ page import="com.zq.bean.Bicycle" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"
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
            margin-left: 1000px;
            padding-top: 11px;
        }
        .youbian{
            border: 1px solid #eeeeee;
            border-radius: 4px;
            padding:6px;
            margin: 5px;
            background: #4ecdc4;
        }
        /*搜索部分css*/
        .search-fon{
            color: #fff;
            background-color: #ac92ec;
            border-color: #967adc;
            height: 60px;
            width: 100px;
        }
        .form-01{
            text-align: center;
            margin-left: 10px;
        }
        .div-search{
            font-weight: 900;
        }
        .search-btn{
            width: 300px;
            height: 60px;
            background: #34495e;
            padding:0 5px 0 35px;
            margin-top: 2px;
            border: none;
            color: #fff;
        }
        .div_shangping{
            width: 900px;
            float: right;
        }
        .div_liutittle{
            font-size: 50px;
            text-align: center;
            color: white;
            width: 500px;
            height: 100px;
            background-color:#4ecdc4;
        }
        .div_liuwai{
            width: 500px;
            height: 600px;
            background-color: #eeeeee;
        }
    </style>
</head>
<%
    BicyclesImp bicyclesImp = new BicyclesImp();
    List<Bicycle> allbicycles = bicyclesImp.getAllbicycles();
    request.getSession().setAttribute("bicycleList",allbicycles);

%>
<body>
<div class="div_header">
    <b class="toubu">有车行电动车租赁<span style="color: #4ecdc4">管理系统</span></b>
    <div class="div_youbian">

        <c:if test="${sessionScope.admin!=null}">
            <a class="youbian" style="color: white">欢迎管理员：${sessionScope.admin.name}</a>
            <a class="youbian" href="${pageContext.request.contextPath}/view/admin_person.jsp">个人中心</a>
            <a class="youbian" href="${pageContext.request.contextPath}/login.jsp">注销</a>
        </c:if>
    </div>
</div>

<%--<div class="div-search">--%>
    <%--<form action="" class="form-01" >--%>
        <%--<input type="text" name="name" value="${name}" placeholder="关键字" class="search-btn">--%>
        <%--<button type="submit" class="search-fon">搜索</button>--%>
    <%--</form>--%>
<%--</div>--%>

<div class="div_shangping">

    <c:forEach items="${bicycleList}" var="bicycle"  varStatus="i" >
        <div class="book_ico" style="float:left;margin:20px"
             onclick="location='${pageContext.request.contextPath}/admin/getBicycleById?id=${bicycle.id}'">

            <img src="${pageContext.request.contextPath}/images/${bicycle.path}" width="200px" height="200px"/><br>
            产品:${bicycle.name}<br>
        </div>
    </c:forEach>

</div>
<div class="div_liuwai">
    <div class="div_liutittle">用户留言</div>
</div>>

</body>

</html>
