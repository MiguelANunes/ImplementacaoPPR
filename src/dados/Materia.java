package dados;

import java.util.*;
import dados.Aluno;

public class Materia {
    private int id;
    private String nome;
    private List<Aluno> lista_alunos;
    // private List<Professor> lista_professores;
    // private List<Discussao> lista_discussoes;
    // Descomentam esses atributos e funções relacionadas assim
    // que professor e matéria forem implementados

    public Materia(int id, String nome) {
        this.id = id;
        this.nome = nome;
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

    @Override
    public String toString() {
        return "Materia [id = " + id + ", lista_alunos = " + lista_alunos + ", nome = " + nome + "]";
    }
    
    public void adicionarAluno(Aluno novo_aluno){
        this.lista_alunos.add(novo_aluno);
    }

    // public void adicionarProfessor(Professor novo_professor){
    //     this.lista_professores.add(novo_professor);
    // }

    // public void adicionarPost(){
    // Esse método não faz muito sentido
    // }
    
}
