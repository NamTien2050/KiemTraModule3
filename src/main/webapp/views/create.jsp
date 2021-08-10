<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/10/2021
  Time: 4:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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
    <h2>Create Product</h2>
    <form action="/home?action=create" method="post">
        <table class="table">
            <thead>
            <tr>
                <th>Tên</th>
                <th>Ngày sinh</th>
                <th>Địa chỉ</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" placeholder="ten"name="ten"></td>
                <td><input type="text" placeholder="Ngay sinh"name="ngaysinh"></td>
                <td><input type="text" placeholder="Dia chi"name="diachi"></td>
            </tr>
            <tr>
                <th>Số điện thoại</th>
                <th>Email</th>
                <th>Lớp học</th>
            </tr>
            <tr>
                <td><input type="text" placeholder="So dien thoai"name="sodienthoai"></td>
                <td><input type="text" placeholder="Email"name="email"></td>
                <td><input type="text" placeholder="Lop hoc" name="idlophoc"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit">Create</button>
    </form>
</div>
</body>
</html>
