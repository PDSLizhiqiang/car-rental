<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%--
  Created by IntelliJ IDEA.
  User: hyn
  Date: 2020/12/17
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<h3>用户注册</h3>

<%--@elvariable id="user" type="com.zq.bean.User"--%>
<form:form  modelAttribute="user" method="post" action="adduser" >
    <table>

        <tr>
            <td>用户名：</td>
            <td><form:input path="name" type="text" name="name"/></td>
            <td><form:errors path="name" cssStyle="color:red"/></td>
        </tr>

        <tr>
            <td>密 码：</td>
            <td><form:input path="password" type="password" name="passwd"/></td>
            <td><form:errors path="password" cssStyle="color:red"/></td>
        </tr>

        <tr>
            <td>电 话：</td>
            <td><form:input path="phone" type="text" name="phone"/></td>
            <td><form:errors path="phone" cssStyle="color:red"/></td>
        </tr>

        <tr>
            <td>地 址：</td>
            <td><form:input path="address" type="text" name="address"/></td>
            <td><form:errors path="address" cssStyle="color:red"/></td>
        </tr>


        <tr>
            <td><input type="submit" value="提交"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
