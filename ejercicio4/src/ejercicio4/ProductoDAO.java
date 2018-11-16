package ejercicio4;

import java.sql.*;
/* ClaseProductoDAO que nos ayuda a menejar las oconsulatas a la base de datos.
    todos los metodos el autocomit se pone n falso para que no se haga automatico
    y dependiendo de la respuesta obtenia en resulSet se hace el comit o se deshacen los cambios.
   Todos los cambios se hacen en la base de datos con el uso de procedures que fueon creados y 
   solo son llamados en catda metodo de esta clase*/
public class ProductoDAO{
    /*inserta un objeto producto en la base de datos*/
    public static synchronized boolean insertarProducto(Producto producto){
        Connection cn=null;
        CallableStatement cs=null;
        boolean respuesta=false;
        try{
            cn=Conexion.getConexion();
            cn.setAutoCommit(false);
            cs=cn.prepareCall("call spInsertar(?,?,?);");
            cs.setString(1,producto.getNombre());
            cs.setDouble(2,producto.getPrecio());
            cs.setInt(3,producto.getIdCategoria().getIdCategoria());
            System.out.println("Query--"+cs);
            respuesta=cs.executeUpdate()==1?true:false;
            if(respuesta){
                    cn.commit();
            } else{
                    Conexion.deshacerCambios(cn);
            }
            Conexion.cerrarCallSt(cs);
            Conexion.cerrarC(cn);
        } catch (SQLException e){
            Conexion.deshacerCambios(cn);
            Conexion.cerrarCallSt(cs);
            Conexion.cerrarC(cn);
        } catch (Exception e){
                //terminar
        }
        return respuesta;
    }
    /*borra un producto de la base de datos*/
    public static synchronized boolean borrarProducto(Producto producto){
        Connection cn=null;
        CallableStatement cs=null;
        boolean respuesta=false;
        try{
            cn=Conexion.getConexion();
            cn.setAutoCommit(false);
            cs=cn.prepareCall("call spDelete(?);");
            cs.setInt(1,producto.getIdProducto());
            respuesta=cs.executeUpdate()==1?true:false;
            if(respuesta){
                    cn.commit();
            } else{
                    Conexion.deshacerCambios(cn);
            }
            Conexion.cerrarCallSt(cs);
            Conexion.cerrarC(cn);
        } catch (SQLException e){
            Conexion.deshacerCambios(cn);
            Conexion.cerrarCallSt(cs);
            Conexion.cerrarC(cn);
        } catch (Exception e){
                //terminar
        }
        return respuesta;
    }
    /*Actualiza un producto en la base de datos*/
    public static synchronized boolean actualizarProducto(Producto producto){
        Connection cn=null;
        CallableStatement cs=null;
        boolean respuesta=false;
        try{
            cn=Conexion.getConexion();
            cn.setAutoCommit(false);
            cs=cn.prepareCall("call spActualizar(?,?,?,?);");
            cs.setString(1,producto.getNombre());
            cs.setDouble(2,producto.getPrecio());
            cs.setInt(3,producto.getIdCategoria().getIdCategoria());
            cs.setInt(4, producto.getIdProducto());
            respuesta=cs.executeUpdate()==1?true:false;
            if(respuesta){
                    cn.commit();
            } else{
                    Conexion.deshacerCambios(cn);
            }
            Conexion.cerrarCallSt(cs);
            Conexion.cerrarC(cn);
        } catch (SQLException e){
            Conexion.deshacerCambios(cn);
            Conexion.cerrarCallSt(cs);
            Conexion.cerrarC(cn);
        } catch (Exception e){
                //terminar
        }
        return respuesta;
    }
    /*muestra todos los productos existentes en la base de datos*/
    public static synchronized boolean mosTodos(){
        Connection cn=null;
        CallableStatement cs=null;
        boolean respuesta=false;
        try{
            cn=Conexion.getConexion();
            cn.setAutoCommit(false);
            cs=cn.prepareCall("call spSelectAll();");
            respuesta=cs.executeUpdate()==1?true:false;
            if(respuesta){
                    cn.commit();
            } else{
                    Conexion.deshacerCambios(cn);
            }
            Conexion.cerrarCallSt(cs);
            Conexion.cerrarC(cn);
        } catch (SQLException e){
            Conexion.deshacerCambios(cn);
            Conexion.cerrarCallSt(cs);
            Conexion.cerrarC(cn);
        } catch (Exception e){
                //terminar
        }
        return respuesta;
    }
    /*muestra un producto especifico de la base de datos*/
    public static synchronized boolean mosUno(Producto producto){
        Connection cn=null;
        CallableStatement cs=null;
        boolean respuesta=false;
        try{
            cn=Conexion.getConexion();
            cn.setAutoCommit(false);
            cs=cn.prepareCall("call spSelectOne(?);");
            cs.setInt(1,producto.getIdProducto());
            respuesta=cs.executeUpdate()==1?true:false;
            if(respuesta){
                    cn.commit();
            } else{
                    Conexion.deshacerCambios(cn);
            }
            Conexion.cerrarCallSt(cs);
            Conexion.cerrarC(cn);
        } catch (SQLException e){
            Conexion.deshacerCambios(cn);
            Conexion.cerrarCallSt(cs);
            Conexion.cerrarC(cn);
        } catch (Exception e){
                //terminar
        }
        return respuesta;
    }
    /*muestra los producto de una categoria de la base de datos*/
    public static synchronized boolean productosxCategorias(){
        Connection cn=null;
        CallableStatement cs=null;
        boolean respuesta=false;
        try{
            cn=Conexion.getConexion();
            cn.setAutoCommit(false);
            cs=cn.prepareCall("call spProdxCat();");
            respuesta=cs.executeUpdate()==1?true:false;
            if(respuesta){
                    cn.commit();
            } else{
                    Conexion.deshacerCambios(cn);
            }
            Conexion.cerrarCallSt(cs);
            Conexion.cerrarC(cn);
        } catch (SQLException e){
            Conexion.deshacerCambios(cn);
            Conexion.cerrarCallSt(cs);
            Conexion.cerrarC(cn);
        } catch (Exception e){
                //terminar
        }
        return respuesta;
    }
}
