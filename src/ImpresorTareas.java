import java.security.SecureRandom;

public class ImpresorTareas implements Runnable {
	
	private static final SecureRandom generador = new SecureRandom();
	private final int sleepTime;
	private final String nombreTarea;

	
	public ImpresorTareas(String nombreTarea) {
		this.nombreTarea = nombreTarea;
		
		sleepTime = generador.nextInt(5000);
		//El 5000 es el límite de tiempo que precisa el sleeptime
	}
	
	@Override
	public void run() {
		try {
			System.out.printf("%s se fue a dormir %d milisegundos%n%n", this.nombreTarea, sleepTime);
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		

	}

}