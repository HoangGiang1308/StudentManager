/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass.java3;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author truon
 */
public class Datavalidate {
    public static void validate(JTextField field, StringBuilder sb, String errorMessage){
        if (field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }else{
            field.setBackground(Color.WHITE);
        }
    }
    public static void validate(JPasswordField field, StringBuilder sb, String errorMessage){
        String password = new String(field.getPassword());
        if (password.equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }else{
            field.setBackground(Color.WHITE);
        }
    }
}
