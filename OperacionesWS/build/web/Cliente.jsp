<%-- 
    Document   : Cliente
    Created on : 7/09/2018, 11:31:46 PM
    Author     : Esli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operaciones </title>
    </head>
    <body>
        <h1>Básicas</h1>
            <form action="Basicas" method="post">
                <div class="form-group">
                    <label class="col-lg-4 ">Operación: </label>
                        <label>
                            <select class="form-control m-b" name="operacion" required>
                                <option></option>
                                <option>Suma</option>
                                <option>Resta</option>
                                <option>Multiplicacion</option>
                                <option>Division</option>
                            </select>
                        </label>
                    <label>Introduce los dos numeros implicados en la operación: </label> 
                    <input type="text"  name="x"> 

                    <input type="text" name="y"> 
                </div>
            <button name="Calcular" value="Calcular" type="submit">Calcular</button>
        </form>
        <h1>Basadas en un solo número</h1>
            <form action="UnNumero" method="post">
                <div class="form-group">
                    <label class="col-lg-4 ">Operación: </label>
                        <label>
                            <select class="form-control m-b" name="operacion2" required>
                                <option></option>
                                <option>Factorial</option>
                                <option>Fibonacci</option>
                                <option>Paridad</option>
                            </select>
                        </label>
                    <label>Introduce el número implicado: </label> 
                    <input type="text"  name="x2"> 
                </div>
                <button name="Calcular2" value="Calcular" type="submit">Calcular</button>
            </form>  
        <h1>Cojuntos</h1>
            <form action="Conjuntos" method="post">
                <div class="form-group">
                    <label class="col-lg-4 ">Operación: </label>
                        <label>
                            <select class="form-control m-b" name="operacion3" required>
                                <option></option>
                                <option>Promedio</option>
                                <option>Desv. Estandar</option>
                                <option>Num. Minimo</option>
                            </select>
                        </label>
                    <label>Introduce el conjunto de números separados por comas</label> 
                    <label>Ejemplo: "1,2,3,4,5 ..."</label> 
                    <input type="text"  name="x3"> 
                </div>
                <button name="Calcular3" value="Calcular" type="submit">Calcular</button>
            </form>  
    </body>
</html>
