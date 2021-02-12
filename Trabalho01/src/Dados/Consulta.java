package Dados;

public class Consulta {
	private String data,hora,valor,diagnostico;
	
	private Medico medico;
	private Paciente paciente;
	private int codigo;
	public Consulta(){
		
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public int getAtendente() {
		return medico.getCodigo();
	}
	public void setAtendente(Medico medico) {
		this.medico = medico;
	}
	public int getPaciente() {
		return paciente.getCodigo();
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
