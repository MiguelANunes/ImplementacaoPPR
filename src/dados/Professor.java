package dados;


public class Professor {
    private String nome, cpf, senha;
    

    public Professor(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
    
        public String getNome() {
        return nome;
    }
        public String getCPF(){
            return cpf;
        }
        public String getSenha(){
            return senha;
        }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void login(){
    // void por hora    
    }
    
    public void logout(){
    // void por hora
    }
    
    
    @Override
    public String toString() {
        return "Professor:" + this.nome + " , CPF: " + this.cpf + "senha: " + this.senha + " .";
        // disclaimer: mostrar o campo senha aqui é puramente para propósitos de debug.
        // Realisticcamente nunca teríamos algo assim, a não ser que fosse algo privado.
    }
    
    
    
}
