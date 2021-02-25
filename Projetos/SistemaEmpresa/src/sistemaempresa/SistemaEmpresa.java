package sistemaempresa;

import java.util.Scanner;

public class SistemaEmpresa {

    public static void main(String[] args) {
        int condicao=0;
        int contfunc=0, contcargo=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de empresas do Grande Gilson!");
        System.out.println("Para começar, selecione uma opção:\n");
        Empresa empresa = new Empresa(0,0);
        do{
            System.out.print("1: Cadastrar uma empresa.\n");
            System.out.print("2: Cadastrar endereço da empresa.\n");
            System.out.print("3: Cadastrar endereço do funcionário.\n");
            System.out.print("4: Cadastrar funcionário da empresa.\n");
            System.out.print("5: Cadastrar cargo da Empresa.\n");
            System.out.print("6: Definir cargo do Funcionário.\n");
            System.out.print("7: Mostrar salário líquido do funcionário.\n");
            System.out.print("8: Mostrar salário bruto do funcionário.\n");
            System.out.print("9: Mostrar os descontos do salário do funcionário.\n");
            System.out.print("10: Mostrar valor das horas extras do funcionario.\n");
            System.out.print("11: Mostrar valor dos benefícios do funcionário.\n");
            System.out.print("Digite -1 para sair do programa.\n");
            condicao = in.nextInt();
            switch(condicao){
                
                case 1:{
                    in.nextLine();
                    System.out.println("Digite o nome da empresa:");
                    empresa.setNome(in.nextLine());
                    System.out.println("///////////////////////////////");
                    System.out.println("Empresa registrada com sucesso!");
                    System.out.println("///////////////////////////////");
                    break;
                }
                
                case 2:{
                    
                    System.out.println("Digite a rua da empresa: ");
                    empresa.getEndereço().setRua(in.nextLine());
                    System.out.println("Digite o numero da empresa: ");
                    empresa.getEndereço().setNumero(in.nextInt());
                    System.out.println("Digite o bairro da empresa: ");
                    empresa.getEndereço().setBairro(in.nextLine());
                    System.out.println("Digite a cidade da empresa: ");
                    empresa.getEndereço().setCidade(in.nextLine());
                    System.out.println("Digite o estado da empresa: ");
                    empresa.getEndereço().setEstado(in.nextLine());
                    System.out.println("Digite o CEP da empresa: ");
                    empresa.getEndereço().setCep(in.nextInt());
                    break;
                }
                
                case 3:{
                    int opcaoendereco;
                    System.out.println("Qual funcionario você gostaria de modificar?");
                    for (int i=0; i < contfunc; i++){
                        System.out.println("Funcionario "+i+": "+empresa.getFuncionario(i).getNome());    
                    }
                    opcaoendereco = in.nextInt();
                    System.out.println("Digite a rua do funcionario: ");
                    empresa.getFuncionario(opcaoendereco).getEndereço().setRua(in.nextLine());
                    in.nextLine();
                    System.out.println("Digite o numero do funcionario: ");
                    empresa.getFuncionario(opcaoendereco).getEndereço().setNumero(in.nextInt());
                    in.nextLine();
                    System.out.println("Digite o bairro do funcionario: ");
                    empresa.getFuncionario(opcaoendereco).getEndereço().setBairro(in.nextLine());
                    in.nextLine();
                    System.out.println("Digite a cidade do funcionario: ");
                    empresa.getFuncionario(opcaoendereco).getEndereço().setCidade(in.nextLine());
                    in.nextLine();
                    System.out.println("Digite o estado do funcionario: ");
                    empresa.getFuncionario(opcaoendereco).getEndereço().setEstado(in.nextLine());
                    in.nextLine();
                    System.out.println("Digite o CEP do funcionario: ");
                    empresa.getFuncionario(opcaoendereco).getEndereço().setCep(in.nextInt());
                    in.nextLine();
                    break;
                }
                
                case 4:{
                    Funcionario[] funcionarios;
                    funcionarios = new Funcionario[contfunc];
                    System.out.println("Qual é o nome do funcionario "+(contfunc+1)+" ?");
                    in.nextLine();
                    empresa.addFuncionario(funcionarios[contfunc+1]);
                    empresa.getFuncionario(contfunc).setNome(in.nextLine());
                    System.out.println("Qual é a rua, bairro, cidade e estado do funcionario? ");
                    empresa.getFuncionario(contfunc).getEndereço().setRua(in.nextLine());
                    in.nextLine();
                    empresa.getFuncionario(contfunc).getEndereço().setBairro(in.nextLine());
                    in.nextLine();
                    empresa.getFuncionario(contfunc).getEndereço().setCidade(in.nextLine());
                    in.nextLine();
                    empresa.getFuncionario(contfunc).getEndereço().setEstado(in.nextLine());
                    in.nextLine();
                    System.out.println("Qual é o numero e CEP do funcionario? ");
                    empresa.getFuncionario(contfunc).getEndereço().setNumero(in.nextInt());
                    in.nextLine();
                    empresa.getFuncionario(contfunc).getEndereço().setCep(in.nextInt());
                    in.nextLine();
                    System.out.println("Por fim, qual é o número de filhos e de horas extras do funcionario "+contfunc+" ?");
                    empresa.getFuncionario(contfunc).setCargo().setValFilho(in.nextFloat());
                    empresa.getFuncionario(contfunc).setCargo().setValExtra(in.nextFloat());
                    contfunc++;
                    break;
                }
                
                case 5:{
                    Cargo[] cargos;
                    cargos = new Cargo[contcargo];
                    empresa.addCargo(cargos[contcargo]);                   
                    System.out.println("Qual é o nome do cargo?");
                    empresa.getCargo(contcargo).setDescricao(in.nextLine());
                    in.nextLine();
                    System.out.println("Qual é o salário base?");
                    empresa.getCargo(contcargo).setSalarioBase(in.nextInt());
                    System.out.println("Qual é o valor da hora extra e valor por filho?");
                    empresa.getCargo(contcargo).setValExtra(in.nextInt());
                    in.nextLine();
                    empresa.getCargo(contcargo).setValFilho(in.nextInt());
                    contcargo++;
                    break;
                }
                
                case 6:{
                    int opcao,opcao2;
                    System.out.println("Qual funcionario você gostaria de modificar?");
                    for (int i=0; i < contfunc; i++){
                        System.out.println("Funcionario "+i+": "+empresa.getFuncionario(i).getNome());    
                    }
                    
                    opcao = in.nextInt();
                    System.out.println("Qual cargo você gostaria de atribuir ao funcionario "+opcao+"?");
                    for (int i=0; i < contcargo; i++){
                        System.out.println("Cargo "+i+": "+empresa.getCargo(i).getDescricao());
                    }
                    opcao2 = in.nextInt();
                    empresa.getFuncionario(opcao).setCargo().setDescricao(empresa.getCargo(opcao2).getDescricao());
                    break;
                }
                
                case 7:{
                    int opcaosalario;
                    System.out.println("Gostaria de verificar o salário líquido de qual funcionario?");
                    for (int i=0; i < contfunc; i++){
                        System.out.println("Funcionario "+i+": "+empresa.getFuncionario(i).getNome());    
                    }
                    opcaosalario = in.nextInt();
                    System.out.println("O salario líquido do funcionario "+opcaosalario+ " é de: "+empresa.getFuncionario(opcaosalario).getSalarioLiquido());
                    break;
                }
                
                case 8:{
                    int opcaobruto;
                    System.out.println("Gostaria de verificar o salário bruto de qual funcionario?");
                    for (int i=0; i < contfunc; i++){
                        System.out.println("Funcionario "+i+": "+empresa.getFuncionario(i).getNome());    
                    }
                    opcaobruto = in.nextInt();
                    System.out.println("O salario bruto do funcionario"+opcaobruto+" é de: "+empresa.getFuncionario(opcaobruto).getSalarioBruto());
                    break;
                }
                
                case 9:{
                    int opcaodescontos;
                    System.out.println("Gostaria de verificar os descontos de qual funcionario?");
                    for (int i=0; i < contfunc; i++){
                        System.out.println("Funcionario "+i+": "+empresa.getFuncionario(i).getNome());    
                    }
                    opcaodescontos = in.nextInt();
                    System.out.println("Os descontos do funcionario "+opcaodescontos+" são de: "+empresa.getFuncionario(opcaodescontos).getDescontos());
                    break;
                }
                
                case 10:{
                    int opcaohoraextra;
                    System.out.println("Gostaria de verificar as horas extras de qual funcionario?");
                    for (int i=0; i < contfunc; i++){
                        System.out.println("Funcionario "+i+": "+empresa.getFuncionario(i).getNome());    
                    }
                    opcaohoraextra = in.nextInt();
                    System.out.println("O valor das horas extras do funcionario "+opcaohoraextra+" é de: "+empresa.getFuncionario(opcaohoraextra).getHorasExtras());
                    break;
                }
                case 11:{
                    int opcaobeneficios;
                    System.out.println("Gostaria de verificar os beneficios de qual funcionario?");
                    for (int i=0; i < contfunc; i++){
                        System.out.println("Funcionario "+i+": "+empresa.getFuncionario(i).getNome());    
                    }
                    opcaobeneficios = in.nextInt();
                    System.out.println("Os benefícios do funcionario "+opcaobeneficios+" são de: "+empresa.getFuncionario(opcaobeneficios).getAcrescimos());
                    break;
                }
                
            }
            
            
        }while (condicao!= -1);
    
    
    
    }
    
}
