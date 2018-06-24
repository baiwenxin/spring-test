<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/23
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑页面</title>
</head>
<body>
<table>
    <tr>
        <td>学员姓名</td>
        <td><input type="text" name="sname" value="sname"></td>
    </tr>
    <tr>
        <td>学员年龄</td>
        <td><input type="text" name="sage" value="sage"></td>
    </tr>
    <tr>
        <td>出生日期</td>
        <td><input type="text" name="sbirthday" value="sbirthday"></td>
    </tr>
    <tr>
        <td><input id="sub" name="sub" type="button" value="保存"></td>
    </tr>
</table>
</body>
<script src="/js/jquery-1.8.3.js"></script>
<script>
    $(function () {
        $("#sub").click(function () {
            addstudent();
        });
    })

    function addstudent() {
        var sname = $("input[name='sname']").val();
        var sage = $("input[name='sage']").val();
        var sbirthday = $("input[name='sbirthday']").val();
        $.post("/student/addStudent?sname=" + sname + "&sage=" + sage + "&sbirthday=" + sbirthday, function (data) {
            if (data = "ok") {
                alert("新增成功！")
                location.href = "/student/list/index"
            } else {
                alert("新增失败！")
                location.href = "/student/addInfp/edit";
            }
        })
    }
</script>
</html>
