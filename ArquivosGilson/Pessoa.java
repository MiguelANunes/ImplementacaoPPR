package dados;

public class Pessoa {

    private String nome,email;
    private int cpf, tempEmprestimo;
    
    public Pessoa(String nome, int cpf, String email, int tempEmprestimo){
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.tempEmprestimo = tempEmprestimo;
}

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTempEmprestimo() {
        return tempEmprestimo;
    }

    public void setTempEmprestimo(int tempEmprestimo) {
        this.tempEmprestimo = tempEmprestimo;
    }
    
    // metodos //
    
    public int mostrarTempoEmprestimo(){
        return tempEmprestimo;
    }
    
    
}
