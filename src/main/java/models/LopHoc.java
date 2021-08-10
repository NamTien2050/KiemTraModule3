package models;

public class LopHoc {
    private int id;
    private String tenLop;

    public LopHoc() {
    }

    public LopHoc(int id, String tenLop) {
        this.id = id;
        this.tenLop = tenLop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
}
