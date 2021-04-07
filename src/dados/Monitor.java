package dados;

import java.util.ArrayList;
import java.util.List;

public class Monitor extends Pessoa {
    private float score; 
    private List<Avaliacao> listaAvaliacao = new ArrayList();
    private int avaliacaoCount=0;

    public Monitor(String nome, String cpf, String senha, Materia materia, float score) {
        super(nome,cpf,senha);
        this.score = score;
    }
    
    public Monitor(){
    
    }

    public void AdicionaAvaliacao(Avaliacao a) {
		listaAvaliacao.add(a);
		avaliacaoCount++;
	}


    public float getScore() {
        return score;
    }

 
    public void setScore(float score) {
        this.score = score;
    }

    public void login(){
    // void por hora    
    }

    public void logout(){
    // void por hora
    }

    @Override
    public String toString() {
        return "Monitor{" + "nome: " + nome + ", cpf: " + cpf + "score:"  + score + '}';
    }


}