<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh">
<head>


<script type="text/javascript">
	var ids=${sessionScope.ids};
	
	function location(){//控制试题的操作
  var ids=${sessionScope.ids};
  for(var i=0;i<ids.length;i++){
	  var select = document.getElementById("#btn"+ids[i]+"-select").value;
	  var delet = document.getElementById("#btn"+ids[i]+"-delete").value;
	  if(select=="#btn"+ids[i]+"-select"){
		  window.location.href = "TeacherController?type=showSubject&num="+ids[i]; 
	  }else if(update=="#btn"+ids[i]+"-update"){
		  window.location.href = "TeacherController?type=beforeUpdateSubject&num="+ids[i];
	  }else if(delet=="#btn"+ids[i]+"-delete"){
		  window.location.href = "TeacherController?type=deleteSubject&num="+ids[i];
	  }
  }
}

	function location1(num) {
		for(var i=0;i<ids.length;i++){
			if(num==ids[i]){
				window.location.href = "TeacherController?type=showSubject&num="+ids[i]; 
			}
		} 
	}

	function location2(num) {
		for(var i=0;i<ids.length;i++){
			if(num==ids[i]){
				window.location.href = "TeacherController?type=deleteSubject&num="+ids[i];
			}
		} 
	}
</script>
<style type="text/css">
	
	#container {
    width: 100%;
    height: 100%;
    background-color: red;
}


#main-content {
    margin-left: 210px;
    background-color: green;
}

.wrapper {
    display: inline-block;
    margin-top: 60px;
    padding-left: 15px;
    padding-right: 15px;
    padding-bottom: 50px;
    padding-top: 0px;
    width: 100%;
    background-color: yellow;
}
	.div1 {
	margin-top: 20px;
	padding-top: 50px;
	padding-left: 200px;
	float: right;
	width: 1005px;
	height: 686px;
	border: solid 2px black;
}
.mt {
	margin-top: 25px;
}
.content-panel {
	background: #ffffff;
	box-shadow: 0px 3px 2px #aab2bd;
	padding-top: 10px;
	padding-bottom: 15px;
	 background-color: pink;
}
.fa-angle-right:before {
  content: "\f105";
}
.fa {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}
.pull-right {
  margin-right: 100px;
  float: right;
}
.mail-src-position {
    margin-top:-3px;
}
.form-inline .form-control  {
 {
	margin-left: 20px;
	width: 100%
}

.btn-theme02 {
  color: #fff;
  background-color: #ac92ec;
  border-color: #967adc;
}
  .btn {
        margin-bottom: 5px;
    }
    #div1 {
    	 background-color: green
    }
</style>
</head>

<body>
  <section id="container">
<%--     <%@include file="header.jsp" %>
    <%@include file="sidebar.jsp" %> --%>
    <!--main content start-->
    <section id="main-content">
      <!--管理员-->
      <section class="wrapper">
        <div class="mt">
        <div class="col-md-12">
          <div class="content-panel">
            <h4>
              <i class="fa fa-angle-right"></i> 订单管理
              <form action=" orders/list" class="pull-right mail-src-position form-inline" id="searchForm">
              	<input type="hidden" name="page" id="page"/>
                <div>
                 <input type="text" class="form-control" name="orderno" placeholder="关键字">
                  <button type="submit" class="btn btn-theme02">搜索</button>
                </div>
              </form>
            </h4>
            <hr>
      		<div id="div1">wi</div>
			<table border="1" cellpadding="2" cellspacing="1" >
				<tr>
				  <th>编号</th>
	              <th>订单号</th>
	              <th>会员</th>
	              <th>下单时间</th>
	              <th>总价</th>
	              <th>状态</th>
	              <th>操作</th>
				</tr>
				 <c:forEach items="${list }" var="v" varStatus="st">
	            <tr>
	              <td>${st.count }</td>
	              <td>${v.orderno }</td>
	              <td>${v.users.name }</td>
	              <td>${v.optime }</td>
	              <td>${v.price }元</td>
	              <td>${v.status}</td>
				  <td align="center"><button  id="btn${v.id}-select" onclick="location1(${v.id})">查看</button>&nbsp;&nbsp;
				   <button  id="btn${v.id}-delete"  onclick="location3(${v.id})">删除</button></td>
					</tr>
				</c:forEach>			
			</table>
		</div>
		</div>
        </div>
      
	  </section>
      </section>
  </section>
  
</body>

</html>
