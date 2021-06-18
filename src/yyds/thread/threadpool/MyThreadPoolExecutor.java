package yyds.thread.threadpool;

import java.util.concurrent.*;

public class MyThreadPoolExecutor {

    public static void main(String[] args) {
        BlockingQueue<Runnable> runnables = new MyBlockingQueue();
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(10, 15, 20,TimeUnit.MILLISECONDS,runnables);
        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {

            }
        });

        Future<?> submit = poolExecutor.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
        try {
            Object s = submit.get(20,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }


    }
}
