package controllers;

import models.HocVien;
import models.LopHoc;
import controllers.ServletHocVien;
import services.ServiceHocVien;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = {"/home"})
public class ServletHocVien extends HttpServlet {
    ServiceHocVien serviceHocVien;

    {
        try {
            serviceHocVien = new ServiceHocVien();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher;
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                requestDispatcher = request.getRequestDispatcher("views/create.jsp");
                requestDispatcher.forward(request, response);
                break;
            case "edit":
                int indexEdit = Integer.parseInt(request.getParameter("index"));
                request.setAttribute("list", serviceHocVien.list.get(indexEdit));
                requestDispatcher = request.getRequestDispatcher("views/edit.jsp");
                requestDispatcher.forward(request, response);
                break;
            case "delete":
                String ten = request.getParameter("ten");
                try {
                    serviceHocVien.delete(ten);
                    response.sendRedirect("/home");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "finByName":
                String name = request.getParameter("findByName");
                try {
                    request.setAttribute("list", serviceHocVien.finBy(name));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                requestDispatcher = request.getRequestDispatcher("views/show.jsp");
                requestDispatcher.forward(request, response);
                break;
            default:

                request.setAttribute("list", serviceHocVien.list);
                requestDispatcher = request.getRequestDispatcher("views/show.jsp");
                requestDispatcher.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher;
        String ten = request.getParameter("ten");
        String ngaySinh = request.getParameter("ngaysinh");
        String diaChi = request.getParameter("diachi");
        String soDienThoai = request.getParameter("sodienthoai");
        String email = request.getParameter("email");
        int idLopHoc = Integer.parseInt(request.getParameter("idlophoc"));
        HocVien hocVien = new HocVien(ten, ngaySinh, diaChi, soDienThoai, email, idLopHoc);
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    serviceHocVien.save(hocVien);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit":
                hocVien.setId(Integer.parseInt(request.getParameter("id")));
                try {
                    serviceHocVien.edit(hocVien);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
        response.sendRedirect("/home");
    }
}
