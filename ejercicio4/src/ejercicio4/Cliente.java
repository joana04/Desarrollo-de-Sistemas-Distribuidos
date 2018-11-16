package ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Cliente {
	
    private final static int PORT = 6666;
    private final static String SERVER = "localhost";
    
    public static void main(String[] args) {
    	boolean exit=false;//bandera para controlar el programa
        Socket socket;//Socket para la comunicacion cliente servidor        
        try {            
            System.out.println("Conectado"); 
            System.out.println("Tiene 6 opciones de seleccion \n" +
"                        Acción                          Datos solicitados\n" +
"                1.- Insertar un nuevo producto       nombre, precio y categoria\n" +
"                2.- Borrar producto                     id del Producto\n" +
"                3.- Actualizar producto             nombre, precio, categoria y idProducto\n" +
"                4.- Mostrar todos\n" +
"                5.- Mostrar uno                     id del Producto\n" +
"                6.- Productos por Categoria\n Inserte la opción que desea hacer\n");
            socket = new Socket(SERVER, PORT);//abre socket                
            //Para leer lo que envie el servidor      
            BufferedReader input = new BufferedReader( new InputStreamReader(socket.getInputStream()));                
            //para imprimir datos del servidor
            PrintStream output = new PrintStream(socket.getOutputStream());                
            //Para leer lo que escriba el usuario    
            BufferedReader brRequest = new BufferedReader(new InputStreamReader(System.in)); 
            while( !exit ){                                                  
                //captura comando escrito por el usuario
                String request = brRequest.readLine();                
                //manda peticion al servidor
                output.println(request); 
                //captura respuesta e imprime
                String st = input.readLine();
                if( st != null ) System.out.println("Servidor--> " + st );    
                if(request.equals("exit")){//terminar aplicacion
                    exit=true;                  
                    System.out.println("Cliente--> Fin de programa");    
                }     
            }//end while  
            socket.close();
       } catch (IOException ex) {        
         System.err.println("Cliente--> " + ex.getMessage());   
       }
    }
    
}