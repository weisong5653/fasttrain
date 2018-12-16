<%--
  Created by IntelliJ IDEA.
  User: weisong5653
  Date: 2018/11/21
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="resources/css/toCenter.css" rel="stylesheet">
    <link href="resources/js/sockjs.min.js" rel="stylesheet">
    <script src="resources/jquery-3.3.1/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#send").click(function () {
                var origin = $("#origin").val();
                var terminus = $("#terminus").val();
                var list = {origin:origin,terminus:terminus}
                $.ajax({
                    type:"post",
                    //url路径一定要加/
                    url:"/createOrder",
                    contentType:"application/json;charset=utf-8",
                    data:JSON.stringify(list),
                    success:function x(res) {
                        alert("创建订单成功!");
                        window.location.href="/waitTakeOrders.jsp";
                    },
                    error:function x(res) {
                        alert("failure!");
                    }
                })
            })
        })
    </script>
    <title>Title</title>
</head>
<body>
    <table>
        <tr><td><input type="text" id="origin" placeholder="起点"></td></tr>
        <tr><td><input type="text" id="terminus" placeholder="终点"></td></tr>
        <tr><td><input type="button" value="提交" id="send"></td></tr>
    </table>
</body>
</html>
