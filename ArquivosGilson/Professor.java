package dados;

public class Professor extends Pessoa {
    private String formacao, departamento;
    private float salario;
    
    public Professor(String nome, int cpf, String email, int tempEmprestimo, String formacao, float salario, String departamento){
        super(nome,cpf,email,tempEmprestimo);
        this.formacao = formacao;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    // metodos //
    
    public int mostrarTempoEmprestimo(){
        return (int) (super.mostrarTempoEmprestimo()*1.70);
    }
    
}
