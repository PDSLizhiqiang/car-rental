<%--
  Created by IntelliJ IDEA.
  User: LZQ
  Date: 2020/12/23
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>

    .div_main{
        margin-left: 300px;
    }
</style>
<body>


<div class="div_main">
    <form action="addInf" enctype="multipart/form-data" method="post">
        <table>
            <tr>
                <td>车辆描述：</td>
                <td><input type="text" name="description"/></td>
            </tr>
            <tr>
                <td>价格：</td>
                <td><input type="text" name="price" /></td>
            </tr>
            <tr>
                <td>请选择车辆图片：</td>
                <td><input type="file" name="file" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="上传" /></td>
            </tr>
        </table>

    </form>
</div>
</body>
</html>
