<%--
  Created by IntelliJ IDEA.
  User: weisong5653
  Date: 2018/11/21
  Time: 8:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="resources/css/toCenter.css" rel="stylesheet">
    <script src="resources/jquery-3.3.1/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#create").click(function () {
                // var passengerId = $("#passengerId").val();
                var passengerName = $("#name").val();
                var passengerPhone = $("#phone").val();
                var passengerSex = $(".sex:checked").attr("value");
                var list = {name:passengerName,phone:passengerPhone,
                    sex:passengerSex};
                $.ajax({
                    type:"post",
                    //url路径一定要加/
                    url:"/createPassenger",
                    contentType:"application/json;charset=utf-8",
                    data:JSON.stringify(list),
                    success:function x(res) {
                        alert("注册乘客成功!");
                        window.location.href="/createOrder.jsp";
                    },
                    error:function x(res) {
                        alert("failure!");
                    }
                })
            })
        })
    </script>
</head>
<body>
        <table>
            <tr><td><h1>呼叫快车</h1></td></tr>
            <%--<tr><td><input type="text" placeholder="Id" id="passengerId"></td></tr>--%>
            <tr><td><input type="text" placeholder="Name" id="name"></td></tr>
            <tr><td><input type="text" placeholder="Phone" id="phone" ></td></tr>
            <tr><td><input type="radio" value="man" class="sex" name="sex">男&nbsp&nbsp
                <input type="radio" value="woman" class="sex" name="sex">女&nbsp&nbsp</td></tr>
            <tr><td><input type="button" id="create" value="提交"></td></tr>
        </table>
</body>
</html>
