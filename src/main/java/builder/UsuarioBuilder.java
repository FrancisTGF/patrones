package builder;

import model.Usuario;

public class UsuarioBuilder {

	public Usuario build(String nombre, String email, String telefono, String direccion) {
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setEmail(email);
		usuario.setTelefono(telefono);
		usuario.setDireccion(direccion);
		return usuario;
	}

}
