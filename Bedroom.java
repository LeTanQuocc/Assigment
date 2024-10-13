package assignment12;

import java.util.Date;

public class Bedroom extends Room {

    private int Sogiuong;

    public Bedroom(int Sogiuong, String Maphong, String Hangphong, Date Ngaythue, Date Ngaytra, double Dongia) {
        super(Maphong, Hangphong, Ngaythue, Ngaytra, Dongia);
        this.Sogiuong = Sogiuong;
    }

    public int getSogiuong() {
        return Sogiuong;
    }

    public void setSogiuong(int Sogiuong) {
        this.Sogiuong = Sogiuong;
    }

    public Bedroom() {
    }

}
