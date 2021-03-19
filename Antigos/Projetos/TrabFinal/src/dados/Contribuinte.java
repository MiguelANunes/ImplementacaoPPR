package dados;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Contribuinte implements Serializable {
    private String cpf,nome,endereco;
    private int idade,contaBancaria;
    private List<Dependente> listaDependentes = new ArrayList();
    private List<NotaFiscal> listaNotas = new ArrayList<>();
    private List<Contracheque> listaReceita = new ArrayList<>();
    private List<Bem> listaBens = new ArrayList<>();
    int contDependentes=0;
    
    
    // Construtor Implícito //

    public Contribuinte() {
    }
    
    
    //Getter e setters //
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(int contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
    
    // metodos //
    
    public void addDependente(Dependente d){
        listaDependentes.add(d);
    }
    
    public void removeDependente(Dependente d){
        listaDependentes.remove(d);
    }
    
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
     
    public void addBem(Bem b){
        listaBens.add(b);
    }
    
    public void removeBem(Bem b){
        listaBens.remove(b);
    }
    
    public List<Dependente> consultaDependentes(){
        for (int i=0; i< listaDependentes.size(); i++){
            System.out.println("Nome do Dependente"+i+": "+listaDependentes.get(i).getNome());
            System.out.println("Idade do Dependente"+i+": "+listaDependentes.get(i).getIdade());
            System.out.println("CPF do Dependente"+i+": "+listaDependentes.get(i).getCpf());
            System.out.println("Endereco do Dependente"+i+": "+listaDependentes.get(i).getEndereco());
        }
        return listaDependentes;
    }

    public List<Bem> consultaBens(){
        for (int i=0; i<listaBens.size(); i++){
            System.out.println("Nome do Bem "+i+": "+listaBens.get(i).getNome());
            System.out.println("Tipo do Bem "+i+": "+listaBens.get(i).getTipo());
            System.out.println("Valor do Bem "+i+":"+listaBens.get(i).getValor());
        }
        return listaBens;
    }
    
    public List<Contracheque> consultaReceita(){
        float receitaTotal=0;
        for (int i=0; i<listaReceita.size(); i++){
            System.out.println("CNPJ da Nota Fiscal "+i+": "+listaReceita.get(i).getCnpj());
            System.out.println("Numero de protocolo da Nota Fiscal "+i+": "+listaReceita.get(i).getNumProtocolo());
            System.out.println("Valor da Nota Fiscal "+i+": "+listaReceita.get(i).getValor());
            receitaTotal+=listaReceita.get(i).getValor();
        }
        System.out.println("A Receita total eh: "+receitaTotal);
        return listaReceita;
    }
    
    public List<NotaFiscal> consultaDespesas(){
        float despesaTotal=0;
        for (int i=0; i<listaNotas.size(); i++){
            System.out.println("CNPJ do Contracheque "+i+": "+listaNotas.get(i).getCnpj());
            System.out.println("Numero de protocolo do Contracheque "+i+": "+listaNotas.get(i).getNumProtocolo());
            System.out.println("Valor do Contracheque "+i+": "+listaNotas.get(i).getValor());
            despesaTotal+=listaNotas.get(i).getValor();
        }
        System.out.println("A Despesa total eh: "+despesaTotal);
        return listaNotas;
    }
    
}
