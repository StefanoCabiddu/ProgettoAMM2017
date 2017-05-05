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
public abstract class Utente {

    /*Attributi*/
    
    int id;
    String Nome;
    private String Cognome;
    private String Username;
    private String Password;
    private String ImmagineProfilo;
    private String FrasePresentazione;
    
    /* Costruttore */
    public Utente()
    {
        id = 0;
        Nome = "";
        Cognome = "";
        Username = "";
        Password = "";
        ImmagineProfilo = "";
        FrasePresentazione = "";
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
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Cognome
     */
    public String getCognome() {
        return Cognome;
    }

    /**
     * @param Cognome the Cognome to set
     */
    public void setCognome(String Cognome) {
        this.Cognome = Cognome;
    }

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    /**
     * @return the ImmagineProfilo
     */
    public String getImmagineProfilo() {
        return ImmagineProfilo;
    }

    /**
     * @param ImmagineProfilo the ImmagineProfilo to set
     */
    public void setImmagineProfilo(String ImmagineProfilo) {
        this.ImmagineProfilo = ImmagineProfilo;
    }

    /**
     * @return the FrasePresentazione
     */
    public String getFrasePresentazione() {
        return FrasePresentazione;
    }

    /**
     * @param FrasePresentazione the FrasePresentazione to set
     */
    public void setFrasePresentazione(String FrasePresentazione) {
        this.FrasePresentazione = FrasePresentazione;
    }

}