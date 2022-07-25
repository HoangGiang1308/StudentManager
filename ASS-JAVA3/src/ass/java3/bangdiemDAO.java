/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass.java3;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;
import unit.Student;
import unit.bangdiem;

/**
 *
 * @author truon
 */
public class bangdiemDAO {
    public boolean insert(bangdiem bd) throws Exception{
        String sql = "INSERT INTO [dbo].[grade]([MASV],[TA],[tin],[GDTC]) values(?,?,?,?)";
        try (
                Connection con = database.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, bd.getMASV());
            pstmt.setFloat(2, bd.getTA());
            pstmt.setFloat(3, bd.getTin());
            pstmt.setFloat(4, bd.getGDTC());
            
            return pstmt.executeUpdate()>0;
        }  
    }
    public boolean update(bangdiem bd) throws Exception{
        String sql = "Update dbo.grade set  TA = ?, tin = ?, GDTC = ? where MASV = ? ";
        try (
                Connection con = database.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(4, bd.getMASV());
            pstmt.setFloat(1, bd.getTA());
            pstmt.setFloat(2, bd.getTin());
            pstmt.setFloat(3, bd.getGDTC());
            return pstmt.executeUpdate()>0;
        }  
    }
    public boolean delete(String MASV) throws Exception{
        String sql = "delete from grade where MASV = ?";
        try (
                Connection con = database.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, MASV);
            return pstmt.executeUpdate()>0;
        }  
    }
    public bangdiem findbyID(String MASV) throws Exception{
        String sql = "select * from grade where MASV = ?";
        try (
                Connection con = database.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, MASV);
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    bangdiem bd = createbang(rs);
                    return bd;
                }
            }
            return null;
        }  
    }
    public List<bangdiem> findall() throws Exception {
        String sql = "select * from grade";
        try (
                Connection con = database.openConnection(); 
                PreparedStatement pstmt = con.prepareStatement(sql);
            ) {
            try (ResultSet rs = pstmt.executeQuery()){
                List<bangdiem> list =new ArrayList<>();
                while(rs.next()){
                    bangdiem bd = createbang(rs);
                    list.add(bd);
                }
                return list;
            }
            
    }
    }
       public List<bangdiem> findtop(int top) throws Exception {
        String sql = "select top "+ top +" *,(TA + Tin + GDTC)/3 as DTB from GRADE order by DTB desc";
        try (
                Connection con = database.openConnection(); 
                PreparedStatement pstmt = con.prepareStatement(sql);
            ) {
            try (ResultSet rs = pstmt.executeQuery()){
                List<bangdiem> list =new ArrayList<>();
                while(rs.next()){
                    bangdiem bd = createbang(rs);
                    list.add(bd);
                }
                return list;
            }
            
    }
    }

    private bangdiem createbang(final ResultSet rs) throws SQLException {
        bangdiem bd = new bangdiem();
        bd.setID(rs.getInt("ID"));
        bd.setMASV(rs.getString("MASV"));
        bd.setTA(rs.getFloat("TA"));
        bd.setTin(rs.getFloat("Tin"));
        bd.setGDTC(rs.getFloat("GDTC"));
        return bd;
    }
}
