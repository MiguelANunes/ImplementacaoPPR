package dados;


public class Post {
    private String pergunta;

    public Post(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    @Override
    public String toString() {
        return "Post {" + "pergunta: " + this.pergunta + " .}";
    }
    
    
    
    
    
    
}
