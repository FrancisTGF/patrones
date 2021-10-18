package resilencia;

public class UsuarioCircuitBreak {

	public static String circuitBreak(int error) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		switch (error) {
		case 0: {
			
			return "Open";

		}
		case 1: {
			return "Half-Open";
			
		}
		case 2: {
			return "Closed";
		}
		default : {
			
		}
		return null;

		}

		
	}

}
