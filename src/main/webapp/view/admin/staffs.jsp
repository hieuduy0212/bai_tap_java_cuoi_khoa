<%@ page import="java.util.List" %>
<%@ page import="com.hieuduy.baitapjavaweb.model.User" %>
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
<link rel="icon" href="https://cdn-icons-png.flaticon.com/512/149/149347.png">
<meta name="theme-color" content="#712cf9">
    
    <!-- Custom styles for this template -->
    <link href="https://getbootstrap.com/form-validation.css" rel="stylesheet">
  </head>
  <body class="bg-light">
    
<div class="container">
  <main>
    <div class="py-5 text-center">
      <img class="d-block mx-auto mb-4" src="https://cdn-icons-png.flaticon.com/512/149/149347.png" alt="" width="72" height="57">
      <h2>List of staff</h2>
      <p class="lead">Information of staffs will be showed here</p>
      <a href="${pageContext.request.contextPath}/view/admin/homepage">Trang chủ</a>/<a href="${pageContext.request.contextPath}/view/logout">Đăng xuất</a>
    </div>
    <div class="container text-center">
      <form class="row" method="get" action="${pageContext.request.contextPath}/view/admin/search">
        <div class="col-3"></div>
        <div class="col-6">
          <input type="password" class="form-control" name="name_search" placeholder="Nhập tên muốn tìm">
          <br>
          <button type="submit" class="btn btn-primary mb-3">Tìm kiếm</button>
        </div>
        <div class="col-3"></div>
      </form>
    </div>
    <table class="table">
        <thead>
          <tr>
            <th scope="col">#id</th>
            <th scope="col">Fullname</th>
            <th scope="col">Email</th>
            <th scope="col">Username</th>
            <th scope="col">Password</th>
            <th scope="col">Action</th>
          </tr>
        </thead>
        <tbody>
          <% List<User> listuser = (List<User>)request.getAttribute("listuser");%>
          <%if(listuser == null || listuser.isEmpty()){%>
            <th>Không có nhân viên nào</th>
          <%}else{%>
            <%for(User x : listuser) {%>
              <tr>
                <th scope="row"><%=x.getId()%></th>
                <td><%=x.getFullname()%></td>
                <td><%=x.getEmail()%></td>
                <td><%=x.getUsername()%></td>
                <td><%=x.getPassword()%></td>
                <td>
                  <a href="${pageContext.request.contextPath}/view/admin/edit?id=<%=x.getId()%>">Sửa</a>/<a href="${pageContext.request.contextPath}/view/admin/delete?id=<%=x.getId()%>">Xóa</a>
                </td>
              </tr>
            <%}%>
          <%}%>
        </tbody>
      </table>
  </main>
</div>
    <script src="https://getbootstrap.com/docs/5.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
      <script src="form-validation.js"></script>
  </body>
</html>

