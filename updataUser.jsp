<%--
  Created by IntelliJ IDEA.
  User: xiaodap
  Date: 2020/12/10
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
    <title>校园电动车租赁管理系统</title>
  <script type="text/javascript">
        function check(form){
            if(form.username.value==""){
                alert("请输入用户名,不可为空!");
                form.username.focus();
                return false;
            }

            if(form.password.value==""){
                alert("请输入密码,不可为空!");
                form.password.focus();
                return false;
            }
            if(isNaN()){
                alert("请输入整数年龄!")
                form.age.focus();
                return false;
            }

        }

    </script>
 </head>
<body>
用户名<input name="username" type="text"><br>
                            姓名 <input name="name" type="text"><br>
                            性别<input name="sex" type="radio" value="boy" checked>男
                                <input name="sex" type="radio" value="girl">女<br>
                            年龄<input name="age" type="number"size="2"><br>
                            电话<input name="phone" type="number" size="11"><br>

                            <c:if test="${sessionScope.role!=0 }">
                                <div class="form-group">
                                    <label class="control-label col-md-2">状态</label>
                                    <div class="col-md-5 col-xs-10">
                                        <c:if test="${v.status=='未审核' }">
                                            <span class="label label-warning label-mini">未审核</span>
                                        </c:if>
                                        <c:if test="${v.status=='已审核' }">
                                            <span class="label label-success label-mini">已审核</span>
                                        </c:if>
                                    </div>
                                </div>
                            </c:if>
                            <input type="submit" value="修改">
                            </div>
                        </form>
                    </div>
              
                </div>
                <!-- /col-lg-12 -->
            </div>
</body>

</html>
