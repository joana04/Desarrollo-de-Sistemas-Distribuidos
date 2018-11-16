package com.ipn.mx.cliente;

import com.ipn.mx.rmi.Operaciones;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteOperaciones {
    public static void main(String[] args) {
        try {
            // busca uno de tipo rmi en el localhost del nombre operaciones
            Operaciones ope=(Operaciones)Naming.lookup("rmi://localhost/operaciones");
            double x=990, y= 0;
            System.out.println(ope.sumar(x, y));
            System.out.println(ope.restar(x, y));
            System.out.println(ope.multiplicar(x, y));
            System.out.println(ope.dividir(x, y));
        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
