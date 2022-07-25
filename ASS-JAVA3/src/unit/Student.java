/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit;

/**
 *
 * @author truon
 */
public class Student {
    private String MASV,hoten,email,SDT,diachi;
    private int Gioitinh;
    private byte[] hinh;

    public Student() {
    }

    public Student(String MASV, String hoten, String email, String SDT, String diachi, int Gioitinh, byte[] hinh) {
        this.MASV = MASV;
        this.hoten = hoten;
        this.email = email;
        this.SDT = SDT;
        this.diachi = diachi;
        this.Gioitinh = Gioitinh;
        this.hinh = hinh;
    }

    public String getMASV() {
        return MASV;
    }

    public void setMASV(String MASV) {
        this.MASV = MASV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(int Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public byte[] getHinh() {
        return hinh;
    }

    public void setHinh(byte[] hinh) {
        this.hinh = hinh;
    }
    
    
    
}
