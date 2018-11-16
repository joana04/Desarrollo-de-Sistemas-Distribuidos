
package com.ipn.mx.ws;

import static java.lang.Math.sqrt;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Esli
 */
@WebService(serviceName = "OperacionesWSBasicas")
public class OperacionesWSBasicas {


    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "sumar")
    public double sumar (@WebParam(name = "numeroUno") Double nUno,@WebParam(name = "numeroDos") Double nDos ) {
        return (nUno + nDos);
    }
    @WebMethod(operationName = "restar")
    public double restar (@WebParam(name = "numeroUno") Double nUno,@WebParam(name = "numeroDos") Double nDos ) {
        return (nUno - nDos);
    }
    @WebMethod(operationName = "multiplicar")
    public double multiplicar (@WebParam(name = "numeroUno") Double nUno,@WebParam(name = "numeroDos") Double nDos ) {
        return (nUno * nDos);
    }
    @WebMethod(operationName = "dividir")
    public double dividir (@WebParam(name = "numeroUno") Double nUno,@WebParam(name = "numeroDos") Double nDos ) {
        try {
            return nUno/nDos;
        } catch (ArithmeticException e) {
        }
        return 0;
    }
    @WebMethod(operationName = "promedio")
    public double promedio (@WebParam(name = "numeroUno") ArrayList<Double> nums ) {
         double sum=0;
        for(int i=0; i<nums.size();i++) {
            sum+=nums.get(i);
        }
        return sum/nums.size();
    }
    @WebMethod(operationName = "desEstandar")
    public double desEstandar (@WebParam(name = "numeroUno") ArrayList<Double> nums ) {
        double med = promedio(nums);
        double sum=0;
        for(int i=0;i<nums.size();i++) {
            sum += (nums.get(i)-med)*(nums.get(i)-med);
        }
        sum = sum/(nums.size()-1);
        return sqrt(sum);
    }
    @WebMethod(operationName = "factorial")
    public int factorial (@WebParam(name = "numeroUno") int nUno) {
        if(nUno==0)
            return 1;
        else
            return factorial(nUno-1)*nUno;
    }
    @WebMethod(operationName = "fibonacci")
    public int fibonacci (@WebParam(name = "numeroUno") int nUno) {
        if (nUno > 1) {
            return fibonacci(nUno - 1) + fibonacci(nUno - 2);
        } else if (nUno == 1) {
            return 1;
        } else if (nUno == 0) {
            return 0;
        } else { //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }
    @WebMethod(operationName = "minimo")
    public double minimo (@WebParam(name = "numeroUno") double[] x) {
        double min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }
    @WebMethod(operationName = "parImpar")
    public String  parImpar (@WebParam(name = "numeroUno") int nUno) {
        if (nUno % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }
}
