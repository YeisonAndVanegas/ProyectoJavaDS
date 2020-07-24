package clases;

/**
 *
 * @author yeison.oyola
 */

import java.sql.*;

public class Conexion {
    //Conexion Local
    public static Connection conectar(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds_dev", "bd_dsdev", "bd_dsdev");
            return cn;
        } catch (SQLException sqle) {
            System.out.print("Error Conexion local. "+sqle);
        }
        return (null);
    }
}
