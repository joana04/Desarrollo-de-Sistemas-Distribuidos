/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author sam-y
 */
public interface Operaciones extends Remote{
    public double sumar (double x, double y)throws RemoteException;
    public double restar (double x, double y)throws RemoteException;
    public double multiplicar (double x, double y)throws RemoteException;
    public double dividir (double x, double y)throws RemoteException;
    public double promedio (ArrayList<Double> nums)throws RemoteException;
    public double desEstandar(ArrayList<Double> nums) throws RemoteException;
    public int factorial (int x) throws RemoteException;
    public int fibonacci(int x) throws RemoteException;
    public double minimo (double []x) throws RemoteException;
    public String parImpar(int x) throws RemoteException;
}
