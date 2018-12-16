<%--
  Created by IntelliJ IDEA.
  User: weisong5653
  Date: 2018/12/16
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="resources/js/sockjs.min.js">
    <script src="resources/jquery-3.3.1/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            ws = new WebSocket("ws://"+window.location.host+"/websocket");

            ws.onopen = function (evnt) {
                console.log("passenger连接到weksocket");
            };
            //接收到消息
            ws.onmessage = function (evnt) {
                console.log(evnt.data);
                window.location.href = "/pay.jsp";
            };
            ws.onerror = function (evnt) {
                console.log(evnt);
            };
        })
    </script>
</head>
<body>
    <p1>等待结单中....</p1>
</body>
</html>
