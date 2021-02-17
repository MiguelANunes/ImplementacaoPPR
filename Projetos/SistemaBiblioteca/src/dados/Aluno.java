package dados;

import dados.Pessoa;

public class Aluno extends Pessoa {
    private String curso, fase;
    private int matricula;

    public Aluno(){
        
    }
    
    public Aluno(String nome, int cpf, String email, int tempEmprestimo, String curso, String fase, int matricula) {
        super(nome, cpf, email, tempEmprestimo);
        this.curso = curso;
        this.fase = fase;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    //metodos//
    
    public int mostrarTempoEmprestimo(){
        return (int) (super.mostrarTempoEmprestimo()*1.40);
    }
    
}
