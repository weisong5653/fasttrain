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
                // var driverId = $("#driverId").val();
                var plateNumber = $("#plateNumber").val();
                var carType = $("#carType").val();
                var phone = $("#phone").val();
                var color = $("#color").val();
                var proofIdentity = $("#proofIdentity").val();
                var list = {phone:phone,plateNumber:plateNumber,carType:carType,
                    color:color,proofIdentity:proofIdentity};
                $.ajax({
                    type:"post",
                    //url路径一定要加/
                    url:"/createDriver",
                    contentType:"application/json;charset=utf-8",
                    data:JSON.stringify(list),
                    success:function x(res) {
                        alert("注册司机成功!");
                        window.location.href="/showOrders.jsp";
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
        <tr><td><h1>注册司机</h1></td></tr>
        <%--<tr><td><input type="text" placeholder="Id" id="driverId"></td></tr>--%>
        <tr><td><input type="text" placeholder="phone" id="phone"></td></tr>
        <tr><td><input type="text" placeholder="plateNumber" id="plateNumber"></td></tr>
        <tr><td><input type="text" placeholder="carType" id="carType" ></td></tr>
        <tr><td><input type="text" placeholder="color" id="color"></td></tr>
        <tr><td><input type="text" placeholder="proofIdentity" id="proofIdentity" ></td></tr>
        <tr><td><input type="button" id="create" value="注册"></td></tr>
    </table>
</body>
</html>
