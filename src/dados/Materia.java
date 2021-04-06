package dados;

import java.util.*;
import dados.*;

public class Materia {
    private int id;
    private String nome;
    private List<Aluno> lista_alunos;
    private List<Professor> lista_professores;
    private List<Discussao> lista_discussoes;
    private List<Monitor> lista_monitores;
    
    public Materia(){ // construtor vazio, para poder chamar na main
        this.id = id;
        this.nome = nome;
        this.lista_alunos = lista_alunos;
        this.lista_professores = lista_professores;
        this.lista_discussoes = lista_discussoes;
        this.lista_monitores = lista_monitores;
    }
    
    public Materia(int id, String nome, List<Aluno> lista_alunos, List<Professor> lista_professores,
            List<Discussao> lista_discussoes, List<Monitor> lista_monitores) {
        this.id = id;
        this.nome = nome;
        this.lista_alunos = lista_alunos;
        this.lista_professores = lista_professores;
        this.lista_discussoes = lista_discussoes;
        this.lista_monitores = lista_monitores;
    }

    public int getId() {
        return id;
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
        return lista_discussoes;
    }

    public void setLista_discussoes(List<Discussao> lista_discussoes) {
        this.lista_discussoes = lista_discussoes;
    }
    
    @Override
    public String toString() {
        return "Materia [id=" + id + ", lista_alunos=" + lista_alunos + ", lista_discussoes=" + lista_discussoes
                + ", lista_professores=" + lista_professores + ", nome=" + nome + ", lista_monitores=" + lista_monitores + "]";
    }
    
    public void adicionarAluno(Aluno novo_aluno){
        this.lista_alunos.add(novo_aluno);
    }

    public void adicionarProfessor(Professor novo_professor){
        this.lista_professores.add(novo_professor);
    }

    public void adicionarPost(Post novopost, Discussao alvo){
        // entendo que o que esse método deveria fazer é adicionar um post na discussão da matéria
        // mas, da maneira que foi definido no projeto, não há nenhum relacionamento entre discussão e 
        // post, logo, não tem como adicionar um post há uma discussão

        // estamos alterando a assinatura do método comparado ao que estava no projeto
        for (Discussao D : this.lista_discussoes){
            if (D.getID() == alvo.getID()){
                D.setListaPosts(D.getListaPosts().add(novopost));
                
            }
        }
    }

    
}
