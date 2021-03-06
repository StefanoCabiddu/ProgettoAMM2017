<%-- 
    Document   : descrizione
    Created on : 20-apr-2017, 15.51.19
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
        <title>NerdBook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="NerdBook, pagina descrizione">
        <meta name="description" content="Pagina di descrizione del social network">
        <meta name="author" content="Stefano Cabiddu">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    
    <body>
         
        <div id="container"> 
            
        <!--Sezione titolo-->
            
        <div id="header">
        
        <h1>NerdBook</h1>
            
        </div>
            
        <div id="navigazione">
        
                <a href="login.jsp">Login</a> 
        
        </div>
            
        <div id="sidebar">
                
        <!--Per i link interni ho usato questa formattazione in modo che 
            l'utente utilizzi un ordine numerato per la lista principale 
            mentre un ordine puntato per la sottolista che spiega l'utilità 
            dei pezzi venduti-->
        
        <!--Per la lista principale ho preferito usare il tag h2 mentre per 
            la lista secondaria ho usato il tag h3-->
        
        <div id="LinkInterni">
        
        <ol>
            
            <li><a href='#primo'>Descrizione Social Network</a></li>
            <li><a href='#secondo'>A chi è rivolto</a></li>
            <li><a href='#terzo'>Come funziona?</a>
                
            <ul>
                
                <li><a href='#terzoUno'>Utente registrato</a></li>
                <li><a href='#terzoDue'>Amministratore</a></li>
                
            </ul>
                
            </li>
            
            <li><a href='#quarto'>Bacheca</a></li>
            <li><a href='#quinto'>Gruppi</a></li>
            <li><a href='#sesto'>Gratis o a pagamento?</a></li>
            
        </ol>
                
        </div>
        
        </div>
        
        <div id="content">
            
            <h2>
                
            <a id='primo'>Descrizione Social Network</a>
            
        </h2>
        
            <p>
                
                Questo social network è semplificato rispetto ai concorrenti. Permette di stringere amicizie
                e di creare e gestire dei gruppi. Si comporrà di quattro pagine: questa che è una pagina di
                descrizione dove andremo a vedere tutte le peculiarità dello stesso, una pagina di login in 
                modo da far loggare la persona, la pagina del profilo dove andranno tutte le informazioni 
                della singola persona e la pagina della bacheca dove ogni persona vedrà tutte le notizie che 
                lui pubblica e quello che tutte le altre persone inseriscono nel social network. Dentro ad
                ogni pagina ci saranno i link che permetteranno al visitatore e, una volta loggato, all'utente
                di viaggiare nel sito
                
            </p>
            
            <h2>
                
                <a id='secondo'>A chi è rivolto</a>
                
            </h2>
            
            <p>
                
                Il social network è rivolto a tutte quelle persone che vogliono conoscere nuove persone e fare
                amicizia. Comprenderà due tipologie di persone che sono l'utente registrato e l'amministratore; se
                scendi più giù nella pagina scoprirai i ruoli delle due tipologie.
                
            </p>
            
            <h2>
                
                <a id='terzo'>Come funziona</a>
                
            </h2>
                
             <p>
                 
                Si avranno due tipologie di utenti:
                Utenti registrati, che possono inserire informazioni personali, stringere amicizia con altri utenti,
                creare e gestire dei gruppi, inserire post nella sua bacheca o quella degli amici.
                L’amministratore, che può cancellare i post da qualsiasi bacheca e cancellare qualsiasi gruppo.
                Ora andiamo a vederli più nello specifico
                
             </p>
             
             <h3>
                 
                 <a id='terzoUno'>Utente registrato</a>
                 
             </h3>
             
             <p>
                 
                 Un utente registrato ha associati una serie di dati personali come nome, cognome e data di nascita.
                 Inoltre ha una frase di presentazione che appare in cima alla propria bacheca ed una immagine
                 del profilo, di cui specifica la URL. Inoltre, ha una password che può modificare. 
                 
             </p>
             
             <h3>
                 
                 <a id='terzoDue'>Amministratore</a>
                 
             </h3>
             
             <p>
                 
                 L’amministratore è un utente speciale che può cancellare i contenuti ritenuti non appropriati. 
                 Per questo può cancellare post di qualsiasi utente e qualsiasi gruppo
                 
             </p>
             
             <h2>
                 
                 <a id='quarto'>Bacheca</a>
                 
             </h2>
            
             <p>
                 
                 Ogni utente registrato ha una bacheca, che mostra una serie di post. I post sono formati da:
                 
             </p>
                 <ol>
            
                    <li>Un messaggio</li>
                    <li>Un allegato opzionale</li>
                 
                 </ol>
                 
             <p>
                 Un utente registrato può inserire dei post nella sua bacheca o in quella dei suoi amici. 
                 Nel caso visiti la bacheca di un altro utente che non è nella lista dei suoi amici, 
                 l’applicazione gli permetterà di stringere amicizia.
                 Una volta stretta l’amicizia, l’utente potrà inserire dei post in bacheca. 
                 
             </p>
             
             <h2>
                 
                 <a id='quinto'>Gruppi</a>
                 
             </h2>
             
             <p>
                 
                 I gruppi permettono di raccogliere degli utenti, che non siano necessariamente amici fra loro, 
                 per condividere informazioni e materiali legati da un comune interesse (un film, 
                 una squadra di calcio, un gruppo musicale ecc.). Anche i gruppi hanno la loro bacheca. Ogni volta che un 
                 post viene pubblicato sulla bacheca di un gruppo, questo viene inserito anche nella bacheca di tutti gli 
                 appartenenti al gruppo.
                 Un utente si iscrive visitando la bacheca del gruppo e richiedendo l’iscrizione.
                 Il gruppo viene fondato da un utente, che è l’unico, oltre all’amministratore, che può cancellarlo. Una volta 
                 cancellato, anche tutti i post del gruppo sono eliminati. 
                 
             </p>
             
             <h2>
                 
                 <a id='sesto'>Gratis o a pagamento?</a>
                 
             </h2>
             
             <p>
                 
                 Il social network è gratis, funzionerà come uno normale e lo staff vorrà solamente ampliare
                 la portata degli utenti senza chiedere nulla in cambio per farlo diventare sempre più famoso.
                 
             </p>
             
        </div>
             <%--Includo la jsp footer che e' l'unica cosa che non cambia in tutte le pagine web--%>
            <jsp:include page="footer.jsp"></jsp:include>
        
        </div>
        
    </body>
    
</html>