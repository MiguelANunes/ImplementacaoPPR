package dados;


public class Aluno extends Pessoa {

    public Aluno(String nome, String cpf, String senha) {
        super(nome,cpf,senha);
    }
    
    public Aluno(){
        
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno [cpf=" + cpf + ", nome=" + nome + ", senha=" + senha + "]";
    }
    
}
