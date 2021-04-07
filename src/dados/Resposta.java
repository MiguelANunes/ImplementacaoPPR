package dados;


public class Resposta {
    private String resposta;

    public String getResposta() {
        return resposta;
    }

    public Resposta(String resposta) {
        this.resposta = resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    @Override
    public String toString() {
        return "Resposta: " + this.resposta + ".";
    }
    
     
    
}
