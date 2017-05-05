/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3Packages;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stefano95
 */
public class GruppiFactory {
    
    private static GruppiFactory gruppo;
    public static GruppiFactory getInstance() {
        if (gruppo == null) {
            gruppo = new GruppiFactory();
        }
        return gruppo;
    }
    //Creazione della lista dei gruppi
    private ArrayList<Gruppi> listaGruppi = new ArrayList<Gruppi>();
    
    //Factory che setta dati fittizi da usare per testare l'applicazione
    public GruppiFactory() {
        
        Gruppi gruppo1 = new Gruppi();
        gruppo1.setId(0);
        gruppo1.setNomeGruppo("ArcieristiAnonimi");
        gruppo1.setArgomentoGruppo("Tutto sul tiro con l'arco");
        gruppo1.setCaratteristicheGruppo("chiuso");
        gruppo1.setNumeroPartecipanti(5);
        listaGruppi.add(gruppo1);
        
        Gruppi gruppo2 = new Gruppi();
        gruppo2.setId(1);
        gruppo2.setNomeGruppo("MongolfieristiBuffi");
        gruppo2.setArgomentoGruppo("Tutto quello che c'è da sapere sulle mongolfiere");
        gruppo2.setCaratteristicheGruppo("aperto");
        gruppo2.setNumeroPartecipanti(5);
        listaGruppi.add(gruppo2);
        
        Gruppi gruppo3 = new Gruppi();
        gruppo3.setId(2);
        gruppo3.setNomeGruppo("Basket, che passione");
        gruppo3.setArgomentoGruppo("A tutto basket");
        gruppo3.setCaratteristicheGruppo("aperto");
        gruppo3.setNumeroPartecipanti(5);
        listaGruppi.add(gruppo3);
        
        Gruppi gruppo4 = new Gruppi();
        gruppo4.setId(3);
        gruppo4.setNomeGruppo("Biciclettando");
        gruppo4.setArgomentoGruppo("Tutto quello che riguarda le due ruote senza motore");
        gruppo4.setCaratteristicheGruppo("chiuso");
        gruppo4.setNumeroPartecipanti(5);
        listaGruppi.add(gruppo4);
        
        Gruppi gruppo5 = new Gruppi();
        gruppo5.setId(4);
        gruppo5.setNomeGruppo("MotorBike");
        gruppo5.setArgomentoGruppo("Le moto, una ragione di vita");
        gruppo5.setCaratteristicheGruppo("aperto");
        gruppo5.setNumeroPartecipanti(5);
        listaGruppi.add(gruppo5);
    
    }
    //metodo che restituisce la lista dei gruppi
    public ArrayList<Gruppi> getGruppiList()
    {
        
        return listaGruppi;
        
    }
    
    //metodo che restituisce la lista dei gruppi per id
    public Gruppi getGruppiId(int id)
    
    {
        for(Gruppi gr : listaGruppi)
        {
            if(gr.id == id)
                return gr;
        }
        
        return null;
    }
    
    //metodo che restituisce la lista dei gruppi per nome
    public Gruppi getGruppiNome(String nomeGruppo)
    {
        for(Gruppi gr : listaGruppi)
        {
            if(gr.NomeGruppo == nomeGruppo)
                return (Gruppi) gr;
        }
        
        return null;
    }
    
}
