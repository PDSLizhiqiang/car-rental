<%--
  Created by IntelliJ IDEA.
  User: LZQ
  Date: 2020/11/7
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>欢迎</title>
    <style>
        .div1{
           /* background: url(images/back.jpg) no-repeat;
            background-size: 100%;*/
            height: 100%;
            width: 100%;

        }
        .form-login {
            max-width: 330px;
            margin: 100px auto 0;
            -webkit-border-radius: 5px;
            border-radius: 5px;
            border: 5px solid #96C2F1;

        }
        h2{
            text-align: center;
            background: #4ecdc4;
            padding: 25px 20px;
            font-weight: 300;
            font-size: 20px;
        }
        .form-input{
            width: 100%;
            margin: 20px 5px 5px 5px ;
            height: 30px;
        }
        .form-submit{
            width: 100%;
            margin: 20px 5px 5px 5px ;
            height: 30px;
            background: #4ecdc4;

        }
        .login-div{
            padding: 20px;
        }
    </style>
    <script>

       function x() {
           if(mess!=null)
        alert(mess)
       }
    </script>
</head>
<body >
<div >
    <div class="div1">
        <form class="form-login" action="<%= request.getContextPath()%>/user/login">
            <h2 >登录</h2>
            <div class="login-div">
                <input type="text" class="form-input" name="username" placeholder="用户名" >
                <br>
                <input type="password" class="form-input" name="password" placeholder="密码">
                <input type="submit" class="form-submit" value="登录">
                <hr>
                <div class="registration" style="text-align: center;">
                    没有账号?<br/>
                    <a  href="">注册一个</a>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
