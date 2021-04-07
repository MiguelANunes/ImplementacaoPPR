package dados;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String pergunta;
    private List<Resposta> listaResposta = new ArrayList();
    private int respostaCount=0;
    
    public void AdicionaResposta(Resposta r) {
		listaResposta.add(r);
		respostaCount++;
	}
    public void removeResposta(Resposta r){
        listaResposta.remove(r);
        respostaCount--;
    }
    public List<Resposta> consultaResposta(){
        List<Resposta> listaRetorno = new ArrayList(listaResposta);
        return listaRetorno;
    }
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
