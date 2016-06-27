import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);// Creating fixed size thread pool of 5 worker threads.
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("Job " + i);
            executor.execute(worker); //submitting 10 jobs to this pool. 
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
//since the pool size is 5, it will start working on 5 jobs and other jobs will be in wait state, 
//as soon as one of the job is finished, another job from the wait queue will be picked up by worker thread and get's executed.