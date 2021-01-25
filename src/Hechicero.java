
public class Hechicero extends Personaje{
	private String poder;

	public Hechicero() {
		
	}

	public Hechicero(String poder, String name, int vida) {
		super(name, vida);
		this.poder = poder;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	@Override
	public String toString() {
		return "Hechicero [poder=" + poder + ", nombre=" + nombre + ", vida=" + vida + "]";
	}
}
