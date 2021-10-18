package singleton;

public class UsuarioSingleton {
	private String email;
	private String nombre;
	private String telefono;
	private String direccion;
	private static UsuarioSingleton usuarioUnico;

	public static UsuarioSingleton getUsuarioInstance(String nombre, String email, String telefono, String direccion) {
		if(usuarioUnico == null) {
			usuarioUnico = new UsuarioSingleton();
			usuarioUnico.setNombre(nombre);
			usuarioUnico.setEmail(email);
			usuarioUnico.setTelefono(telefono);
			usuarioUnico.setDireccion(direccion);
			
			}
			
		else
			System.out.println("No se puede crear" + nombre);
		
		return usuarioUnico;
	}
	//Privatizamos el acceso al constructor
	private UsuarioSingleton() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Usuario singleton [email=" + email + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion
				+ "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
