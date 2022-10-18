<%--
  Created by IntelliJ IDEA.
  User: HieuDuy
  Date: 10/16/2022
  Time: 10:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>login or signin</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/view/client/assets/css/index.css">
  </head>
  <body>
    <div class="container">
        <div class="header jumbotron text-center">
            <h1>Quản lý nhân vien</h1>
            <p>Welcome to my web</p>
        </div>
        <div class="nav">
            <ul>
                <li><a href="${pageContext.request.contextPath}/view/client/login">Đăng nhập</a></li>
                <li><a href="${pageContext.request.contextPath}/view/client/register">Đăng ký</a></li>
            </ul>
        </div>
    </div>
  </body>
</html>
