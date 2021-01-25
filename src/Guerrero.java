
public class Guerrero extends Personaje{
	private int espada;
	private int armadura;
	
	public Guerrero() {
	
	}

	public Guerrero(int espada, int armadura, String name, int vida) {
		super(name, vida);
		this.espada = espada;
		this.armadura = armadura;
	}

	public int getEspada() {
		return espada;
	}

	public void setEspada(int espada) {
		this.espada = espada;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	@Override
	public String toString() {
		return "Guerrero [espada=" + espada + ", armadura=" + armadura + ", nombre=" + nombre + ", vida=" + vida + "]";
	}
}
