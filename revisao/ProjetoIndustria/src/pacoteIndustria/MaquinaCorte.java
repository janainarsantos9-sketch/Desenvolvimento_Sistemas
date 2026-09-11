package pacoteIndustria;

public class MaquinaCorte extends Maquina {
	private String tipoCorte;

	public String tipoCorte() {
		return tipoCorte;
	}

	public void setTipoCorte(String tipoCorte) {
		if (tipoCorte != null && !tipoCorte.trim().isEmpty()) {

		} else {
			System.out.println("Tipo do corte invalido.");

		}

	}

	public void exibirDados() {
		super.exibirDados();
		System.out.println("Tipo do corte:" + tipoCorte);
	}
}
