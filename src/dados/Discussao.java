package dados;

public class Discussao {
    private int id; 
    private String titulo, conteudo;

    public Discussao(int id, String titulo, String conteudo) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
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
    
    @Override
    public String toString(){
        return "Titulo: " +this.titulo + "\nDescricao: " +this.conteudo + " .";
    }
    
}



