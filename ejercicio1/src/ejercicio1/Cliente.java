
package ejercicio1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import static java.lang.Integer.parseInt;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Cliente {

    protected Socket socketCliente;
    protected static BufferedReader entrada;
    protected static PrintStream salida;
    private static final int PUERTOESCUCHA =5000;
    protected static String consulta ;
    protected static int columnas;
    
 
    
    private static void abrirSocket(){
        Socket socket = null;
        try{
            socket =new Socket ("localhost", PUERTOESCUCHA);
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream salida= new PrintStream(socket.getOutputStream());
            salida.println(JOptionPane.showInputDialog("Consulta"));
        //----esperando para recibir     
            System.out.println("Esperando los datos \n");
            consulta= entrada.readLine();
            if(!consulta.equals("No hay mas filas.")){
                Ventana vista= new Ventana();
                vista.setVisible(true);
                columnas= parseInt(consulta);
                System.out.println("Llegando n numero de columnas  "+ columnas );
                
                for(int x=0; x<columnas; x++){
                    consulta=entrada.readLine();
                    System.out.println("Columna " + x+ " "+consulta);
                    vista.addColumna(consulta);
                    
                }
                while ( ! entrada.readLine().equals("Termine")){
                    consulta=entrada.readLine();
                    System.out.println(consulta);
                
                //----------------------------------------------SE SUPONE QUE AQUI SEPARO LA CADENA Y LA MANDO A LA TABLA 
                    String [] datos=consulta.split(",");
                    System.out.println("datos "+ datos.length);
                    vista.addFila(datos);
                }
            }else{
                System.out.println("No hay filas ");
                JOptionPane.showMessageDialog(null,"No hay filas");
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                socket.close();
            }catch (IOException ee ){
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
            abrirSocket();
    }
}

