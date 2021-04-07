package dados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Monitor extends Pessoa implements Serializable {
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
		totalscore = totalscore+= a.getRanking();
		setScore(totalscore/avaliacaoCount);
	}
    public void removeAvaliacao(Avaliacao a){
        listaAvaliacao.remove(a);
        avaliacaoCount--;
    }
    public List<Avaliacao> consultaAvaliacao(){
        List<Avaliacao> listaRetorno = new ArrayList(listaAvaliacao);
        return listaRetorno;
    }
	public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Materia getMateria() {
        return materia;
    }

    public float getScore() {
        return score;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
