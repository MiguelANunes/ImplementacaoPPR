<<<<<<< HEAD
package dados;

import java.util.List;
import dados.*;

public class Discussao {
    private int id; 
    private String titulo, conteudo;
    private List<Post> listaPosts; // alteração com relação ao diagrama
    private Aluno autor;

    public Discussao(int id, String titulo, String conteudo, List<Post> listaPosts, Aluno autor) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.listaPosts = (List<Post>) listaPosts;
        this.autor = autor;
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


||||||| 5701cd5
=======
package dados;

import java.util.List;
import dados.*;

public class Discussao {
    private int id; 
    private String titulo, conteudo;
    private List<Posts> listaPosts; // alteração com relação ao diagrama
    private Aluno autor;

    public Discussao(int id, String titulo, String conteudo, List<Posts> listaPosts, Aluno autor) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.listaPosts = listaPosts;
        this.autor = autor;
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
  
    public List<Posts> getListaPosts() {
        return listaPosts;
    }

    public void setListaPosts(List<Posts> listaPosts) {
        this.listaPosts = listaPosts;
    }

    @Override
    public String toString() {
        return "Discussao [conteudo=" + conteudo + ", id=" + id + ", listaPosts=" + listaPosts + ", titulo=" + titulo
                + "]";
    }
}



>>>>>>> master
