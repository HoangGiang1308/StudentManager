/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass.java3;
import java.sql.Blob;
import javax.sql.rowset.serial.SerialBlob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import unit.Student;

/**
 *
 * @author truon
 */
public class StudentDAO {
    public boolean insert(Student sv) throws Exception{
        String sql = "INSERT INTO [dbo].[student]([MASV],[hoten],[email],[SDT],[Gioitinh],[diachi],[hinh]) values(?,?,?,?,?,?,?)";
        try (
                Connection con = database.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, sv.getMASV());
            pstmt.setString(2, sv.getHoten());
            pstmt.setString(3, sv.getEmail());
            pstmt.setString(4, sv.getSDT());
            pstmt.setInt(5, sv.getGioitinh());
            pstmt.setString(6, sv.getDiachi());
            if(sv.getHinh()!= null){
            Blob hinh =new SerialBlob(sv.getHinh());
            pstmt.setBlob(7, hinh);
            }else{
                Blob hinh = null;
                pstmt.setBlob(7, hinh);
            }
            return pstmt.executeUpdate()>0;
        }  
    }
    public boolean update(Student sv) throws Exception{
        String sql = "Update dbo.student set hoten = ?, email = ?, SDT = ?, Gioitinh = ?, diachi = ?, hinh = ? where MASV = ? ";
        try (
                Connection con = database.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(7, sv.getMASV());
            pstmt.setString(1, sv.getHoten());
            pstmt.setString(2, sv.getEmail());
            pstmt.setString(3, sv.getSDT());
            pstmt.setInt(4, sv.getGioitinh());
            pstmt.setString(5, sv.getDiachi());
            if(sv.getHinh()!= null){
            Blob hinh =new SerialBlob(sv.getHinh());
            pstmt.setBlob(6, hinh);
            }else{
                Blob hinh = null;
                pstmt.setBlob(6, hinh);
            }
            return pstmt.executeUpdate()>0;
        }  
    }
    public boolean delete(String MASV) throws Exception{
        String sql = "delete from student where MASV = ?";
        try (
                Connection con = database.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, MASV);
            return pstmt.executeUpdate()>0;
        }  
    }
    public Student findbyID(String MASV) throws Exception{
        String sql = "select * from student where MASV = ?";
        try (
                Connection con = database.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, MASV);
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    Student sv = createStudent(rs);
                    return sv;
                }
            }
            return null;
        }  
    }
    public List<Student> findall() throws Exception{
        String sql = "select * from student";
        try (
                Connection con = database.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            try(ResultSet rs = pstmt.executeQuery()){
                List<Student> list = new ArrayList<>();
                while(rs.next()){
                    Student sv = createStudent(rs);
                    list.add(sv);
                }
            return list;
            }
        }
    }

    private Student createStudent(final ResultSet rs) throws SQLException {
        Student sv = new Student();
        sv.setMASV(rs.getString("MASV"));
        sv.setHoten(rs.getString("hoten"));
        sv.setEmail(rs.getString("email"));
        sv.setSDT(rs.getString("SDT"));
        sv.setGioitinh(rs.getInt("Gioitinh"));
        sv.setDiachi(rs.getString("diachi"));
        Blob blob =rs.getBlob("hinh");
        if (blob != null)
            sv.setHinh(blob.getBytes(1, (int) blob.length()));
        return sv;
    }
}
