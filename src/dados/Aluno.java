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

    public boolean login(){ 
        // retorna True/False se consegui ou não fazer login
        // pra implementar isso precisa antes implementar a parte de salvar dados do Aluno
        return true;
    }

    public void logout(){
        // não sei o que tem que fazer aqui
    }

    public void criarDiscussao(String titulo, String conteudo){
        // ?
        // imagino que seja só um new Discussao
    }

    public void editarDiscussao(){
        // ?
        // creio que não é possível implementar esse método pois na classe
        // discussão, não há nenhuma informação referente ao autor de uma discussão, logo
        // não teria como garantir que um aluno que está editando uma discussão
        // é o mesmo que criou ela
        // (bem, dizer que é impossível é uma afirmação muito forte, mas seria uma grandissíma gambiarra
        // pra implementar, e eu creio que não é isso que o projeto queria)
    }

    public void avaliarMonitor(){
        
    }
    
}
