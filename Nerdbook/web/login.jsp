<%-- 
    Document   : login
    Created on : 20-apr-2017, 15.54.03
    Author     : Stefano95
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html lang='it'>
    <head>
        <title>NerdBook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="Nerdbook, pagina login">
        <meta name="description" content="Pagina di login del social network">
        <meta name="author" content="Stefano Cabiddu">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    
    <body>
        
        <div id="container"> 
            
        <div id="header">
                
                <h2>Form Registrazione</h2>
        
        </div>
            
        <div id="navigazione">
                
            <a href='descrizione.jsp'>Descrizione Social Network</a> 
        
            <a href='profilo.jsp'>Profilo</a>
                
            <a href='bacheca.jsp'>Bacheca</a>
                
        </div>
              
            
        <div id="content">
                
            <!--Inserimento dati-->
        
            <form action="Login" method="post">
  
            <label for="Username">Username</label>
            <input type="text" name="Username" id="Username"> 
            <label for="Password">Password</label>
            <input type="password" name="Password" id="Password">
        
            <!--Bottoni che inviano la richiesta alla pagina a cui si riferisce 
                l'attributo action-->
        
            <input type="submit" name="submit" value="Loggami" />
            <input type="reset" name="reset" value="Cancella" />
        
            </form>
        
        </div>
            <%--Includo la jsp footer che e' l'unica cosa che non cambia in tutte le pagine web--%>
            <jsp:include page="footer.jsp"></jsp:include>
                
        </div>
           
        </div>
        
    </body>
    
</html>
