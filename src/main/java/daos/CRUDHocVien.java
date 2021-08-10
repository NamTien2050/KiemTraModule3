package daos;

import models.HocVien;

import java.sql.*;
import java.util.ArrayList;

public class CRUDHocVien {
    static Connection connection = ConnectionCSDL.getConnect();

    public static ArrayList<HocVien> showHocVien() throws SQLException {
        ArrayList<HocVien> list = new ArrayList<>();

        String selectSQL = "select*from hocvien";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectSQL);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String ten = resultSet.getString("ten");
            String ngaySinh = resultSet.getString("ngaysinh");
            String diaChi = resultSet.getString("diachi");
            String sdt = resultSet.getString("sdt");
            String email = resultSet.getString("email");
            int idLopHoc = resultSet.getInt("idlophoc");
            list.add(new HocVien(id, ten, ngaySinh, diaChi, sdt, email, idLopHoc));
        }
        return list;
    }

    public static void saveHocVien(HocVien hocVien) throws SQLException {
        String sqlSave = "insert hocvien value (?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlSave);
        preparedStatement.setInt(1, hocVien.getId());
        preparedStatement.setString(2, hocVien.getTen());
        preparedStatement.setString(3, hocVien.getNgaySinh());
        preparedStatement.setString(4, hocVien.getDiaChi());
        preparedStatement.setString(5, hocVien.getSoDienThoai());
        preparedStatement.setString(6, hocVien.getEmail());
        preparedStatement.setInt(7, hocVien.getIdLopHoc());
        preparedStatement.execute();
    }

    public static void deleteHocVien(String name) throws SQLException {
        String sqlDelete = "delete from hocvien where ten=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete);
        preparedStatement.setString(1, name);
        preparedStatement.execute();
    }

    public static void editHocVien(HocVien hocVien) throws SQLException {
        String sqlEdit = "update hocvien set id=?,ngaysinh=?,diachi=?,sdt=?,email=?,idlophoc=? where ten=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlEdit);
        preparedStatement.setInt(1, hocVien.getId());
        preparedStatement.setString(7, hocVien.getTen());
        preparedStatement.setString(2, hocVien.getNgaySinh());
        preparedStatement.setString(3, hocVien.getDiaChi());
        preparedStatement.setString(4, hocVien.getSoDienThoai());
        preparedStatement.setString(5, hocVien.getEmail());
        preparedStatement.setInt(6, hocVien.getIdLopHoc());
        preparedStatement.execute();
    }
    public static ArrayList<HocVien> findByName(String findByName) throws SQLException {
        ArrayList<HocVien> list = new ArrayList<>();
        ArrayList<HocVien> finBylist = new ArrayList<>();
        String sqlDelete = "select * from hocvien where ten like ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete);
        preparedStatement.setString(1, findByName);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String ten = resultSet.getString("ten");
            String ngaySinh = resultSet.getString("ngaysinh");
            String diaChi = resultSet.getString("diachi");
            String soDienThoai = resultSet.getString("sdt");
            String email = resultSet.getString("email");
            int idLopHoc = resultSet.getInt("idlophoc");
            list.add(new HocVien(id, ten, ngaySinh, diaChi, soDienThoai, email, idLopHoc));
        }
        return list;
    }
}
