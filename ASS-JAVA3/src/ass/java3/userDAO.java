/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass.java3;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import unit.user;
/**
 *
 * @author truon
 */
public class userDAO {
    public user checkLogin(String username, String password) throws Exception{
        String sql = "select username, password, role from users where username=? and password = ?";
        try (
                Connection con = database.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    user use = new user();
                    use.setUsername(username);
                    use.setRole(rs.getString("role"));
                    return use;
                }
            }
        }
        return null;
    }
}
