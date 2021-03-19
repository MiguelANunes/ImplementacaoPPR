package dados;

public class Cliente {
    private int cpf, telefone;
    private String nome, endereco;

    public Cliente(int cpf, int telefone, String nome, String endereco) {
        this.cpf = cpf;
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
    
}
