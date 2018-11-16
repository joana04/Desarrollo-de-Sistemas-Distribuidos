package ClienteWeb;

import com.ipn.mx.rmi.Operaciones;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
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
@WebServlet(name = "Conjuntos", urlPatterns = {"/Conjuntos"})
public class Conjuntos extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String calcular=request.getParameter("Calcular3");
        String n1= request.getParameter("x3");
        String operacion = request.getParameter("operacion3");
        double  resultado=0;
        String resul; 
        try {
            Operaciones ope=(Operaciones)Naming.lookup("rmi://localhost/operaciones");
            System.out.println("-------------------CONECTADO-----------");
            String [] conjunto= n1.split(",");
            double [] conj = new double[conjunto.length] ;
            ArrayList <Double> con= new ArrayList <Double>();
            
            for (int i=0; i<conjunto.length; i++) {
                conj[i]=Double.valueOf(conjunto[i]);
                con.add(Double.valueOf(conjunto[i]));
            }
            if(operacion.equals("Promedio")){
                resultado=ope.promedio(con);
            }else if(operacion.equals("Desv. Estandar")){
                resultado=ope.desEstandar(con);
            }else{
                resultado=ope.minimo(conj);
            }
            System.out.println("Resultado"+ resultado);
                response.sendRedirect("Resultado.jsp?resul="+resultado); 
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(ClienteWeb.Conjuntos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
