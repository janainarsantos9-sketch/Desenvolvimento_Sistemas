package industria;

public class App {

	public static void main(String[] args) {
		MaquinaCorte maquinaCorte = new MaquinaCorte();
		
		maquinaCorte.setNome("Cortadora CNC 01");
		maquinaCorte.setSetor("Corte");
		maquinaCorte.setStatus("Em operacao");
		maquinaCorte.setTipoCorte("Laser");
		
		MaquinaSolda maquinaSolda = new MaquinaSolda();

		maquinaSolda.setNome("Soldadora MiG 02");
		maquinaSolda.setSetor("Soldagem");
		maquinaSolda.setStatus("Disponivel");
		maquinaSolda.setSolda("MIG");

	}

}
