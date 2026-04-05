package com.example.baith8_tuychinhlv;

public class MonAn {
    private String tenMonAn;
    private double Gia;
    private String moTa;
    private int anhDaiDien;
    //

    public MonAn(String tenMonAn, int anhDaiDien, String moTa, double gia) {
        this.tenMonAn = tenMonAn;
        this.anhDaiDien = anhDaiDien;
        this.moTa = moTa;
        Gia = gia;
    }

    public int getAnhDaiDien() {
        return anhDaiDien;
    }

    public void setAnhDaiDien(int anhDaiDien) {
        this.anhDaiDien = anhDaiDien;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double gia) {
        Gia = gia;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }
}
