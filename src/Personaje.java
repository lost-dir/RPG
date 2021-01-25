
public class Personaje {
	
	protected String nombre;
	protected int vida;
	
	public Personaje() {
		
	}

	public Personaje(String nombre, int vida) {
		this.nombre = nombre;
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void atacar(int ataque, Personaje personaje) {
		personaje.setVida(personaje.getVida() - ataque);
		System.out.println(personaje.getNombre()+" pierde: "+ataque);
	}
	
	public void curarse(String metodo, Personaje personaje) {
		int percent = 0;
		switch(metodo) {
			case "pocion":
				percent = 15;
				personaje.setVida(personaje.getVida() + percent);
				System.out.println(personaje.getNombre()+" utiliza "+metodo+" y recupera: "+percent);
			break;
			case "bendaje":
				percent = 5;
				personaje.setVida(personaje.getVida() + percent);
				System.out.println(personaje.getNombre()+" utiliza "+metodo+" y recupera: "+percent);
			break;
		}
	}
}
