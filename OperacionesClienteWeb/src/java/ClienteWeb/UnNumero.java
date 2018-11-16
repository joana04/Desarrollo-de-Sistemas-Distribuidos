package ClienteWeb;

import com.ipn.mx.rmi.Operaciones;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Esli
 */
@WebServlet(name = "UnNumero", urlPatterns = {"/UnNumero"})
public class UnNumero extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        try {
            String calcular=request.getParameter("Calcular2");
            String n1= request.getParameter("x2");
            String operacion = request.getParameter("operacion2");
            int x= Integer.valueOf(n1), resultado=0;
            String resul;
            Operaciones ope=(Operaciones)Naming.lookup("rmi://localhost/operaciones");
            System.out.println("-------------------CONECTADO-----------");
            
                if(operacion.equals("Factorial")){
                    resultado= ope.factorial(x);
                    System.out.println("Resultado"+ resultado);
                response.sendRedirect("Resultado.jsp?resul="+resultado); 
                }else if(operacion.equals("Fibonacci")){
                    resultado= ope.fibonacci(x);
                    System.out.println("Resultado"+ resultado);
                response.sendRedirect("Resultado.jsp?resul="+resultado); 
                }else {
                    resul= ope.parImpar(x);
                    System.out.println("Resultado"+ resultado);
                    response.sendRedirect("Resultado.jsp?resul="+resul); 
                }
               
                
            
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(Basicas.class.getName()).log(Level.SEVERE, null, ex);
        }
                               
           
    }
   

}
