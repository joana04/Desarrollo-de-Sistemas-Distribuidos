package com.ipn.mx.rmi;

import static java.lang.Math.sqrt;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class OperacionesImpl extends UnicastRemoteObject implements Operaciones {

    public OperacionesImpl() throws RemoteException {
        super();
    }
    
    @Override
    public double sumar(double x, double y) throws RemoteException {
        return x + y;
    }

    @Override
    public double restar(double x, double y) throws RemoteException {
        return x -y;
    }

    @Override
    public double multiplicar(double x, double y) throws RemoteException {
        return x * y;
    }

    @Override
    public double dividir(double x, double y) throws RemoteException {
        try {
            return x/y;
        } catch (ArithmeticException e) {
        }
        return 0;
    }

    @Override
    public double promedio(ArrayList<Double> nums) throws RemoteException {
        double sum=0;
        for(int i=0; i<nums.size();i++) {
            sum+=nums.get(i);
        }
        return sum/nums.size();
    }

    @Override
    public double desEstandar(ArrayList<Double> nums) throws RemoteException {
        double med = promedio(nums);
        double sum=0;
        for(int i=0;i<nums.size();i++) {
            sum += (nums.get(i)-med)*(nums.get(i)-med);
        }
        sum = sum/(nums.size()-1);
        return sqrt(sum);
    }

    @Override
    public int factorial(int x) throws RemoteException {
        if(x==0)
            return 1;
        else
            return factorial(x-1)*x;
    }

    @Override
    public int fibonacci(int x) throws RemoteException {
         if (x > 1) {
            return fibonacci(x - 1) + fibonacci(x - 2);
        } else if (x == 1) {
            return 1;
        } else if (x == 0) {
            return 0;
        } else { //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

    @Override
    public double minimo(double[] x) throws RemoteException {
         double min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }

    @Override
    public String parImpar(int x) throws RemoteException {
        if (x % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }

}
