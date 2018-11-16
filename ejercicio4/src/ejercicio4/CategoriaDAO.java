package ejercicio4;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
/* Clase CargoriaDAO que nos ayuda a menejar las oconsulatas a la base de datos.
    todos los metodos el autocomit se pone n falso para que no se haga automatico
    y dependiendo de la respuesta obtenia en resulSet se hace el comit o se deshacen los cambios.
   Todos los cambios se hacen en la base de datos con el uso de procedures que fueon creados y 
   solo son llamados en catda metodo de esta clase*/
public class CategoriaDAO {
    /* insertarCategoria: nos ayuda a insertar un anueva categoria 
    en la base de datos recibiendo un objeto categoria*/
    public static synchronized boolean insertarCategoria(Categoria categoria){
        Connection cn=null;
        CallableStatement cs=null;
        boolean respuesta=false;
        try{
            cn=Conexion.getConexion();
            cn.setAutoCommit(false);
            cs=cn.prepareCall("{call spInsert(?,?)}");
            cs.setString(1,categoria.getNombre());
            cs.setString(2,categoria.getDescripcion());
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
    /* borrar categoria, elimina una categoria de la base de datos*/
    public static synchronized boolean borrarCategoria(Categoria categoria){
        Connection cn=null;
        CallableStatement cs=null;
        boolean respuesta=false;
        try{
            cn=Conexion.getConexion();
            cn.setAutoCommit(false);
            cs=cn.prepareCall("{call spBorrar(?)}");
            cs.setInt(1,categoria.getIdCategoria());
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
    /*actualizarCategoria, actualiza la categoria en la base de datos*/
    public static synchronized boolean actualizarCategoria(Categoria categoria){
        Connection cn=null;
        CallableStatement cs=null;
        boolean respuesta=false;
        try{
            cn=Conexion.getConexion();
            cn.setAutoCommit(false);
            cs=cn.prepareCall("{call spUpdate(?,?,?)}");
            cs.setString(1,categoria.getNombre());
            cs.setString(2,categoria.getDescripcion());
            cs.setInt(3,categoria.getIdCategoria());
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
    /*mostrarT muestra todas las categorias*/
    public static synchronized boolean mostrarT(){
        Connection cn=null;
        CallableStatement cs=null;
        boolean respuesta=false;
        try{
            cn=Conexion.getConexion();
            cn.setAutoCommit(false);
            cs=cn.prepareCall("{call spSeleccionarT()}");
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
    /* mostrar u Muetstra una categoria*/
    public static synchronized boolean mostrarU(Categoria categoria){
        Connection cn=null;
        CallableStatement cs=null;
        boolean respuesta=false;
        try{
            cn=Conexion.getConexion();
            cn.setAutoCommit(false);
            cs=cn.prepareCall("{call spSeleccionarU(?)}");
            cs.setInt(1,categoria.getIdCategoria());
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
