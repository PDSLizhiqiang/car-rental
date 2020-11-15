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
    <title>欢迎登录</title>
    <style type="text/css">
        body{
            background: url("./images/login_images/03.jpg");
             background-repeat:no-repeat;
            background-size:1500px 720px;
            background-position-x:50%;
        }

    </style>
    <script>

        function myfun() {
            var loginName = document.getElementById('loginName');
            var loginPwd = document.getElementById('loginPwd');
        }

        //登录button绑定的函数，用于再客户端验证用户输入的信息格式是否正确
        function login() {


            // alert("绑定成功")

            var loginName = document.getElementById('loginName').value;
            var loginPwd = document.getElementById('loginPwd').value;

            // alert(loginPwd+loginName);
            if(loginPwd=="" || loginName==""){
                alert("用户信息不能为空");
                return false;
            }else {
                search();
            }


        }
        function search() {
            var xmlHttp = new XMLHttpRequest();
            xmlHttp.onreadystatechange = function () {
                if(xmlHttp.readyState == 4 && xmlHttp.status == 200){
                    var respText = xmlHttp.responseText;
                    if(respText=="/view/home.jsp"){
                        window.location.href = "view/home.jsp";
                    }
                    else{
                        alert(respText);

                    }

                }

            }
            var loginName = document.getElementById('loginName').value;
            var loginPwd = document.getElementById('loginPwd').value;
            var para = "?username="+loginName+"&password="+loginPwd;
            xmlHttp.open("get","user/login.do"+para,true);
            xmlHttp.send();
            alert("send后")

        }






    </script>
</head>
<body  onload="myfun()">

    <div id="top" style="height: 50px; background-color: #3C3C3C; width: 100%;">
        <div style="position: absolute; top: 5px; left: 0px; font-size: 30px; font-weight: 400; color: white; font-family: 'times new roman'">校园车行&nbsp;<span style="font-size: 12px;">您喜欢的我们都有</span></div>
    </div>

    <div style="position: absolute; top: 120px; right: 100px;width:450px;height:400px;border:1px solid #D5D5D5">
        <div style="position: absolute; top: 0px; right: 60px;">
            <div class="page-header">
                <h1 style="color:greenyellow;">登录</h1>
            </div>
            <form action="workbench/index.jsp" class="form-horizontal" >
                <div class="form-group form-group-lg">
                    <div style="width: 350px;">
                        <input class="form-control" type="text" placeholder="用户名" id="loginName">
                    </div>
                    <div style="width: 350px; position: relative;top: 20px;">
                        <input class="form-control" type="password" placeholder="密码" id="loginPwd">
                    </div>
                    <div class="checkbox"  style="position: relative;top: 30px; left: 10px;">

                        <span id="msg" style="color: red"></span>

                    </div>

                    <button type="button" id="submitBtn" onclick="login()" class="btn btn-primary btn-lg btn-block"  style="width: 350px; position: relative;top: 45px;">登录</button>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
