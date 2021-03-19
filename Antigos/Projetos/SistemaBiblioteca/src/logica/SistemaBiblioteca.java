package logica;

import dados.*;
import dados.Pessoa;

public class SistemaBiblioteca {

    private Pessoa[] listaUsuario = new Pessoa[100];
    private int quantPessoas=0, quantAlunos=0, quantProfessores=0;
    
    public void CadastraPessoa(Pessoa p){
        listaUsuario[quantPessoas] = p;
        quantPessoas++;
    }
    
    public void CadastraProfessor(Professor p){
        listaUsuario[quantPessoas] = p;
        quantPessoas++;
        quantProfessores++;
    }
    
    
    public void CadastraAluno(Aluno a){
        listaUsuario[quantPessoas] = a;
        quantPessoas++;
        quantAlunos++;
    }
    
    public Aluno[] listaAlunos(){
        Aluno alunos[] = new Aluno[quantAlunos];
        int contAlunos = 0;
        
        for(int i = 0; i<quantPessoas; i++){
            if(listaUsuario[i] instanceof Aluno){
                alunos[contAlunos] = (Aluno) listaUsuario[i];
                contAlunos++;        
            }
        }
        
        return alunos;
    }
    
    public Professor[] listaProfessor(){
        Professor professores[] = new Professor[quantProfessores];
        int contProfessores=0;
        
        for (int i=0; i<quantPessoas; i++){
            if(listaUsuario[i] instanceof Professor){
                professores[contProfessores] = (Professor) listaUsuario[i];
                contProfessores++;
            }
        }
        return professores;
    }
 
    public Pessoa[] listaPessoa(){
        Pessoa[] pessoas = new Pessoa[quantPessoas];
        
        for (int i=0; i<quantPessoas; i++){
            pessoas[i] = listaUsuario[i];
        }
        
        return pessoas;
        
    }
    
    public int mostrarTempoEmprestimo(Pessoa p){
        if(p instanceof Pessoa)
            return p.mostrarTempoEmprestimo();
        if(p instanceof Aluno)
            return p.mostrarTempoEmprestimo();
        if(p instanceof Professor)
            return p.mostrarTempoEmprestimo();
        
        else
            return 0;
    }
    
    
    public Professor[] listaProfesoresSalario(float salario){
        Professor[] listaprofessores = new Professor[quantProfessores]; 
        listaprofessores = listaProfessor();
        Professor[] listaSalarioMaior = new Professor[quantProfessores];
        
        for(int i=0; i<quantProfessores; i++){
            if(listaprofessores[i].getSalario() >= salario){
                listaSalarioMaior[i] = listaprofessores[i];
            }
        }
        return listaSalarioMaior;
    }
}
