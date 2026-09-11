package redeSocial;

public class App {

	public static void main(String[] args) {
	
		Usuario usuario1 = new Usuario();
		
		usuario1.setNome("Pedro");
		usuario1.setIdade(20);
		usuario1.setCidade("valenca");
		
		usuario1.mostrarPerfil();
		
		Usuario usuario2 = new Usuario();
		
		usuario2.setNome("Simone");
		usuario2.setIdade(35);
		usuario2.setCidade("Valenca");
		
		
	    usuario2.mostrarPerfil();
	    
	    Postagem post1 = new Postagem();
	    
	    post1.setTexto("estudando java hoje");
	    post1.setCurtidas(15);
	    post1.setAutor("Ana");
	    
	    post1.mostrarPostagem();

	}

}
