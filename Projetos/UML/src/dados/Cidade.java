package dados;

public class Cidade {
    private String nome, estado;
    private Aeroporto aero[];
    private int quantAero = 0;
    
    public Cidade(String nome, String estado, Aeroporto aero[]) {
        this.nome = nome;
        this.estado = estado;
        this.aero = aero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void addAeroporto(Aeroporto aero){
        Aeroporto[quantAero] = aero;
        quantAero++;
    }
    
    
    
}
