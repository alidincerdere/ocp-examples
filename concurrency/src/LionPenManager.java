import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManager {
	
	private void removeAnimals() {
		System.out.println("lions removed");
	}
	
	private void cleanPen() {
		System.out.println("Pen is cleaned");
	}
	
	private void addAnimals() {
		System.out.println("lions added");
	}
	
	public void performTasks() {
		removeAnimals();
		cleanPen();
		addAnimals();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService service = null;
		
		try {
			service = Executors.newFixedThreadPool(4);
			
			LionPenManager manager = new LionPenManager();
			
			for (int i= 0; i< 4; i++) {
				service.submit(() -> manager.performTasks());
			}
			
		} finally {
			if(service != null)
				service.shutdown();
		}
		
	}

}
