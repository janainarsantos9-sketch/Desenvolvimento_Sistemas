package redeSocial;

public class Usuario {
	private String nome;
	private int idade;
	private String cidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void mostrarPerfil() {
		System.out.println("nome:"+getNome());
		System.out.println("idade:"+getIdade());
		System.out.println("cidade:"+getCidade());
		
		
	}

}
