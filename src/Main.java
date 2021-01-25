
public class Main {

	public static void main(String[] args) {
		Personaje hechicero;
		Personaje guerrero;
		
		System.out.println("Inicia el duelo!");
		hechicero = new Hechicero("Tormenta eléctrica", "Merlín", 100);
		guerrero = new Guerrero(15, 30, "Lancelot", 70);
		//statistics
		System.out.println(hechicero);
		System.out.println(guerrero);
		
		System.out.println("Primer movimiento...");
		hechicero.atacar(20, guerrero);
		//statistics
		System.out.println(hechicero);
		System.out.println(guerrero);
		
		System.out.println("Segundo movimiento...");
		guerrero.atacar(40, hechicero);
		//statistics
		System.out.println(hechicero);
		System.out.println(guerrero);
		
		System.out.println("Intermedio");
		hechicero.curarse("pocion", hechicero);
		guerrero.curarse("bendaje", guerrero);
		//statistics
		System.out.println(hechicero);
		System.out.println(guerrero);
	}
}
