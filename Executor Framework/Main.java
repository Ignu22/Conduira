import java.util.concurrent.*;
public class Main{
    public static void main (String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        Runnable processor = new Message();
        executor.execute(processor);
        
        
        executor.shutdown();
    }
}