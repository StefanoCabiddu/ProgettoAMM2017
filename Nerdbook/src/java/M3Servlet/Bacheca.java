/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3Servlet;

import static Costanti.Costanti.AMMINISTRATORE;
import static Costanti.Costanti.POST;
import static Costanti.Costanti.UTENTEREGISTRATO;
import M3Packages.Amministratori;
import M3Packages.Post;
import M3Packages.PostFactory;
import M3Packages.Utente;
import M3Packages.UtenteFactory;
import M3Packages.UtentiRegistrati;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Stefano95
 */
@WebServlet(name = "Bacheca", urlPatterns = {"/Bacheca"})
public class Bacheca extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession(false);
            
            //Controllo se l'utente ha inserito i dati nella label del form
                    if(request.getParameter("submit") != null)
        {
                                // Preleva i dati inviati
            String username = request.getParameter("Username");
            String password = request.getParameter("Password");
            
            //Cerco nell'ArrayList degli utenti se l'username e la password inseriti sono corretti
            ArrayList<Utente> listaUtenti = UtenteFactory.getInstance().getUserList();
            for(Utente u : listaUtenti)
            {
                if(u.getUsername().equals(username) &&
                   u.getPassword().equals(password))
                {
                    //setto l'attributo loggedIn a vero
                    session.setAttribute("loggedIn",true);
                    
                    //Controllo se le informazioni inserite dall'utente fanno parte di Utenti Registrati
                    //e setto Utente registrato a vero mentre rimuovo l'attributo amministratore se questo
                    //era loggato
                    if(u instanceof UtentiRegistrati) 
                    {
                        session.setAttribute(UTENTEREGISTRATO, true);
                        session.setAttribute("UtenteRegistrato", u);
                        session.removeAttribute(AMMINISTRATORE);
                        session.removeAttribute("Amministratore");
                        
                        //permetto all'utente di vedere i post che altri utenti hanno messo prendendoli
                        //dalla lista di Array che li contiene
                        PostFactory factory =  new PostFactory();        
                        ArrayList<Post> post = factory.getPostList(); 

                        request.setAttribute(POST, post);
                        
                        //invio il controllo alla jsp che stamperà a schermo i post degli utenti registrati
                        //al social
                        request.getRequestDispatcher("bacheca.jsp").forward(request, response);
                    }
                    
                    //Controllo se le informazioni inserite dall'utente fanno parte di Amministratore
                    //e setto Amministratore a vero mentre rimuovo l'attributo Utente Registrato se questo
                    //era loggato
                    if(u instanceof Amministratori) 
                    {
                        session.setAttribute(AMMINISTRATORE, true);
                        session.setAttribute("Amministratore", u);
                        session.removeAttribute(UTENTEREGISTRATO);
                        session.removeAttribute("UtenteRegistrato");
                        
                        //permetto all'utente di vedere i post che altri utenti hanno messo prendendoli
                        //dalla lista di Array che li contiene
                        PostFactory factory =  new PostFactory();        
                        ArrayList<Post> post = factory.getPostList(); 

                        request.setAttribute(POST, post);
                   
                    }                
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
