<%-- 
    Document   : profilo
    Created on : 20-apr-2017, 15.54.15
    Author     : Stefano95
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            
        <div id="header">
                
            <h2>Inserisci un nuovo utente</h2>
                
                
            <!--Sezione che presenta dei link in modo che cliccandoci si possa viaggiare 
                tra le pagine del sito-->
            
        <div id="navigazione">
        
                <a href="descrizione.jsp">Descrizione Social Network</a> 
                
                <a href="login.jsp">Login</a> 
        
        </div>

                
            <!--Form che permette al venditore di inserire un nuovo oggetto nella 
                tabella, ho usato il metodo post perchè sto gestendo più tipi di dati 
                che hanno una lunghezza diversa tra di loro-->
        
            <!--Contenuto pagina-->
        
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
                <%--Se l'utente e' autorizzato a vedere i contenuti della pagina mando a schermo
                il form per inserire i propri dati--%>
            <form action="Profilo" method="post">
                
            <label for="NomeUtente">Nome Utente</label>
            <input type="text" name="NomeUtente" id="NomeUtente">       
            <label for="CognomeUtente">Cognome Utente</label>
            <input type="text" name="CognomeUtente" id="CognomeUtente"> 
            <label for="URLImmagineDescrittiva">URL immagine</label>
            <input type="url" name="URLImmagineDescrittiva" id="URLImmagineDescrittiva"> 
            <label for="FrasePresentazione">Frase di Presentazione</label>
            <textarea name="FrasePresentazione" id="FrasePresentazione" rows="4" cols="20">Frase di Presentazione</textarea>
            <label for="giorno">Giorno di nascita</label>
            <input type="number" name="giorno" id="giorno">
            <label for="mese">Mese di nascita</label>
            <input type="text" name="mese" id="mese">
            <label for="anno">Anno di nascita</label>
            <input type="number" name="anno" id="anno">
            <label for="Password">Password</label>
            <input type="password" name="Password" id="Password">
            <label for="ConfermaPassword">ConfermaPassword</label>
            <input type="password" name="ConfermaPassword" id="ConfermaPassword">
        
            <!--Bottoni che inviano la richiesta alla pagina a cui si riferisce 
                l'attributo action-->
        
            <input type="submit" name="submit" value="Inserisci utente" />
            <input type="reset" name="reset" value="Cancella" />
        
              </form>
   
        
        </div>
            </div>
                
                </c:otherwise> 
            
            </c:choose>
        
        </div>
            
            <%--Includo la jsp footer che e' l'unica cosa che non cambia in tutte le pagine web--%>
            <jsp:include page="footer.jsp"></jsp:include>
                
        </div>
        
  </body>
  
</html>