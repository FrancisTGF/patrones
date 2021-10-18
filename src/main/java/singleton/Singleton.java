package singleton;

public class Singleton {
	private String nombre;
	private static Singleton soyUnico;
	public Singleton(String nombre) {
		this.nombre = nombre;
	}

	public static Singleton getSingletonInstance(String nombre) {
		if(soyUnico == null) 
			soyUnico= new Singleton(nombre);
			
		else
			System.out.println("No se puede crear" + nombre);
		
		return soyUnico;
	}

	@Override
	public String toString() {
		return "Singleton [nombre=" + nombre + "]";
	}
}
