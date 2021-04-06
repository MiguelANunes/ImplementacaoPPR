package dados;

import java.util.ArrayList;
import java.util.List;

public class Monitor extends Pessoa {
    private Materia materia;
    private float score; 
    private List<Avaliacao> listaAvaliacao = new ArrayList();
    private int avaliacaoCount=0;

    public Monitor(String nome, String cpf, String senha, Materia materia, float score) {
        super(nome,cpf,senha);
        this.materia = materia;
        this.score = score;
        this.listaAvaliacao = avaliacao;
    }

    public void AdicionaAvaliacao(Avaliacao a) {
		listaAvaliacao.add(a);
		avaliacaoCount++;
	}

    public Materia getMateria() {
        return materia;
    }

    public float getScore() {
        return score;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
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
        return "Monitor{" + "nome: " + nome + ", cpf: " + cpf + ", materia: " + materia + ", score: " + score + '}';
    }


}
