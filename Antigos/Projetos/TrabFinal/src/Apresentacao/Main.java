package Apresentacao;
import negocio.*;
import dados.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;


public class Main {

    public static SistemaFiscal sistema = new SistemaFiscal();
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int escolha = -1;
        LeBinario();
        
        
        while(escolha != 0){
            System.out.println("Bem vindo ao sistema de Declaracao de Imposto de Rendao. ");
            System.out.println("Para iniciar, escolha uma opcao ");
            System.out.println("1 - Cadastrar Contribuinte;");
            System.out.println("2 - Cadastrar Dependente;");
            System.out.println("3 - Incluir um Bem;");
            System.out.println("4 - Validar Nota Fiscal;");
            System.out.println("5 - Validar Contracheque;");
            System.out.println("6 - Cadastrar Pessoa Juridica;");
            System.out.println("7 - Alterar Contribuinte existente;");
            System.out.println("8 - Alterar Dependente existente");
            System.out.println("9 - Alterar Pessoa Juridica existente;");
            System.out.println("10 - Remover Dependente;");
            System.out.println("11 - Remover Bem;");
            System.out.println("12 - Remover Nota Fiscal;");
            System.out.println("13 - Remover Contracheque;");
            System.out.println("14 - Remover Pessoa Juridica;");
            System.out.println("15 - Consultar Contribuinte; ");
            System.out.println("16 - Consultar Receita de um Contribuinte;");
            System.out.println("17 - Consultar Despesas de um Contribuinte;");
            System.out.println("18 - Consultar Pessoa Juridica;");
            System.out.println("0 - Sair do Programa");
            escolha = in.nextInt();
        
        switch (escolha){
            
            case 1:{
                cadastraContribuinte();
                break;
            }
            case 2:{
                Contribuinte c = consultaContribuintes();
                cadastraDependente(c);
                break;
            }
            case 3:{
                Contribuinte c = consultaContribuintes();
                cadastraBem(c);
                break;
            }
            case 4:{
                System.out.println("Voce deseja validar nota para PF(1) ou PJ(2)?");
                int PF = in.nextInt();
                if(PF == 1){
                    Contribuinte c = consultaContribuintes();
                    validaNota(c);
                    break;
                }
                else{
                    if (PF == 2){
                        PessoaJuridica pj = consultaPJ();
                        validaNota(pj);
                        break;
                }
                    else{
                        System.out.println("Entre com uma escolha valida.");
                        break;
                    }
                }
            }
            
            case 5:{
                System.out.println("Voce deseja validar Contracheque para PF(1) ou PJ(2)?");
                int PF = in.nextInt();
                if(PF == 1){
                    Contribuinte c = consultaContribuintes();
                    validaCheque(c);
                    break;
                }
                else{
                    if(PF == 2){
                        PessoaJuridica pj = consultaPJ();
                        validaCheque(pj);
                        break;
                    }
                    else{
                        System.out.println("Entre com um valor valido.");
                        break;
                    }
                }
            }
            
            case 6:{
                cadastraPessoaJuridica();
                break;
            }
            
            case 7:{
                Contribuinte c = consultaContribuintes();
                AlterarContribuinte(c);
                break;
            }
            case 8:{
                int indiceDependente;
                Contribuinte c = consultaContribuintes();
                List<Dependente> listaConsulta = c.consultaDependentes();
                System.out.println("Qual dependente gostaria de alterar? Use o indice.");
                indiceDependente = in.nextInt();
                AlterarDependente(listaConsulta.get(indiceDependente));
                break;
            }
            case 9:{
                PessoaJuridica pj = consultaPJ();
                AlterarPJ(pj);
                break;
            }
            case 10:{
                Contribuinte c = consultaContribuintes();
                removeDependente(c);
                break;
            }
            case 11:{
                Contribuinte c = consultaContribuintes();
                removeBens(c);
                break;
            }
            case 12:{
                int opcaoPFPJ;
                System.out.println("Voce gostaria de remover uma nota fiscal de uma pessoa fisica(1) ou juridica?(2)");
                opcaoPFPJ = in.nextInt();
                if(opcaoPFPJ == 1){
                    Contribuinte c = consultaContribuintes();
                    removeNota(c);
                }
                else{
                    if(opcaoPFPJ == 2){
                        PessoaJuridica pj = consultaPJ();
                        removeNota(pj);
                    }
                    else{
                        System.out.println("Entre com um valor valido.");
                    }
                }
                break;
            }
            case 13:{
                int opcaoPFPJ;
                System.out.println("Voce gostaria de remover um contracheque de uma pessoa fisica(1) ou juridica?(2)");
                opcaoPFPJ = in.nextInt();
                if(opcaoPFPJ == 1){
                    Contribuinte c = consultaContribuintes();
                    removeCheque(c);
                }
                else{
                    if(opcaoPFPJ == 2){
                        PessoaJuridica pj = consultaPJ();
                        removeCheque(pj);
                    }
                    else{
                        System.out.println("Entre com um valor valido.");
                    }
                }
                break;
            }
            case 14:{
                PessoaJuridica pj = consultaPJ();
                removePJ(pj);
                break;
            }
            case 15:{
                consultaAtributoContribuinte();
                break;
            }
            case 16:{
                Contribuinte c = consultaContribuintes();
                c.consultaReceita();
                break;
            }
            case 17:{
                Contribuinte c = consultaContribuintes();
                c.consultaDespesas();
                break;
            }
            case 18:{
                consultaAtributoPJ();
                break;
            }
            default:
                EscreveBinario();
                break;
        }
    }
 }   
    // Cadastro ou Inserção
    public static void cadastraContribuinte(){
        Contribuinte c = new Contribuinte();
        in.nextLine();
        System.out.println("Qual o nome do contribuinte?");
        c.setNome(in.nextLine());
        System.out.println("QUal a idade do contribuinte?");
        c.setIdade(Integer.parseInt(in.nextLine()));
        System.out.println("Qual o CPF do contribuinte?");
        c.setCpf(in.nextLine());
        System.out.println("Qual a Conta Bancaria do contribuinte?");
        c.setContaBancaria(Integer.parseInt(in.nextLine()));
        System.out.println("Qual o Endereco do Contribuinte?");
        c.setEndereco(in.nextLine());
        sistema.cadastraContribuinte(c);
    }

    
    public static void cadastraPessoaJuridica(){
        PessoaJuridica j = new PessoaJuridica();
        in.nextLine();
        System.out.println("Qual o nome da Pessoa Juridica?");
        j.setNomePJ(in.nextLine());
        System.out.println("Qual o CNPJ da Pessoa Juridica?");
        j.setCnpj(in.nextLine());
        System.out.println("Qual o endereco da Pessoa Juridica?");
        j.setEndereco(in.nextLine());
        System.out.println("Qual o numero de funcionarios da Pessoa Juridica?");
        j.setNumFuncionarios(Integer.parseInt(in.nextLine()));
        sistema.cadastraJuridica(j);
    }
    // Consultas
    
    public static Contribuinte consultaContribuintes() {
        int opcao;
        List<Contribuinte> listaConsulta1 = new ArrayList();
        listaConsulta1 = sistema.consultaContribuinte();
        System.out.println("Qual contribuinte voce gostaria de consultar?");
        for (int i=0; i<listaConsulta1.size(); i++){
            System.out.println(+i+": "+listaConsulta1.get(i).getNome()+" CPF: "+listaConsulta1.get(i).getCpf());
        }
        opcao = in.nextInt();
       return listaConsulta1.get(opcao); 
    }
    
    public static PessoaJuridica consultaPJ(){
        int opcao;
        List<PessoaJuridica> listaConsulta2 = new ArrayList();
        listaConsulta2 = sistema.consultaJuridica();
        System.out.println("Qual PJ voce gostaria de consultar?");
        for (int i=0; i<listaConsulta2.size(); i++){
            System.out.println(+i+": "+listaConsulta2.get(i).getNomePJ()+" CNPJ: "+listaConsulta2.get(i).getCnpj());
        }
        opcao = in.nextInt();
        return listaConsulta2.get(opcao);
    }
    
    public static void consultaAtributoContribuinte(){
        Contribuinte c = consultaContribuintes();
        System.out.print("\n");
        System.out.println("nome: "+c.getNome());
        System.out.println("Idade: "+c.getIdade());
        System.out.println("CPF: "+c.getCpf());
        System.out.println("Endereco: "+c.getEndereco());
        System.out.println("\n LISTA DE DEPENDENTES \n");
        c.consultaDependentes();
        System.out.println("\n LISTA DE BENS \n");
        c.consultaBens();
        System.out.println("\n LISTA DE RECEITAS \n");
        c.consultaReceita();
        System.out.println("\n LISTA DE DESPESAS \n");
        c.consultaDespesas();
    }
    
    public static void consultaAtributoPJ (){
        PessoaJuridica pj = consultaPJ();
        System.out.print("n");
        System.out.println("Nome: "+pj.getNomePJ());
        System.out.println("CNPJ: "+pj.getCnpj());
        System.out.println("Endereco: "+pj.getEndereco());
        System.out.println("Numero de Funcionarios: "+pj.getNumFuncionarios());
        System.out.println("\n LISTA DE DESPESAS \n");
        pj.consultaDespesas();
        System.out.println("\n LISTA DE RECEITAS\n");
        pj.consultaReceita();
    }
// Cadastro de Atributos 
    public static void cadastraDependente(Contribuinte con) {
        in.nextLine();
        Dependente d = new Dependente();
        System.out.println("Qual o nome do Depentente?");
        d.setNome(in.nextLine());
        System.out.println("Qual a idade do Depentente?");
        d.setIdade(Integer.parseInt(in.nextLine()));
        System.out.println("Qual o CPF do Dependente?");
        d.setCpf(in.nextLine());
        System.out.println("Qual o Endereco do Dependente?");
        d.setEndereco(in.nextLine());
        con.addDependente(d);
    }

    public static void cadastraBem(Contribuinte con) {
        in.nextLine();
        Bem b = new Bem();
        System.out.println("Qual o nome do Bem?");
        b.setNome(in.nextLine());
        System.out.println("Qual o tipo do Bem?");
        b.setTipo(in.nextLine());
        System.out.println("Qual o valor do bem?");
        b.setValor(Float.parseFloat(in.nextLine()));
        con.addBem(b);
    }

    public static void validaNota(Contribuinte c) {
        in.nextLine();
        NotaFiscal nf = new NotaFiscal();
        System.out.println("Qual o CNPJ da nota?");
        nf.setCnpj(in.nextLine());
        System.out.println("Qual o numero de protocolo da nota?");
        nf.setNumProtocolo(Integer.parseInt(in.nextLine()));
        System.out.println("Qual o valor da nota?");
        nf.setValor(Float.parseFloat(in.nextLine()));
        c.addNotaFiscal(nf);
    }
    
    public static void validaNota(PessoaJuridica pj){
        in.nextLine();
        NotaFiscal nf = new NotaFiscal();
        System.out.println("Qual o CNPJ da nota?");
        nf.setCnpj(in.nextLine());
        System.out.println("Qual o numero de protocolo da nota?");
        nf.setNumProtocolo(Integer.parseInt(in.nextLine()));
        System.out.println("Qual o valor da nota?");
        nf.setValor(Float.parseFloat(in.nextLine()));
        pj.addNotaFiscal(nf);
    }

    public static void validaCheque(Contribuinte c) {
        Contracheque cc = new Contracheque();
        in.nextLine();
        System.out.println("Qual o CNPJ do cheque?");
        cc.setCnpj(in.nextLine());
        System.out.println("Qual o numero de protocolo do cheque?");
        cc.setNumProtocolo(Integer.parseInt(in.nextLine()));
        System.out.println("Qual o valor do cheque?");
        cc.setValor(Float.parseFloat(in.nextLine()));
        c.addReceita(cc);
    }
    
    public static void validaCheque(PessoaJuridica pj){
        Contracheque cc = new Contracheque();
        in.nextLine();
        System.out.println("Qual o CNPJ do cheque?");
        cc.setCnpj(in.nextLine());
        System.out.println("Qual o numero de protocolo do cheque?");
        cc.setNumProtocolo(Integer.parseInt(in.nextLine()));
        System.out.println("Qual o valor do cheque?");
        cc.setValor(Float.parseFloat(in.nextLine()));
        pj.addReceita(cc);        
    }
    // Remoção de Atributos
    
    public static void removeDependente(Contribuinte c){
        int escolhaRemocao, itemRemocao;
        in.nextLine();
        System.out.println("Remover apenas um Dependente (1) ou Todos(2)?");
        escolhaRemocao = Integer.parseInt(in.nextLine());
        in.nextLine();
        if(escolhaRemocao == 1){
            List<Dependente> listaRemocao = c.consultaDependentes();
            System.out.println("Qual dependente gostaria de remover? Utilize o indice");
            itemRemocao = Integer.parseInt(in.nextLine());
            c.removeDependente(listaRemocao.get(itemRemocao));
            System.out.println("Removido com sucesso!");
        }
        else{
            if(escolhaRemocao == 2){
                List<Dependente> listaRemocao = c.consultaDependentes();
                for (int i=listaRemocao.size(); i > 0; i--){
                    c.removeDependente(listaRemocao.get(i));
                }
            }
            else{
                System.out.println("Entre com um valor valido.");
            }
        }
    }
    
    public static void removeBens(Contribuinte c){
     int escolhaRemocao, itemRemocao;
        System.out.println("Remover apenas um Bem (1) ou Todos(2)?");
        escolhaRemocao = Integer.parseInt(in.nextLine());
        in.nextLine();
        if(escolhaRemocao == 1){
            List<Bem> listaRemocao = c.consultaBens();
            System.out.println("Qual Bem gostaria de remover? Utilize o indice");
            itemRemocao = Integer.parseInt(in.nextLine());
            c.removeBem(listaRemocao.get(itemRemocao));
            System.out.println("Removido com sucesso!");
        }
        else{
            if(escolhaRemocao == 2){
                List<Bem> listaRemocao = c.consultaBens();
                for (int i=listaRemocao.size(); i > 0; i--){
                    c.removeBem(listaRemocao.get(i));
                }
            }
            else{
                System.out.println("Entre com um valor valido.");
            }
        }
    }
    
    public static void removeNota(Contribuinte c){
        int escolhaRemocao, itemRemocao;
        System.out.println("Remover apenas uma Nota (1) ou Todas(2)?");
        escolhaRemocao = Integer.parseInt(in.nextLine());
        in.nextLine();
        if(escolhaRemocao == 1){
            List<NotaFiscal> listaRemocao = c.consultaDespesas();
            System.out.println("Qual Nota Fiscal gostaria de remover? Utilize o indice");
            itemRemocao = Integer.parseInt(in.nextLine());
            c.removeNotaFiscal(listaRemocao.get(itemRemocao));
            System.out.println("Removida com sucesso!");
        }
        else{
            if(escolhaRemocao == 2){
                List<NotaFiscal> listaRemocao = c.consultaDespesas();
                for (int i=listaRemocao.size(); i > 0; i--){
                    c.removeNotaFiscal(listaRemocao.get(i));
                }
            }
            else{
                System.out.println("Entre com um valor valido.");
            }
        }        
    }
    
    public static void removeCheque(Contribuinte c){
        int escolhaRemocao, itemRemocao;
        in.nextLine();
        System.out.println("Remover apenas um Contracheque (1) ou Todos(2)?");
        escolhaRemocao = Integer.parseInt(in.nextLine());
        in.nextLine();
        if(escolhaRemocao == 1){
            List<Contracheque> listaRemocao = c.consultaReceita();
            System.out.println("Qual Contracheque gostaria de remover? Utilize o indice");
            itemRemocao = Integer.parseInt(in.nextLine());
            c.removeReceita(listaRemocao.get(itemRemocao));
            System.out.println("Removido com sucesso!");
        }
        else{
            if(escolhaRemocao == 2){
                List<Contracheque> listaRemocao = c.consultaReceita();
                for (int i=listaRemocao.size(); i > 0; i--){
                    c.removeReceita(listaRemocao.get(i));
                }
            }
            else{
                System.out.println("Entre com um valor valido.");
            }
        }
    }
    
    public static void removeNota(PessoaJuridica pj){
        int escolhaRemocao, itemRemocao;
        in.nextLine();
        System.out.println("Remover apenas uma Nota (1) ou Todas(2)?");
        escolhaRemocao = Integer.parseInt(in.nextLine());
        in.nextLine();
        if(escolhaRemocao == 1){
            List<NotaFiscal> listaRemocao = pj.consultaDespesas();
            System.out.println("Qual Nota Fiscal gostaria de remover? Utilize o indice");
            itemRemocao = Integer.parseInt(in.nextLine());
            pj.removeNotaFiscal(listaRemocao.get(itemRemocao));
            System.out.println("Removida com sucesso!");
        }
        else{
            if(escolhaRemocao == 2){
                List<NotaFiscal> listaRemocao = pj.consultaDespesas();
                for (int i=listaRemocao.size(); i > 0; i--){
                    pj.removeNotaFiscal(listaRemocao.get(i));
                }
            }
            else{
                System.out.println("Entre com um valor valido.");
            }
        }      
    }
    
    
    public static void removeCheque(PessoaJuridica pj){
        int escolhaRemocao, itemRemocao;
        in.nextLine();
        System.out.println("Remover apenas um Contracheque (1) ou Todos(2)?");
        escolhaRemocao = Integer.parseInt(in.nextLine());
        in.nextLine();
        if(escolhaRemocao == 1){
            List<Contracheque> listaRemocao = pj.consultaReceita();
            System.out.println("Qual Contracheque gostaria de remover? Utilize o indice");
            itemRemocao = Integer.parseInt(in.nextLine());
            pj.removeReceita(listaRemocao.get(itemRemocao));
            System.out.println("Removido com sucesso!");
        }
        else{
            if(escolhaRemocao == 2){
                List<Contracheque> listaRemocao = pj.consultaReceita();
                for (int i=listaRemocao.size(); i > 0; i--){
                    pj.removeReceita(listaRemocao.get(i));
                }
            }
            else{
                System.out.println("Entre com um valor valido.");
            }
        }
    }
    // Remove Pessoa Juridica
    
    public static void removePJ(PessoaJuridica pj){
        sistema.removePessoaJuridica(pj);
        System.out.println("Remocao concluída!");
    }
    
    public static void AlterarContribuinte(Contribuinte c){
        in.nextLine();
        System.out.println("Altere o nome do contribuinte:");
        c.setNome(in.nextLine());
        System.out.println("Altere a Idade do contribuinte:");
        c.setIdade(Integer.parseInt(in.nextLine()));
        System.out.println("Altere o ENdereco do contribuinte");
        c.setEndereco(in.nextLine());
        System.out.println("Altere a Conta Bancaria do contribuinte");
        c.setContaBancaria(Integer.parseInt(in.nextLine()));
        System.out.println("Alteracao Concluida!");
    }
    // Alterações
    
    public static void AlterarDependente(Dependente d){
        in.nextLine();
        System.out.println("Altere o nome do dependente: ");
        d.setNome(in.nextLine());
        System.out.println("Altere a idade do dependente:");
        d.setIdade(Integer.parseInt(in.nextLine()));
        System.out.println("Altere o endereco do dependente:");
        d.setEndereco(in.nextLine());
        System.out.println("Alteracao Concluida!");
    }
    
    public static void AlterarPJ(PessoaJuridica pj){
        in.nextLine();
        System.out.println("Altere o nome da pessoa juridica:");
        pj.setNomePJ(in.nextLine());
        System.out.println("Altere o endereco da pessoa juridica:");
        pj.setEndereco(in.nextLine());
        System.out.println("Altere o numero de funcionarios da pessoa juridica:");
        pj.setNumFuncionarios(Integer.parseInt(in.nextLine()));
        System.out.println("Alteracao concluida!");
    }
    // Persistência de Dados em Arquivo
    
    private static void EscreveBinario(){
        ArrayList<Object> listaObjetoEntrada = new ArrayList();
        try{
            OutputStream os = new FileOutputStream("ArquivoBinario.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for(int i=0; i<sistema.getListaFisica().size(); i++){
                Contribuinte c = sistema.getListaFisica().get(i);
                listaObjetoEntrada.add(c);
            }
            for (int i=0; i<sistema.getListaJuridica().size(); i++){
                PessoaJuridica pj = sistema.getListaJuridica().get(i);
                listaObjetoEntrada.add(pj);
            }
            oos.writeObject(listaObjetoEntrada);
            oos.close();
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    private static void LeBinario(){
            ArrayList<Object> listaObjetos = new ArrayList();
        try{
            InputStream is = new FileInputStream("ArquivoBinario.txt");
            ObjectInputStream ois = new ObjectInputStream(is);
            listaObjetos = (ArrayList<Object>)ois.readObject();
            ois.close();
            is.close();
            
        }catch(FileNotFoundException e){
            System.out.println("Arquivo nao encontrado!");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
        for(int i=0; i<sistema.getQuantCont(); i++){
            Contribuinte c = (Contribuinte) listaObjetos.get(i);
            sistema.cadastraContribuinte(c);
        }
        for(int j=sistema.getQuantCont(); j<(sistema.getQuantJur()+sistema.getQuantCont()); j++){
            PessoaJuridica pj = (PessoaJuridica) listaObjetos.get(j);
            sistema.cadastraJuridica(pj);
        }
        
    }
    
}
