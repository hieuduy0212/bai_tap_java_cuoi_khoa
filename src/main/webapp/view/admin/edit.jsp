<%@ page import="com.hieuduy.baitapjavaweb.model.User" %><%--
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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
    <title>Edit staff</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="p-3 m-0 border-0 bd-example">
    <div class="container">
        <form method="post" action="${pageContext.request.contextPath}/view/admin/edit">
            <div class="mb-3">
                <h1>Edit information</h1>
            </div>
            <%User user = (User)request.getAttribute("user");%>
            <div class="mb-3">
                <label class="form-label">#ID</label>
                <input type="text" class="form-control" name="id" value="<%=user.getId()%>" readonly>
            </div>
            <div class="mb-3">
                <label class="form-label">Fullname</label>
                <input type="text" class="form-control" name="fullname" value="<%=user.getFullname()%>">
            </div>
            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="text" class="form-control" name="email" value="<%=user.getEmail()%>">
            </div>
            <div class="mb-3">
                <label class="form-label">Username</label>
                <input type="text" class="form-control" name="username" value="<%=user.getUsername()%>" disabled>
            </div>
            <div class="mb-3">
                <label class="form-label">Password</label>
                <input type="text" class="form-control" name="password" value="<%=user.getPassword()%>">
            </div>
            <button type="submit" class="btn btn-primary">Edit</button>
        </form>
    </div>
</body>
</html>
