/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pasindu
 */
public class NewClass {
    public static void main(String[] args) {
        
        try {
            ResultSet rs = DataBase.executequary2("student");
            while (rs.next()) {                
                if (rs.getString("regno").length()==1) {
                    String a = "0"+rs.getString("regno");
                    String b = rs.getString("admissionno");
                   DataBase.executeupdate("update student set regno='"+a+"' where admissionno='"+b+"'");
                    System.out.println("done");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
  
}
