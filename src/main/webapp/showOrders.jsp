<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: weisong5653
  Date: 2018/11/21
  Time: 10:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="resources/css/toCenter.css" rel="stylesheet">
    <script src="resources/jquery-3.3.1/jquery-3.3.1.min.js"></script>
    <style type="text/css">
        table tr th{
            padding: 20px;
        }
    </style>
    <script type="text/javascript">
        $(function () {
            $("#dealButton").click(function () {
                var orderId = $("choiceOrder:checked").val();
                var list = {orderId:orderId};
                $.ajax({
                    type:"post",
                    //url路径一定要加/
                    url:"/createOrder",
                    contentType:"application/json;charset=utf-8",
                    data:JSON.stringify(list),
                    success:function x(res) {
                        alert("获取订单成功!");
                    },
                    error:function x(res) {
                        alert("failure!");
                    }
                })
            })
            ws = new WebSocket("ws://"+window.location.host+"/websocket");

            ws.onopen = function (evnt) {
                console.log("driver连接到websocket");
            };
            //接收到消息
            ws.onmessage = function (evnt) {
                console.log(evnt.data);
                var data = JSON.parse(evnt.data);
                $("#orders").css("display","none");
                console.log(data.amount);
                $("#amount").text(data.amount);
                $("#score").text(data.score);
                $("#evalution").text(data.evalution);
                $("#feedback").css("display","block");
            };
            ws.onerror = function (evnt) {
                console.log(evnt);
            };


        })
    </script>
</head>
<body>

    <table id="orders">
        <tr>
            <th>订单ID</th>
            <th>乘客ID</th>
            <th>订单创建时间</th>
            <th>订单状态</th>
        </tr>
        <c:forEach items="${listOrders}" var="order">
            <tr>
                <td>${order.id}</td>
                <td>${order.passengerId}</td>
                <td>${order.createTime}</td>
                <td>${order.state}</td>
                <td><input type="radio" class="choiceOrder" value="${order.id}" name="choiceOrder"></td>
            </tr>
        </c:forEach>
        <tr><td><input type="button" id="dealButton" value="提交"></td></tr>
    </table>
    <table id="feedback" style="display: none">
        <tr><th>收到订单结果</th></tr>
        <tr><td>金额：</td><td id="amount"></td></tr>
        <tr><td>评价：</td><td id="evalution"></td></tr>
        <tr><td>评分：</td><td id="score"></td></tr>
    </table>
</body>
</html>
