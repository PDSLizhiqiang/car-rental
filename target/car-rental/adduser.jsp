<%--
  Created by IntelliJ IDEA.
  User: 31861
  Date: 2020/12/27
  Time: 0:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <style>
        .div_main{
            margin-left: 300px;
        }
    </style>
</head>
<body>
<div class="div_main">

    <form method="post" action="/adduser" >
        <table>
            <tr>
                <td>账号名：</td>
                <td><input path="name"/></td>
            </tr>
            <tr>
                <td>昵称：</td>
                <td><input path="nickname"/></td>
            </tr>
            <tr>
                <td>联系方式：</td>
                <td><input path="phone"/></td>
            </tr>
            <tr>
                <td>住址：</td>
                <td><input path="address"/></td>
            </tr>
            <tr>
                <td align="center" colspan="2">
                    <input type="submit" value="修改"/>
                </td>
            </tr>

        </table>

    </form>

</div>
</body>
</html>
