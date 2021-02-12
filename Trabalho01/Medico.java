package Dados;



public class Medico {
	 private String cpf,nome,cidade,spec;
	 private int idade,codigo;


	    public Medico() {
	    }
	    
	    
	    //Getter e setters //
	    public String getSpec() {
	    	return spec;
	    }


	    public int getCodigo() {
			return codigo;
		}


		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}


		public void setSpec(String spec) {
	    	this.spec = spec;
	    }
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

	    public String getCidade() {
	        return cidade;
	    }

	    public void setCidade(String cidade) {
	        this.cidade = cidade;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }
}
	    
