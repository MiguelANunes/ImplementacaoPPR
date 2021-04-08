package dados;

import java.io.Serializable;

public class Resposta implements Serializable{
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
