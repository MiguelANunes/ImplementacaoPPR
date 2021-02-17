package obj1;

import java.util.Scanner;

public class Obj1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantAlunos;
        Turma turma;
        
        System.out.println("Digite a quantidade de Alunos: ");
        quantAlunos = in.nextInt();
        turma = new Turma(quantAlunos);
        
        for (int i=0; i<quantAlunos; i++){
            Estudante est = new Estudante(4);
            System.out.print("\nDigite o nome do Aluno " +(i+1)+":");
            est.setNome(in.nextLine());
            in.nextLine();
            for (int j=0; j < 4; j++){
                System.out.print("\nDigite a nota "+(j+1)+" do aluno "+(i+1)+":");
                est.setNota(j, in.nextFloat());
            }
            turma.addEstudante(est);
        }
        
        for (int i=0; i<quantAlunos; i++){
            System.out.println("A media do aluno "+(i+1)+" é "+turma.getEstudante(i).getMedia());
        }
        System.out.println("A media da turma é: "+turma.getMedia());
        
    }
}
