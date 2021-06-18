package yyds.thread.producterandconsumer;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;

/*
    生产者和消费者问题是线程模型中的经典问题：
        生产者和消费者在同一时间段内共用同一个存储空间，如下图所示，生产者向空间里存放数据，而消费者取用数据，如果不加以协调可能会出现以下情况：
            存储空间已满，而生产者占用着它，消费者等着生产者让出空间从而去除产品，生产者等着消费者消费产品，从而向空间中添加产品。互相等待，从而发生死锁。




 */
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        String s = new String("1");
        StringBuffer stringBuffer = new StringBuffer("1");
        StringBuilder stringBuilder = new StringBuilder("1");

        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedReader pipedReader = new PipedReader();
        PipedWriter pipedWriter = new PipedWriter();
    }
}
