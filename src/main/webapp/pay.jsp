<%--
  Created by IntelliJ IDEA.
  User: weisong5653
  Date: 2018/11/22
  Time: 1:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="resources/css/toCenter.css" rel="stylesheet">
    <script src="resources/jquery-3.3.1/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#handleButton").click(function () {
                var amount = $("#amount").val();
                var evalution = $("#evalution").val();
                var score = $("#score").val();
                var payWay = $(".payType:checked").val();
                var list = {amount:amount,evalution:evalution,score:score,payWay:payWay};
                $.ajax({
                    type:"post",
                    //url路径一定要加/
                    url:"createPay",
                    contentType:"application/json;charset=utf-8",
                    data:JSON.stringify(list),
                    success:function x(res) {
                        alert("欢迎下次乘坐!");
                        window.location.href="/createPassenger.jsp";
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
        <tr><td>已到达目的地</td></tr>
        <tr><td>金额：<input type="text" id="amount"></td></tr>
        <tr><td>评价：<input type="text" id="evalution"></td></tr>
        <tr><td>评分：<input type="text" id="score"></td></tr>
        <tr><td><input type="radio" class="payType" name="payType" value="wechat">微信&nbsp&nbsp
                <input type="radio" class="payType" name="payType" value="alipay">支付宝</td></tr>
        <tr><td><input type="button" id="handleButton" value="完成"></td></tr>
    </table>
</body>
</html>
