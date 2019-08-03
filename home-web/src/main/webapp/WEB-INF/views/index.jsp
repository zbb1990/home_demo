<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <%--<script>alert("<%=path%>")</script>
    <script>alert("<%=basePath%>")</script>--%>
    <title>index Page</title>
    <script type="text/javascript" src="/resources/jquery-3.0.0.min.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function(){
            $.ajax({
                type: "get",
                async: false,
                url: "http://r.qzone.qq.com/cgi-bin/user/cgi_personal_card?uin=1032623261",
                dataType: "jsonp",
                jsonp: "callback",//传递给请求处理程序或页面的，用以获得jsonp回调函数名的参数名(一般默认为:callback)
                jsonpCallback:"flightHandler",//自定义的jsonp回调函数名称，默认为jQuery自动生成的随机函数名，也可以写"?"，jQuery会自动为你处理数据
                success: function(json){
//                    alert('您查询到航班信息：票价： ' + json.price + ' 元，余票： ' + json.tickets + ' 张。');
                    alert('ssss返回的json信息 ： ' + json);
                },
                error: function(json){
                    alert('ffff返回的json信息 ： ' + json);
                }
            });
        });
    </script>
</head>
<body>
<h2>Hello Ying!!!</h2>
</body>
</html>
