<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/22
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        .modal-title{
            background-color: #4CAF50;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .modal-dialog {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 1px;
        }
        .form-control{
            width: 60%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            margin-top: 6px;
            margin-bottom: 16px;
            resize: vertical;
        }
        .zhuce {
            background-color: #4CAF50;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .quxiao{
            background-color:#45a049;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;

        }

        .
    </style>
    <title>Title</title>
</head>
<body>
    <div class="modal-dialog">
            <form action="" method="post" onsubmit="return check()">
                <div class="modal-header">
                    <h3 class="modal-title">注册---请填写以下资料</h3>
                </div>
                <div class="modal-body">
                    <div >
                        <input type="text" id="username" name="username" class="form-control" placeholder="用户名" required onblur="checkUsername()"/>
                    </div>
                    <div >
                        <input type="password" id="pass1" name="password" class="form-control" placeholder="密码" required/>
                    </div>
                    <div >
                        <input type="password" id="pass2" class="form-control" placeholder="确认密码" required/>
                    </div>
                    <div >
                        <input type="text" name="name" class="form-control" placeholder="姓名" required/>
                    </div>
                    <div class="sex">
                        性别：
                        <label class="radio-inline">
                            <input type="radio" name="sex" value="男" checked> 男
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="sex" value="女"> 女
                        </label>
                    </div>
                    <div>
                        <input type="number" name="age" class="form-control" placeholder="年龄" required/>
                    </div>
                    <div>
                        <input type="text" name="phone" class="form-control" pattern="\d{11}" placeholder="电话" required/>
                    </div>
                </div>
                <div class="modal-footer">
                    <button data-dismiss="modal" class="quxiao" type="button">取消</button>
                    <button class="zhuce" type="submit">注册</button>
                </div>
            </form>
        </div>

</body>
</html>
