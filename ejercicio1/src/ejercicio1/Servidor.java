package ejercicio1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Thread{
    public static final int PUERTO=5000;
    ServerSocket socketServidor;
    public Servidor(){
        try{
            socketServidor= new ServerSocket(PUERTO);
            System.out.println("Funcionando");
        }   catch(IOException e) {
            e.printStackTrace();
        }
        start();
    }
    @Override
    public void run(){
        try{
            while(true){
                Socket socketCliente = socketServidor.accept();
                SQLConexion miConexion = new SQLConexion(socketCliente);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Servidor();
    }
    
}