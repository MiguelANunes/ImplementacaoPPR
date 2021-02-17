package resultante;

import java.util.Scanner;

public class Resultante {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhas=3, colunas=2;
        int matriz1[][] = new int[linhas][colunas];
        int matriz2[][] = new int[linhas][colunas];
        int matrizresultante[][] = new int[linhas][colunas];
        System.out.println("Entre com valores para uma matriz 3x2:");
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                matriz1[i][j] = in.nextInt();
            }
        }
        
        System.out.println("Agora entre com valores para outra matriz 3x2:");
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                matriz2[i][j] = in.nextInt();
            }
        }
        
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                if (i<=j)
                    matrizresultante[i][j] = matriz1[i][j];
                else
                    matrizresultante[i][j] = matriz2[i][j];
            }
        }
        
        System.out.println("A matriz de entrada é:");
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                System.out.print(matrizresultante[i][j]+" ");
            }
            System.out.println(" ");
        }        
    }
}
