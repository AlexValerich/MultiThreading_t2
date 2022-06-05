import java.util.concurrent.*;

public class Main {
    static final int taskNuber = 8;
    static final int numberTheards = 4;
    static int resultOfTask = 0;
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        final ExecutorService threadPool = Executors.newFixedThreadPool(numberTheards);
        Future<Integer> task;
        for (int i =0; i<taskNuber; i++) {
            Callable<Integer> myCallable = new MyCallable();
             task = threadPool.submit(myCallable);
            resultOfTask = task.get();
        }

        System.out.println("всего строк напечатано " + resultOfTask);

              threadPool.shutdown();
        System.out.println("¬се потоки завершены");
    }
}

