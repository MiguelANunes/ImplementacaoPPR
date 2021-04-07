package dados;


public class Resposta {
    private String resposta;
    

    
    public Resposta(){
        
    }
    
    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    @Override
    public String toString() {
        return "Resposta: " + this.resposta + ".";
    }
    
}
