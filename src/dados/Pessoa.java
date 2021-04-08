package dados;

import java.io.Serializable;

public class Pessoa  implements Serializable{
    public String nome, cpf, senha;

    public Pessoa(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
    
    public Pessoa(){
        
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean login(String cpf, String senha){ 
        return this.cpf == cpf && this.senha == senha;
    }

    // public void logout(){
    //     System.out.println("Saido do Sistema !");
    //     System.exit(1);
    // }
    
    
}
