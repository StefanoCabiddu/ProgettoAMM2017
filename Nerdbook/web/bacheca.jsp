<%-- 
    Document   : bacheca.jso
    Created on : 20-apr-2017, 15.49.56
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
<html lang="it">
    <head>
        <title>Nerdbook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="Nerdbook, bacheca personale">
        <meta name="description" content="Pagina relativa alla bacheca personale">
        <meta name="author" content="Stefano Cabiddu">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    
    <body>
        
        <div id="container"> 
            
            <!--Sezione titolo-->
            
        <div id="header">
        
        <h1>Bacheca Utenti</h1>
        
        </div>
            
            <!--Sezione navigazione-->  
            
        <div id="navigazione">
        
            <!--Sezione che presenta dei link in modo che cliccandoci si possa viaggiare tra le pagine del sito-->
            <a href="descrizione.jsp">Descrizione Social Network</a> 
            
            <a href="login.jsp">Login</a> 

        </div>
            
        <div id="sidebar">
            
            <!--Ho fatto l'assunzione di mettere il link nella stessa pagina per simulare un sito
                 network che ha i nomi nella sidebar che portano ai profili delle persone cercate-->
            
        <div id="utenti">
                
            <ol>
                    
                <li>Persone:
                    
                    <ul>
                    <li><a href="bacheca.html">Mario Rossi</a></li>
                    <li><a href="bacheca.html">Carlo Neri</a></li>
                    <li><a href="bacheca.html">Aldo Bruni</a></li>
                    <li><a href="bacheca.html">Rosaria Verdi</a></li>
                    <li><a href="bacheca.html">Remo Labarca</a></li>
                    <li><a href="bacheca.html">Guido Lavespa</a></li>
                    </ul>
                        
                </li>
                    
                </ol>
                
        </div>
            
        <div id="gruppi">
                
                <ol>
                    
                    <li>Gruppi:
                        
                        <ul>
                            
                        <li>Bici365</li>
                        <li>Vele Spiegate</li>
                
                        </ul>
                        
                    </li>
                
                </ol>
                
        </div>
            
        </div>
            
            
                <!--Sezione contenuto-->
            
        <div id="content">
            
<c:choose>
            
        <%--Questo controllo verifica che l'utente non e' registrato e manda quel messaggio
            in output--%>
        
         <c:when test="${IsUtenteRegistrato == null || IsUtenteRegistrato == false}">
                    <div id="errorMessage">
                        <p>Utente non autorizzato all'accesso dei contenuti della pagina<p>
                  </div>
               </c:when>
        
        <%--Altrimenti si attiva questo blocco di codice--%>
        
         <c:otherwise> 
                
                <p>Utente autorizzato all'accesso dei contenuti della pagina<p>
                <p>Ecco gli esempi di bacheca che potete trovare su Nerdbook</p>
                
                <div id="utente1">
        
                    <%--Per ogni post stampo i suoi attributi--%>
                    <c:forEach var="po" items="${Post}">
                           <c:if test="${po.id != null}">
                                   ${po.nomeUtente}
                                   ${po.cognomeUtente}
                                   <p>${po.frasePost}</p>
                                   <p>-------------------</p>
                            </c:if>
                       </c:forEach>
   
        
        </div>
            </div>
                
                </c:otherwise> 
            
        <%--Includo la jsp footer che e' l'unica cosa che non cambia in tutte le pagine web--%>
            </c:choose>
                
                <jsp:include page="footer.jsp"></jsp:include>
        
        </div>
   
    </body>
    
</html>
