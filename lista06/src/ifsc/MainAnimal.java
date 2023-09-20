package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		Gato viralata = new Gato();
		viralata.setNome("Mia");
		viralata.setRaca("Vira lata");
		viralata.setEcossistema("Casa");
		viralata.setComprimento(4f);
		viralata.setNumeroPatas(4);
		viralata.mia();
		viralata.caminha();

		Cachorro caramelo = new Cachorro();
		caramelo.setNome("Mia");
		caramelo.setRaca("Vira lata");
		caramelo.setEcossistema("Casa");
		caramelo.setComprimento(4f);
		caramelo.setNumeroPatas(4);
		caramelo.late();
		caramelo.caminha();

	}

}
