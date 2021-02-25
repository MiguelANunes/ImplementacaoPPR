package principal;

import java.util.Scanner;


public class Principal {

    private static Turma turma = new Turma(5);
    
    public static void main(String[] args) {
        int opcao=0;
        Scanner in = new Scanner(System.in);
        
       while (opcao!= -1){
           
           System.out.println("Cadastre um aluno;");
           
           switch(opcao){
               
               case 1:{
                   CadastraAluno();
                   System.out.println("Cadastro concluido!");
                   break;
               }
               
           }
           
       }
        


    }
    
    
    public static void CadastraAluno(){
        Scanner in = new Scanner(System.in);
        Aluno a = new Aluno();
        System.out.println("Qual o nome do aluno? ");
        a.setNome(in.nextLine());
        in.nextLine();
        System.out.println("Qual são as 4 notas do aluno?");
        float[] vetornotas = new float[4];
        for (int i=0; i<4; i++){
            vetornotas[i] = in.nextInt();
        }
        a.setNotas(vetornotas);
        
    }
    
}
