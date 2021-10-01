import java.security.SecureRandom;

public class ImpresorTareas implements Runnable {
	
	private static final SecureRandom generador = new SecureRandom();
	private static int sleepTime;
	private final String nombreTarea;
	
	
	public ImpresorTareas(String nombreTarea) {
		this.nombreTarea = nombreTarea;
		
		sleepTime = generador.nextInt(5000);
	}
	

	@Override
	public void run() {
		
		try {
			System.out.printf("%s se fue a dormir %d milisegundos %n%n", this.nombreTarea, sleepTime);
			Thread.sleep(sleepTime);
		}catch (InterruptedException exception) {
			exception.printStackTrace();
			Thread.currentThread().interrupt();
		}
		// TODO Auto-generated method stub
		
	}

}
