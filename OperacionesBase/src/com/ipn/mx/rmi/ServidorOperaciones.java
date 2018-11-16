package com.ipn.mx.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServidorOperaciones {
    public static void main(String[] args) {
        try {
            Operaciones ope;
            LocateRegistry.createRegistry(1099);
            ope = new OperacionesImpl();
            Naming.bind("operaciones", ope);
            System.out.println("--- Servidor Funcionando ---");
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServidorOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
