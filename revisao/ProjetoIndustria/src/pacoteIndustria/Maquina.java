package pacoteIndustria;

public class Maquina {
	private String nome;
	private int setor;
	private String status;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSetor() {
		return setor;
	}

	public void setSetor(int setor) {
		this.setor = setor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void exibirDados() {
		System.out.println("nome:" + getNome());
		System.out.println("setor:" + getSetor());
		System.out.println("status:"+ getStatus());
		
		
	}
}
