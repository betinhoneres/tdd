package desafio;

public class Cliente {

	public Cliente(String nome, Estado estado){
		this.nome = nome;
		this.estado = estado;
	}
	
	private String nome;
	private Estado estado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}