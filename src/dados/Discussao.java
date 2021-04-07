package dados;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import dados.*;

public class Discussao implements Serializable {
    private int id; 
    private String titulo, conteudo;
    private List<Post> listaPosts; // altera��o com rela��o ao diagrama
    private Aluno autor;
    private List<Post> listaPost = new ArrayList();
    private int postCount=0;

    public Discussao(int id, String titulo, String conteudo, List<Post> listaPosts, Aluno autor) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.listaPosts = (ArrayList<Post>) listaPosts;
        this.autor = autor;
    }
    
  

    public void AdicionaPost(Post p) {
		listaPost.add(p);
		postCount++;
	}
    public void removePost(Post p){
        listaPost.remove(p);
        postCount--;
    }
    public List<Post> consultaPost(){
        List<Post> listaRetorno = new ArrayList(listaPost);
        return listaRetorno;
    }

    public int getID(){
        return id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setID(int id){
        this.id = id;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
  
    public List<Post> getListaPosts() {
        return listaPosts;
    }

    public void setListaPosts(List<Post> listaPosts) {
        this.listaPosts = (List<Post>) listaPosts;
    }

    @Override
    public String toString() {
        return "Discussao [conteudo=" + conteudo + ", id=" + id + ", listaPosts=" + listaPosts + ", titulo=" + titulo
                + "]";
    }
}

