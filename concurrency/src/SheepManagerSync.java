import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManagerSync {

	private AtomicInteger sheepCount = new AtomicInteger(0);

	private void incrementAndReport() {
		synchronized (this) {
			System.out.print(sheepCount.incrementAndGet() + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = null;

		try {
			service = Executors.newFixedThreadPool(20);

			SheepManagerSync manager = new SheepManagerSync();

			for (int i = 0; i < 10; i++) {
				service.submit(() -> manager.incrementAndReport());
			}

		} finally {
			if (service != null)
				service.shutdown();
		}

	}

}
