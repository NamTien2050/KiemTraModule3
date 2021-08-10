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
    <h2>Edit Product</h2>
    <form action="/home?action=edit" method="post">
        <table class="table">
            <thead>
            <input type="hidden" name="id" value="${list.id}">
            <tr>
                <th>Tên</th>
                <th>Ngày sinh</th>
                <th>sdia chi</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" placeholder="ten"name="ten"value="${list.ten}"></td>
                <td><input type="text" placeholder="gia"name="ngaysinh" value="${list.ngaySinh}"></td>
                <td><input type="text" placeholder="so luong"name="diachi"value="${list.diaChi}"></td>
            </tr>
            <tr>
                <th>So dien thoai</th>
                <th>email</th>
                <th>lop hoc</th>
            </tr>
            <tr>
                <td><input type="text" placeholder="mau"name="sodienthoai"value="${list.soDienThoai}"></td>
                <td><input type="text" placeholder="mo ta"name="email"value="${list.email}"></td>
                <td><input type="text" placeholder="danh muc" name="idlophoc"value="${list.idLopHoc}"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit">Edit</button>
    </form>
</div>
</body>
</html>
