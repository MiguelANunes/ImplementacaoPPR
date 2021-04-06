package dados;


public class Monitor extends Pessoa {
    private Materia materia;
    private float score; 

    public Monitor(String nome, String cpf, String senha, Materia materia, float score) {
        super(nome,cpf,senha);
        this.materia = materia;
        this.score = score;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Materia getMateria() {
        return materia;
    }

    public float getScore() {
        return score;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setScore(float score) {
        this.score = score;
    }


    public void login(){
    // void por hora    
    }
    
    public void logout(){
    // void por hora
    }

    public void relatorioMonitor(){
        // ???
    }

    
    @Override
    public String toString() {
        return "Monitor{" + "nome: " + nome + ", cpf: " + cpf + ", materia: " + materia + ", score: " + score + '}';
    }

    
}
