<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/10/2021
  Time: 3:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Home Product</h2>
    <table class="table">
        <a href="/home?action=create" type="button" class=" btn btn-warning">create hocvien</a>
        <br>
        <form action="/home" method="get">
            <input type="text" class="form-control" placeholder="Tìm kiếm tên" name="findByName">
            <input type="hidden" name="action" value="finByName">
            <button type="submit" class="btn btn-success">FindBy</button>
        </form>
        <thead>
        <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>dia chi</th>
            <th>So dien thoai</th>
            <th>email</th>
            <th>lop hoc</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="hocvien" varStatus="loop">
            <tr>
<%--                <td>${hocvien.id}</td>--%>
                <td>${hocvien.ten}</td>
                <td>${hocvien.ngaySinh}</td>
                <td>${hocvien.diaChi}</td>
                <td>${hocvien.soDienThoai}</td>
                <td>${hocvien.email}</td>
                <td>${hocvien.idLopHoc}</td>

                <td><a href="/home?action=edit&index=${loop.index}" class=" btn btn-warning">Edit</a></td>
                <td><a href="/home?action=delete&ten=${hocvien.ten}" class="btn btn-danger">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    </form>
</div>

</body>
</html>
