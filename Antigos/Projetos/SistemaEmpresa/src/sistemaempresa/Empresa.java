package sistemaempresa;

public class Empresa {
    private String nome;
    private Endereço endereço;
    private Funcionario funcionarios[];
    private Cargo cargos[];
    private int contFunc = 0, contCarg = 0;
    
    
    Empresa(String nome, Endereço endereço, Funcionario[] funcionarios, Cargo[] cargos) {
        this.nome = nome;
        this.endereço = endereço;
        this.funcionarios = funcionarios;
        this.cargos = cargos;
    }

    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setEndereço(Endereço endereço){
        this.endereço = endereço;
    }
    
    public Endereço getEndereço(){
        return endereço;
    }
    
    public Empresa(int quant, int quantCargos){
        funcionarios = new Funcionario[quant];
        cargos = new Cargo[quantCargos];
    }
    
    public boolean addFuncionario(Funcionario func){
        if (contFunc < funcionarios.length){
            funcionarios[contFunc] = func;
            contFunc++;
            return true;
        }
        else
            return false;
    }
    
    public Funcionario getFuncionario(int pos){
        return funcionarios[pos];
    }
    
    public boolean addCargo(Cargo carg){
        if (contCarg < cargos.length){
            cargos[contCarg] = carg;
            contCarg++;
            return true;
        }
        else
            return false;
    }
    
    public Cargo getCargo(int pos){
        return cargos[pos];
    }
    // FUNÇÕES!!!!! //
    
    public float getMedia(){
        int cont=0;
        float media = 0;
        for (Funcionario funcionario : funcionarios) {
            media += funcionario.getSalarioLiquido();
            cont ++;
        }
        return media/cont;
    }
    
}
