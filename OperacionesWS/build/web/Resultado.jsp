<%-- 
    Document   : Resultado
    Created on : 9/09/2018, 06:45:57 PM
    Author     : Esli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String r=request.getParameter("resul" );

 
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <label>Resultado:<%  out.println(r);%>  </label> 
        
    </body>
</html>
