package dados;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class PessoaJuridica implements Serializable {
    private String cnpj, nomePJ, endereco;
    private int numFuncionarios;
    private List<NotaFiscal> listaNotas = new ArrayList();
    private List<Contracheque> listaReceita = new ArrayList();

    
    
    // Construtor Implícito //
    
    public PessoaJuridica(){
    }
    
    // Getters e Setters //
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomePJ() {
        return nomePJ;
    }

    public void setNomePJ(String nomePJ) {
        this.nomePJ = nomePJ;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }
    // metodos //
    
    public void addNotaFiscal(NotaFiscal n){
        listaNotas.add(n);
    }
    
    public void removeNotaFiscal(NotaFiscal n){
        listaNotas.remove(n);
    }
        
    public void addReceita(Contracheque cc){
        listaReceita.add(cc);
    }
    
    public void removeReceita(Contracheque cc){
        listaReceita.remove(cc);
    }
    
    public List<Contracheque> consultaReceita(){
        for (int i=0; i<listaReceita.size(); i++){
            System.out.println("CNPJ da Nota Fiscal "+i+": "+listaReceita.get(i).getCnpj());
            System.out.println("Numero de protocolo da Nota Fiscal "+i+": "+listaReceita.get(i).getNumProtocolo());
            System.out.println("Valor da Nota Fiscal "+i+": "+listaReceita.get(i).getValor());
        }
        return listaReceita;
    }
    
    public List<NotaFiscal> consultaDespesas(){
        for (int i=0; i<listaNotas.size(); i++){
            System.out.println("CNPJ do Contracheque "+i+": "+listaNotas.get(i).getCnpj());
            System.out.println("Numero de protocolo do Contracheque "+i+": "+listaNotas.get(i).getNumProtocolo());
            System.out.println("Valor do Contracheque "+i+": "+listaNotas.get(i).getValor());
        }
        return listaNotas;
    }
    
}
