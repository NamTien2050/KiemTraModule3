package services;

import daos.CRUDHocVien;
import models.HocVien;

import java.sql.SQLException;
import java.util.ArrayList;

public class ServiceHocVien {
    public ArrayList<HocVien> list;

    public ServiceHocVien() throws SQLException {
        list = CRUDHocVien.showHocVien();
    }

    public void save(HocVien hocvien) throws SQLException {
        CRUDHocVien.saveHocVien(hocvien);
        list = CRUDHocVien.showHocVien();
    }

    public void edit(HocVien hocvien) throws SQLException {
        CRUDHocVien.editHocVien(hocvien);
        list = CRUDHocVien.showHocVien();
    }

    public void delete(String name) throws SQLException {
        CRUDHocVien.deleteHocVien(name);
        list = CRUDHocVien.showHocVien();
    }

    public ArrayList<HocVien> finBy(String name) throws SQLException {
        return CRUDHocVien.findByName(name);
    }
}
