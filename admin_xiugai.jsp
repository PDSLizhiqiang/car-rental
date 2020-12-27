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

    <form method="post" action="<%= request.getContextPath()%>/admin/xiugai" >
        <table>
            <tr>
                <td>账号名：</td>
                <td><input type="text" name="name" id="name"/></td>
            </tr>
            <tr>
                <td>旧密码：</td>
                <td><input type="password" name="oldpasswd" id="oldpasswd"/></td>
            </tr>
            <tr>
                <td>新密码：</td>
                <td><input type="password" name="newpasswd" id="newpasswd"/></td>
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
