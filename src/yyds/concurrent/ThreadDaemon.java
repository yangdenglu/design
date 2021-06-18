package yyds.concurrent;

import java.util.concurrent.TimeUnit;

public class ThreadDaemon {
    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(),"daemon-runner");
        thread.setDaemon(true);
        thread.start();
    }
    static class DaemonRunner implements Runnable{

        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("daemon-runner finally run .");
            }
        }
    }
}
