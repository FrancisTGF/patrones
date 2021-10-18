package resilencia;

import builder.UsuarioBuilder;
import model.Usuario;

public class UsuarioCircuitBreak {

	public static int circuitBreak(int error) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		switch (error) {
		case 0: {
			System.out.println("Open");
			return 0;

		}
		case 1: {
			System.out.println("Half-Open");
			return 1;

		}
		case 2: {
			System.out.println("Closed");
			return 2;
		}
		case 3: {
			System.out.println("Disabled");
			return 3;

		}
		case 4: {
			System.out.println("Forced-Open");
			return 4;
		}
		default: {
			return -1;
		}
		
		}

	}

	public static Usuario circuitBreakAlimentarUsuario(int tipo, Usuario usuario) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		switch (tipo) {
		case 0: {

			return new UsuarioBuilder().build(usuario.getNombre(), usuario.getEmail(), usuario.getTelefono(),
					usuario.getDireccion());

		}
		case 1: {

			return new UsuarioBuilder().build2(usuario.getNombre(), usuario.getEmail(), usuario.getTelefono());

		}
		case 2: {
			
			return usuario = null ;
		}
		case 3: {
			return new UsuarioBuilder().build4();

		}
		case 4: {
			return new UsuarioBuilder().build5();
		}
		default: {

		}
			return null;

		}
	}

}
