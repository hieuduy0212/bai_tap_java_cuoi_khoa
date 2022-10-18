<%--
  Created by IntelliJ IDEA.
  User: HieuDuy
  Date: 10/16/2022
  Time: 9:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.104.2">
    <title>Admin Homepage</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/checkout/">
<link href="https://getbootstrap.com/docs/5.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <!-- Favicons -->
<link rel="apple-touch-icon" href="https://getbootstrap.com/docs/5.2/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
<link rel="manifest" href="https://getbootstrap.com/docs/5.2/assets/img/favicons/manifest.json">
<link rel="mask-icon" href="https://getbootstrap.com/docs/5.2/assets/img/favicons/safari-pinned-tab.svg" color="#712cf9">
<link rel="icon" href="https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Home-icon.svg/2048px-Home-icon.svg.png">
<meta name="theme-color" content="#712cf9">
    
    <!-- Custom styles for this template -->
    <link href="https://getbootstrap.com/form-validation.css" rel="stylesheet">
  </head>
  <body class="bg-light">
    
<div class="container">
  <main>
    <div class="py-5 text-center">
      <img class="d-block mx-auto mb-4" src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Home-icon.svg/2048px-Home-icon.svg.png" alt="" width="72" height="57">
      <h2>Admin Homepage</h2>
    </div>

    <div class="row g-5">
      <div class="col-md-5 col-lg-4 order-md-last">
        <h4 class="d-flex justify-content-between align-items-center mb-3">
          <span class="text-primary">Your option</span>
        </h4>
        <ul class="list-group mb-3">
          <li class="list-group-item d-flex justify-content-between lh-sm">
            <div>
              <h6 class="my-0"><a href="${pageContext.request.contextPath}/view/admin/staffs">Danh sách nhân viên</a></h6>
            </div>
          </li>
          <li class="list-group-item d-flex justify-content-between lh-sm">
            <div>
              <h6 class="my-0"><a href="${pageContext.request.contextPath}/view/logout">Đăng xuất</a></h6>
            </div>
          </li>
        </ul>

      </div>
      <div class="col-md-7 col-lg-8">
        <h4 class="mb-3">Information Admin</h4>
        <table class="table table-bordered">
            <tbody>
              <tr>
                <th>Fullname</th>
                <td><%=session.getAttribute("fullname")%></td>
              </tr>
              <tr>
                <th>Email</th>
                <td><%=session.getAttribute("email")%></td>
              </tr>
              <tr>
                <th>Username</th>
                <td><%=session.getAttribute("username")%></td>
              </tr>
              <tr>
                <th>Password</th>
                <td><%=session.getAttribute("password")%></td>
              </tr>
            </tbody>
          </table>
      </div>
    </div>
  </main>
</div>
    <script src="https://getbootstrap.com/docs/5.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
      <script src="form-validation.js"></script>
  </body>
</html>
