package assignment12;

import java.util.Date;

public abstract class Room implements IRoom {

    private String Maphong;
    private String Hangphong;
    private Date Ngaythue;
    private Date Ngaytra;
    private double Dongia;

    public Room(String Maphong, String Hangphong, Date Ngaythue, Date Ngaytra, double Dongia) {
        this.Maphong = Maphong;
        this.Hangphong = Hangphong;
        this.Ngaythue = Ngaythue;
        this.Ngaytra = Ngaytra;
        this.Dongia = Dongia;
    }

    public Room() {
    }

    public String getMaphong() {
        return Maphong;
    }

    public void setMaphong(String Maphong) {
        this.Maphong = Maphong;
    }

    public String getHangphong() {
        return Hangphong;
    }

    public void setHangphong(String Hangphong) {
        this.Hangphong = Hangphong;
    }

    public Date getNgaythue() {
        return Ngaythue;
    }

    public void setNgaythue(Date Ngaythue) {
        this.Ngaythue = Ngaythue;
    }

    public Date getNgaytra() {
        return Ngaytra;
    }

    public void setNgaytra(Date Ngaytra) {
        this.Ngaytra = Ngaytra;
    }

    public double getDongia() {
        if (Hangphong.equals("A")) {
            return 1200000;
        } else if (Hangphong.equals("B")) {
            return 1000000;
        } else {
            return 750000;
        }
    }

    public void setDongia(double Dongia) {
        this.Dongia = Dongia;
    }

    @Override
    public double TinhTienThue() {
        return Songaythue() * getDongia();
    }

    public double Songaythue() {
        double songaythue = Ngaytra.getTime() - Ngaythue.getTime();
        if (Ngaythue == Ngaytra) {
            return songaythue = 1;
        } else {
            return songaythue = 1;
        }

    }

}
