<%--
  Created by IntelliJ IDEA.
  User: HieuDuy
  Date: 10/16/2022
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Register</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="/assets/css/register.css">
      </head>
<body>
    <div class="container">
      <h1>Register</h1>
      <input type="hidden" id="status" value="<%=request.getAttribute("status")%>">
        <form action="${pageContext.request.contextPath}/view/client/register" method="post">
            <div class="mb-3">
                <label class="form-label">Fullname</label>
                <input type="text" class="form-control" name="fullname" placeholder="vd: Nguyễn Văn A">
              </div>
              <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="text" class="form-control" name="email" placeholder="vd: abc@gmail.com">
              </div>
            <div class="mb-3">
              <label class="form-label">Username</label>
              <input type="text" class="form-control" name="username" placeholder="vd: abc123">
            </div>
            <div class="mb-3">
              <label class="form-label">Password</label>
              <input type="password" class="form-control" name="password" >
            </div>
            <br>
            <button type="submit" class="btn btn-primary">Register</button>
          </form>
    </div>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <script type="text/javascript">
      var status = document.getElementById("status").value;
      if(status == "invalidFullname"){
        swal({title:"Missing your fullname", text:"Please enter your fullname", icon:"error"});
      }else if(status == "invalidEmail"){
        swal({title:"Missing your email", text:"Please enter your email", icon:"error"});
      }else if(status == "invalidUsername"){
        swal({title:"Missing your username or your username contain space", text:"Please enter your username", icon:"error"});
      }else if(status == "invalidPassword"){
        swal({title:"Missing your password", text:"Please enter your password", icon:"error"});
      }else if(status == "failRegister"){
          swal({title:"Sorry!", text:"Username is exists!", icon:"error"});
      }
    </script>
</body>
</html>