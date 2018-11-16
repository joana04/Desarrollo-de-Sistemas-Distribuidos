package ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String [] args){
        int port=6666;
        try{
            ServerSocket ss = new ServerSocket(port); // Socket servidor
            System.out.println("Iniciado...");
            Socket cliente = ss.accept(); // Acepta la conexion del cliente
            BufferedReader bf= new BufferedReader(new InputStreamReader(cliente.getInputStream()));// Bufer para la comunicacion con el cliente
            PrintStream ps = new PrintStream(cliente.getOutputStream());//OutputStream para escribir al cliente
            do{
                int opcion= Integer.parseInt(bf.readLine());//Obtenemos la opcion que selecciono el cliente
                Producto p = new Producto();// creamos el objeto producto
                Categoria c = new Categoria();// creamos el objeto categoria 
                Boolean respuesta=false;
                /* Switch para hacer la operacion con la opcion que selecciono el cliente.
                Tiene 6 opciones de seleccion 
                        Acción                          Datos solicitados
                1.- Insertar un nuevo producto       nombre, precio y categoria
                2.- Borrar producto                     id del Producto
                3.- Actualizar producto             nombre, precio, categoria y idProducto
                4.- Mostrar todos
                5.- Mostrar uno                     id del Producto
                6.- Productos por Categoria
                */
                switch(opcion){
                    case 1: //Insertar Producto
                        System.out.println("Insertar");
                        ps.println("introduce el Nombre");
                        p.setNombre(bf.readLine());
                        ps.println("introduce el Precio");
                        p.setPrecio(Double.valueOf(bf.readLine()));
                        ps.println("introduce la Categoria");
                        c.setIdCategoria(Integer.parseInt(bf.readLine()));
                        p.setIdCategoria(c);
                        respuesta=ProductoDAO.insertarProducto(p);
                        ps.println("hecho");
                    break;
                    case 2: //Borrar Producto
                        System.out.println("Borrar");
                        ps.println("introduce el id del Producto");
                        p.setIdProducto(Integer.parseInt(bf.readLine()));
                        respuesta=ProductoDAO.borrarProducto(p);
                        ps.println("hecho");
                    break;
                    case 3: //Actualizar Producto
                        System.out.println("Actualizar");
                        ps.println("Introduce el nombre");
                        p.setNombre(bf.readLine());
                        ps.println("Introduce el precio");
                        p.setPrecio(Double.valueOf(bf.readLine()));
                        ps.println("Introduce la categoria");
                        c.setIdCategoria(Integer.parseInt(bf.readLine()));
                        p.setIdCategoria(c);
                        ps.println("Introduce el id del producto");
                        p.setIdProducto(Integer.parseInt(bf.readLine()));
                        respuesta=ProductoDAO.actualizarProducto(p);
                        ps.println("hecho");
                    break;
                    case 4: //Mostrar todos
                        System.out.println("Mostrar todos");
                        respuesta=ProductoDAO.mosTodos();
                        ps.println("hecho");
                    break;
                    case 5: //Mostrar Uno
                        System.out.println("Mostrar uno");
                        p.setIdProducto(Integer.parseInt(bf.readLine()));
                        respuesta=ProductoDAO.mosUno(p);
                        ps.println("hecho");
                    break;
                    case 6: // Productos x Categorias
                        System.out.println("Productos x Categorias");
                        respuesta=ProductoDAO.productosxCategorias();
                        ps.println("hecho");
                    break;
                }
                ps.println(respuesta); // impresion de respuesta
            }while(!"exit".equals(bf.readLine()));
        } catch (IOException e){//Error de socket
            System.err.println(e.getMessage());
        }
    }
}
