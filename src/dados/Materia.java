package dados;

import java.util.*;
import dados.*;
import java.io.Serializable;

public class Materia implements Serializable {
    private int id;
    private String nome;
    private List<Aluno> lista_alunos;
    private List<Professor> lista_professores;
    private List<Monitor> lista_monitores;
    private List<Discussao> listaDiscussao = new ArrayList();
    private int discCount=0;
  
    public Materia(){ // construtor vazio, para poder chamar na main

    }
    
    public Materia(int id, String nome, List<Aluno> lista_alunos, List<Professor> lista_professores,
            List<Discussao> listaDiscussao, List<Monitor> lista_monitores) {
        this.id = id;
        this.nome = nome;
        this.lista_alunos = lista_alunos;
        this.lista_professores = lista_professores;
        this.listaDiscussao = listaDiscussao;
        this.lista_monitores = lista_monitores;
    }
  
    public void AdicionaDiscussao(Discussao d) {
		listaDiscussao.add(d);
		discCount++;
	}
  
    public void removeDiscussao(Discussao d){
        listaDiscussao.remove(d);
        discCount--;
    }
  
    public void adicionarPost(Post novopost, Discussao alvo){
        for (Discussao D : this.listaDiscussao){
            if (D.getID() == alvo.getID()){
               D.AdicionaPost(novopost);
            }
        }
    }

    public List<Discussao> consultaDiscussao(){
        List<Discussao> listaRetorno = new ArrayList(listaDiscussao);
        return listaRetorno;
    }
  
    public int getId() {
        return id;
    }

    public int getDiscCount() {
        return discCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getLista_alunos() {
        return lista_alunos;
    }

    public void setLista_alunos(List<Aluno> lista_alunos) {
        this.lista_alunos = lista_alunos;
    }
    
    public List<Professor> getLista_professores() {
        return this.lista_professores;
    }
    
    public void setLista_professores(List<Professor> lista_professores) {
        this.lista_professores = lista_professores;
    }

    public List<Monitor> getLista_monitores() {
        return this.lista_monitores;
    }

    public void setLista_monitores(List<Monitor> lista_monitores) {
        this.lista_monitores = lista_monitores;
    }

    public List<Discussao> getLista_discussoes() {
        return listaDiscussao;
    }

    public void setLista_discussoes(List<Discussao> lista_discussoes) {
        this.listaDiscussao = lista_discussoes;
    }
    
    @Override
    public String toString() {
        return "Materia [id=" + id + ", lista_alunos=" + lista_alunos + ", lista_discussoes=" + listaDiscussao
                + ", lista_professores=" + lista_professores + ", nome=" + nome + ", lista_monitores=" + lista_monitores + "]";
    }
    
    public void adicionarAluno(Aluno novo_aluno){
        this.lista_alunos.add(novo_aluno);
    }

    public void adicionarProfessor(Professor novo_professor){
        this.lista_professores.add(novo_professor);
    }

    public void adicionarMonitor(Monitor novo_monitor){
        this.lista_monitores.add(novo_monitor);
    }
}

    
