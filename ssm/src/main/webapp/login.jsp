<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>登录</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

</head>

<body class="gray-bg">

    <div class="middle-box text-center loginscreen animated fadeInDown">
        <div>
            <div>
                <h1 class="logo-name">IN+</h1>
            </div>
            <h3>欢迎进入+</h3>
            <p>完美的设计和精确的管理主题与超过50页的新的网络应用程序视图。
                <!--Continually expanded and constantly improved Inspinia Admin Them (IN+)-->
            </p>
            <p>登录进去。在行动中看到它。</p>
            <form class="m-t" role="form" action="user/login" method="post">
                <div class="form-group">
                    <input type="text" class="form-control" name="username" placeholder="用户名" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" name="password" placeholder="密码" required="">
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">登录</button>

                <a href="#"><small>忘记密码?</small></a>
                <p class="text-muted text-center"><small>没有账户?</small></p>
                <a class="btn btn-sm btn-white btn-block" href="register.html">创建账户</a>
            </form>
            <p class="m-t"> <small>我们的应用程序主要基于Bootstrap 3 &copy; 2014</small> </p>
        </div>
    </div>
    <!-- Mainly scripts -->
    <script src="js/jquery-2.1.1.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>
