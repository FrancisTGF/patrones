package resilencia;

public class UsuarioRetry {

	public static boolean retry() {

		for (int i = 0; i < 3; i++) {

			if (i < 2) {
				try {
					System.out.println("No se conecta");

					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Problema en el try");
				}
				continue;
			} else {
				return true;

			}

		}

		return false;

	}

}