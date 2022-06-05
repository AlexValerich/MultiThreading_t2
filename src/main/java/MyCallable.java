import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    static int count = 0;
    @Override
    public Integer call() throws Exception {

        try {
            System.out.println("Всем привет! Я поток " + Thread.currentThread().getName());
            Thread.sleep(1000);
            count++;
        } catch (
                InterruptedException err) {

        }
        finally {
            System.out.println("поток " + Thread.currentThread().getName() + "завершен");
            count++;
        }
        return count;
    }
}





