<%--
  Created by IntelliJ IDEA.
  User: LZQ
  Date: 2020/12/23
  Time: 17:07
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
   <<div class="div_main">
        <%--@elvariable id="user" type="com.zq.bean.User"--%>
        <form:form modelAttribute="user" method="post" action="xiugai" >
            <table>
                <tr>
                    <td>账号名：</td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td>昵称：</td>
                    <td><form:input path="nickname"/></td>
                </tr>
                <tr>
                    <td>性别：</td>
                    <td><form:radiobuttons path="sex" items="${sexList}"/></td>
                </tr>
               <tr>
                    <td>联系方式：</td>
                    <td><form:input path="phone"/></td>
                </tr>
                <tr>
                    <td>住址：</td>
                    <td><form:input path="address"/></td>
                </tr>
                <tr>
                    <td align="center" colspan="2">
                        <input type="submit" value="修改"/>
                    </td>
                </tr>

            </table>

        </form:form>

    </div>
</body>
</html>
