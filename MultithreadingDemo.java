import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadingDemo {
    public static void main(String[] args){
        Runnable objRunnable = () ->{
            System.out.println("Thread is running");
        };
        Thread objThread = new Thread(objRunnable,"runnableThread");

        objThread.start();
        System.out.println(objThread.getName());

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0;i<6;i++){
            int taskId = i;
            executorService.submit(()->{
                System.out.println("Execting task - "+taskId+" by"+Thread.currentThread().getName());
            });
        }

    }
}
