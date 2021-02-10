import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class AddData {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService service = null;
	
		try {
			service = Executors.newSingleThreadExecutor();
			Future<Integer> result = service.submit(()->30+11);
			//since callable supports a return type when used with executor service
			//it is often preferred over Runnable when using Concurrency API

			//Callable return generic type
			//Runnable returns void
			//Callable can throw checked exception
			//Runnable does not throw
			System.out.println(result.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (service != null) service.shutdown();
		}
		
		if (service != null) {
			service.awaitTermination(1, TimeUnit.MINUTES);
		}
		if (service.isTerminated()) {
			
			System.out.println("all tasks are finished");
		} else {
			System.out.println("at least one task still running");
		}
	}

}
