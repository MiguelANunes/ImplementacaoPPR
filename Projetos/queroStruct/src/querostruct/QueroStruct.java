package querostruct;

import java.util.Scanner;


public class QueroStruct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Estudante[] lista = new Estudante[10];
        
        for (int i=0; i<lista.length; i++){
            in.nextLine();
            lista[i] = new Estudante();
            System.out.print("Informe o nome do estudante: ");
            lista[i].nome = in.nextLine();
            for (int j=0; j<4; j++){
                System.out.print("Informe a nota " +j+ " do estudante "+lista[i].nome+": ");
                lista[i].notas[j] = in.nextFloat();
                lista[i].media = lista[i].media + lista[i].notas[j];
            }
            lista[i].media = lista[i].media/4;
        }
            // sort em ordem crescente
            Estudante aux;
            for (int i=0; i<lista.length-1; i++){
                if (lista[i].media > lista[i+1].media){
                    aux = lista[i+1];
                    lista[i+1] = lista[i];
                    lista[i] = aux;
                }
            }
        System.out.println("Os alunos são, em ordem:");
        for (int i=0; i<lista.length; i++){
            System.out.println(lista[i].nome);
            System.out.println("nome: " +lista[i].nome+ " média: "+lista[i].media);
        }
    }
    
}
