/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3Packages;

import java.util.ArrayList;

/**
 *
 * @author Stefano95
 */
public class PostFactory {
    
     protected String connectionString;
     
     public void setConnectionString(String s){
	this.connectionString = s;
}
     public String getConnectionString(){
	return this.connectionString;
}

    private static PostFactory post;
    public static PostFactory getInstance() {
        if (post == null) {
            post = new PostFactory();
        }
        return post;
    }
    
    //Creazione della lista dei post
    private ArrayList<Post> listaPost = new ArrayList<Post>();
    
    //Factory che setta dati fittizi da usare per testare l'applicazione
    public PostFactory() {
        
        Post post1 = new Post();
        post1.setId(0);
        post1.setNomeUtente("Josè");
        post1.setCognomeUtente("Mourinho");
        post1.setFrasePost("Io sono lo Special One e ho condotto l'Inter al Triplete");
        listaPost.add(post1);
        
        Post post2 = new Post();
        post2.setId(1);
        post2.setNomeUtente("Diego");
        post2.setCognomeUtente("Milito");
        post2.setFrasePost("Il principe che diventa re nella notte di Madrid");
        listaPost.add(post2);
        
        Post post3 = new Post();
        post3.setId(2);
        post3.setNomeUtente("Esteban");
        post3.setCognomeUtente("Cambiasso");
        post3.setFrasePost("Mi chiamo Esteban Matias Cambiasso ma per tutti sono il Cuchu");
        listaPost.add(post3);
        
        Post post4 = new Post();
        post4.setId(3);
        post4.setNomeUtente("Walter");
        post4.setCognomeUtente("Samuel");
        post4.setFrasePost("The Wally è il mio soprannome");
        listaPost.add(post4);
        
        Post post5 = new Post();
        post5.setId(4);
        post5.setNomeUtente("Samuel");
        post5.setCognomeUtente("Eto'o");
        post5.setFrasePost("Lavoro come un nero per vivere come un bianco");
        listaPost.add(post5);
    }
    
    //metodo che restituisce la lista dei gruppi
     public ArrayList<Post> getPostList()
    {
        
        return listaPost;
        
    }
    
    //metodo che restituisce la lista dei gruppi per id
    public Post getPostId(int id)
    
    {
        for(Post po : listaPost)
        {
            if(po.id == id)
                return po;
        }
        
        return null;
    }
    
    //metodo che restituisce la lista dei gruppi per nome
    public Post getPostNome(String nomeUtente)
    {
        for(Post po : listaPost)
        {
            if(po.NomeUtente == nomeUtente)
                return (Post) po;
        }
        
        return null;
    }
    
}
