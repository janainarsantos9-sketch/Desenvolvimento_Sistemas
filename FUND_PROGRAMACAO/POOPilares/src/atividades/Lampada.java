package atividades;

public class Lampada {
	private String marca;
	private double preco;
	private boolean ligada;
	
	

	public Lampada(String marca, double preco, boolean ligada) {
		super();
		this.marca = marca;
		this.preco = preco;
		this.ligada = ligada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	void acenderLampda() {
		this.ligada = true;
		System.out.println("Se a lampada ligada");
	}

	void desligarLampada(Lampada lampada) {
		this.ligada = false;
		System.out.println("Se a lampada ligada");
	}
	public void exibirMostrarEstado() {
	    System.out.println("Marca:" + getMarca());
        System.out.println("Preco:" + getPreco());
        System.out.println("Ligada:" + isLigada());
    }
 }