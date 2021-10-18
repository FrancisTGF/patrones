package resilencia;

public class UsuarioRetry {

	public static boolean retry(int error) {

		for (int i = 0; i < 3; i++) {

			if (i < 2 && error == 0) {
				try {
					System.out.println("No se conecta");

					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Problema en el try");
				}
				continue;
			} else if(error != 0){
				return false;
			}
			
			else {
				return true;

			}

		}

		return false;

	}

}