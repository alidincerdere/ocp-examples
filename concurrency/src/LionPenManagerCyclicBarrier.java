import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManagerCyclicBarrier {
	
	private void removeAnimals() {
		System.out.println("lions removed");
	}
	
	private void cleanPen() {
		System.out.println("Pen is cleaned");
	}
	
	private void addAnimals() {
		System.out.println("lions added");
	}
	
	public void performTasks(CyclicBarrier  c1, CyclicBarrier c2) {
		
		try {
			removeAnimals();
			c1.await();
			cleanPen();
			c2.await();
			addAnimals();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService service = null;
		
		try {
			
			service = Executors.newFixedThreadPool(4);
			LionPenManagerCyclicBarrier manager = new LionPenManagerCyclicBarrier();
			
			CyclicBarrier c1 = new CyclicBarrier(4);
			CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("Pen cleaned !"));
			
			for (int i=0; i< 4; i++) {
				service.submit(() -> manager.performTasks(c1, c2));
			}
			
			
		} finally {
			if (service != null) {
				service.shutdown();
			}
		}
		

	}

}
