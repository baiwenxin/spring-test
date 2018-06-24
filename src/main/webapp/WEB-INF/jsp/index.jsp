<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/15
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示页面</title>
</head>
<body>
<a href="/student/addinfo">添加学员</a>
    <table>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>出生日期</td>
            <td>操作</td>
        </tr>
        <c:forEach var="e" items="${slist}">
            <tr>
                <td>${e.id}</td>
                <td>${e.sname}</td>
                <td>${e.sage}</td>
                <td>${e.sbirthday}</td>
                <td ><a href='javascript:void(0)' onclick='getdel(${e.id})' >删除</a></td>"
            </tr>
        </c:forEach>
    </table>
</body>
<script src="/js/jquery-1.8.3.js"></script>
<script>
    function getdel(id) {
        alert(id);
        $.post("/student/delInfo?id="+id,function(result){
            alert(result);
            if (result=="ok") {
                alert('删除成功');
                location.href="student/list";
            }else{
                alert("删除失败");
            }
        })
    }
</script>
</html>
