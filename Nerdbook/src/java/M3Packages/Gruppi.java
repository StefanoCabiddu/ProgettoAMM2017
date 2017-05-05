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
public class Gruppi {

    /*Attributi*/
    
    int id;
    String NomeGruppo;
    private String ArgomentoGruppo;
    private String CaratteristicheGruppo;
    private int NumeroPartecipanti;
    private String NomeAmministratoreGruppo;
    
    
    /*Costruttore*/
    
    public Gruppi ()
    {
        id = 0;
        NomeGruppo = "";
        ArgomentoGruppo = "";
        CaratteristicheGruppo = "";
        NumeroPartecipanti = 0;
        NomeAmministratoreGruppo = "";
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
     * @return the NomeGruppo
     */
    public String getNomeGruppo() {
        return NomeGruppo;
    }

    /**
     * @param NomeGruppo the NomeGruppo to set
     */
    public void setNomeGruppo(String NomeGruppo) {
        this.NomeGruppo = NomeGruppo;
    }

    /**
     * @return the ArgomentoGruppo
     */
    public String getArgomentoGruppo() {
        return ArgomentoGruppo;
    }

    /**
     * @param ArgomentoGruppo the ArgomentoGruppo to set
     */
    public void setArgomentoGruppo(String ArgomentoGruppo) {
        this.ArgomentoGruppo = ArgomentoGruppo;
    }

    /**
     * @return the CaratteristicheGruppo
     */
    public String getCaratteristicheGruppo() {
        return CaratteristicheGruppo;
    }

    /**
     * @param CaratteristicheGruppo the CaratteristicheGruppo to set
     */
    public void setCaratteristicheGruppo(String CaratteristicheGruppo) {
        this.CaratteristicheGruppo = CaratteristicheGruppo;
    }

    /**
     * @return the NumeroPartecipanti
     */
    public int getNumeroPartecipanti() {
        return NumeroPartecipanti;
    }

    /**
     * @param NumeroPartecipanti the NumeroPartecipanti to set
     */
    public void setNumeroPartecipanti(int NumeroPartecipanti) {
        this.NumeroPartecipanti = NumeroPartecipanti;
    }

    /**
     * @return the NomeAmministratoreGruppo
     */
    public String getNomeAmministratoreGruppo() {
        return NomeAmministratoreGruppo;
    }

    /**
     * @param NomeAmministratoreGruppo the NomeAmministratoreGruppo to set
     */
    public void setNomeAmministratoreGruppo(String NomeAmministratoreGruppo) {
        this.NomeAmministratoreGruppo = NomeAmministratoreGruppo;
    }
    
}
