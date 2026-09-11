package redeSocial;

public class Postagem {
	
	private String texto;
	private int curtidas;
	private String autor;
	
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void mostrarPostagem() {
		System.out.println("texto:" + getTexto());
		System.out.println("curtidas:"+ getCurtidas());
		System.out.println("autor:"+ getAutor());
	}

}
