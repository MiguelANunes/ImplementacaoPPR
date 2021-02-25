import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Principal {
	private static Scanner sc = new Scanner(System.in);
	private static Turma turma = new Turma();
	
	public static void main(String[] args)  {

		int opcao = -1;
		
		while (opcao != 0) {
		
			System.out.println("Sistema de Gerenciamento da Turma");
			System.out.println("1 - Cadastro Estudante");
			System.out.println("2 - Le Estudantes do Arquivo Texto");
			System.out.println("3 - Escreve Estudandes no Arquivo Texto");
			System.out.println("4 - Lista Estudantes");
			System.out.println("5 - Le Estudantes do Arquivo Bin�rio");
			System.out.println("6 - Escreve Estudandes no Arquivo Bin�rio");
			System.out.println("0 - Para sair");
			System.out.print("Digite a op��o desejada:");
			opcao = Integer.parseInt(sc.nextLine());
			
			switch (opcao) {
			case 1:
					cadastrarEstudante();
				break;
			case 2:
				leArquivoTexto();
                            break;
			case 3:
				escreverArquivoTexto();
                            break;
			case 4:
				listaEstudantes();
                            break;
			case 5:
				leArquivoBinario();
                            break;
			case 6:
				escreverArquivoBinario();
                            break;
	
			default:
        			break;
			}
		}

	}

	private static void leArquivoBinario() {
		
		try {
			InputStream os = new FileInputStream("arquivoBinario.txt");
			ObjectInputStream oos = new ObjectInputStream(os);
			while(true) {
				Estudante e = new Estudante();
				e = (Estudante) oos.readObject();
				turma.cadastraEstudante(e);
			}
			
		} catch (EOFException ex) {

        }catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
	}

	private static void escreverArquivoBinario() {
		
		try {
			OutputStream os = new FileOutputStream("arquivoBinario.txt");
			ObjectOutputStream oos = new ObjectOutputStream(os);
			for (int i = 0; i < turma.getQuantEstudantes(); i++) {
				Estudante e = turma.getEstudante(i);
				oos.writeObject(e);
			}
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	private static void listaEstudantes() {
		System.out.println("\nLista de estudantes da turma");
		for (int i = 0; i < turma.getQuantEstudantes(); i++) {
			Estudante e = turma.getEstudante(i);
			System.out.println("Estudante "+(i+1)+" "+ e.getNome()+", M�dia: "+e.getMedia());
		}
		System.out.println("\n");
	}

	private static void leArquivoTexto() {
		int quantEstudantes = 0;
		
		try {
			InputStream is = new FileInputStream("arquivo.txt");
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			quantEstudantes = Integer.parseInt(br.readLine());
			for (int i = 0; i < quantEstudantes; i++) {
				Estudante e = new Estudante();
				e.setNome(br.readLine());
				for (int j = 0; j < 4; j++) {
					e.setNota(j, Float.parseFloat(br.readLine()));
				}
				turma.cadastraEstudante(e);
			}
			br.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	private static void escreverArquivoTexto() {
		try {
			OutputStream os = new FileOutputStream("arquivo.txt");
			OutputStreamWriter w = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(w);
			bw.write(String.valueOf(turma.getQuantEstudantes())+'\n');
			for (int i = 0; i < turma.getQuantEstudantes(); i++) {
				Estudante e = turma.getEstudante(i);
				bw.write(e.getNome()+'\n');
				float[] notas = e.getNotas();
				for (int j=0; j<4; j++) {
					bw.write(String.valueOf(notas[j])+'\n');
				}
			}
			bw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	private static void cadastrarEstudante() {
		Estudante e = new Estudante();
		System.out.println("Digite o nome do Estudante");
		e.setNome(sc.nextLine());
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite a nota "+(i+1)+": ");
			e.setNota(i, Float.parseFloat(sc.nextLine()));
		}
		turma.cadastraEstudante(e);
	}
	
	

}
