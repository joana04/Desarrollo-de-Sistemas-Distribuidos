package ejercicio4;

import java.sql.*;
//COMENTAR LINEA A LINEA EL CODIGO
public class Conexion{
	//Agregarlos a un archivo de propiedades 
    private static final String url="jdbc:mysql://localhost/ejer1";
    private static final String user="root";
    private static final String password="";
    public static synchronized Connection getConexion(){
        Connection cn=null;
        // conexión a la base de datos
        try{
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost/ejer1",user,password);
        } catch (Exception e){
                System.out.println(e);
        } finally {
                return cn;
        }
    }
    public static synchronized void cerrarCallSt(CallableStatement cs){
        try{
                cs.close();
        } catch (Exception e){
               System.out.println(e);
        }
    }
    // cerrar el ResultSet
    public static synchronized void cerrarR(ResultSet rs){
        try{
                rs.close();
        } catch (Exception e){
               System.out.println(e);
        }
    }
    // Cerrar la conexion a la base 
    public static synchronized void cerrarC(Connection cn){
        try{
                cn.close();
        } catch(Exception e)
        {
                System.out.println(e);
        }
    }
    public static synchronized void deshacerCambios(Connection cn){
        try{
                cn.rollback();
        } catch(Exception e){
                System.out.println(e);
        }
    }
}