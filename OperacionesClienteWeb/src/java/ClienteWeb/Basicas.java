package ClienteWeb;

import com.ipn.mx.rmi.Operaciones;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(name = "Basicas", urlPatterns = {"/Basicas"})
public class Basicas extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        try {
            String calcular=request.getParameter("Calcular");
            String n1= request.getParameter("x");
            String n2= request.getParameter("y");
            String operacion = request.getParameter("operacion");
            double x= Double.valueOf(n1), y= Double.valueOf(n2), resultado=0;
            int op=0;
            Operaciones ope=(Operaciones)Naming.lookup("rmi://localhost/operaciones");
            System.out.println("-------------------CONECTADO-----------");
                if(operacion.equals("Suma"))
                    resultado= ope.sumar(x, y);
                else if(operacion.equals("Resta"))
                    resultado= ope.restar(x, y);
                else if(operacion.equals("Multiplicacion"))
                    resultado= ope.multiplicar(x, y);
                else 
                    resultado= ope.dividir(x, y);

               System.out.println("Resultado"+ resultado);
                response.sendRedirect("Resultado.jsp?resul="+resultado);      
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(Basicas.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
}
