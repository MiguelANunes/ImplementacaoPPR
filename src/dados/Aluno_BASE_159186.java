package dados;

public class Aluno {
    private int cpf;
    private String senha;
    private String nome;

    public Aluno(int cpf, String senha, String nome) {
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
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

    // public bool login(){ 
    //     // retorna True/False se consegui ou não fazer login
    //     // pra implementar isso precisa antes implementar a parte de salvar dados do Aluno
    // }

    public void logout(){
        // não sei o que tem que fazer aqui
    }

    public void criarDiscussao(String titulo, String conteudo){
        // ?
        // imagino que seja só um new Discussao
    }

    public void editarDiscussao(){
        // ?
    }

    public void avaliarMonitor(){
        
    }
    
}

