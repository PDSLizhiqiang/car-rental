<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LZQ
  Date: 2020/11/22
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>自行车展示界面</title>
    <script>


    </script>
</head>
<body>
<c:forEach items="${allBooksList}" var="book"  varStatus="i" >
    <form method="post" action="${pageContext.request.contextPath}/AddBookController?name=${book.name}&price=${book.price}&path=${book.path}">
        <div class="book_ico" style="float:left;margin: 20px">
                <%--        ${file.getName()}--%>
            <img src="${pageContext.request.contextPath}/images_books/${book.path}" width="200px" height="200px"/><br>
            书名:${book.name}<br>
            价格:${book.price}<br>
            库存:${book.kucun}<br>
            <c:if test="${Session_role == '普通用户'}">
                <input type="submit" value="加入购物车" />
            </c:if>
        </div>

    </form>
</c:forEach>
</body>
</html>
