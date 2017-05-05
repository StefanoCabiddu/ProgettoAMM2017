/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3Packages;

/**
 *
 * @author Stefano95
 */
public class Post {

    /*Attributi*/
    
    int id;
    String NomeUtente;
    private String CognomeUtente;
    private String FrasePost;
    
    
    /*Costruttore*/
    
     public Post()
    {
        id = 0;
        NomeUtente = "";
        CognomeUtente = "";
        FrasePost = "";
    }
     
     /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the NomeUtente
     */
    public String getNomeUtente() {
        return NomeUtente;
    }

    /**
     * @param NomeUtente the NomeUtente to set
     */
    public void setNomeUtente(String NomeUtente) {
        this.NomeUtente = NomeUtente;
    }

    /**
     * @return the CognomeUtente
     */
    public String getCognomeUtente() {
        return CognomeUtente;
    }
    
    /**
     * @param CognomeUtente the CognomeUtente to set
     */
    public void setCognomeUtente(String CognomeUtente) {
        this.CognomeUtente = CognomeUtente;
    }
    
        /**
     * @return the FrasePost
     */
    public String getFrasePost() {
        return FrasePost;
    }

    /**
     * @param FrasePost the FrasePost to set
     */
    public void setFrasePost(String FrasePost) {
        this.FrasePost = FrasePost;
    }
    
}
