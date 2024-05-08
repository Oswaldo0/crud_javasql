/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class conexion {
    public static Connection getconection(){
        String url="jdbc:sqlserver://localhost:1433;"+"encrypt=true;trustServerCertificate=true;"+"database=db_school;"+"user=sa;"+"password=adminuser;";
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
    }
}
