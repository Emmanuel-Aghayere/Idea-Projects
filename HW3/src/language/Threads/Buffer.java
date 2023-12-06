package language.Threads;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {
    private LinkedList<String> buffer = new LinkedList();
    private int size = 15;
    private Lock locked = new ReentrantLock();
    private Condition notFull;
    private Condition notEmpty;

    public Buffer(){
        this.notFull = this.locked.newCondition();
        this.notEmpty = this.locked.newCondition();
    }
    public void insert(String string){
        this.locked.lock();
        try{
            while(this.buffer.size() == this.size){
                System.out.println("Producer adds: "+string+ " Buffer is full, so we wait");
                this.notFull.await();
            }
            this.buffer.offer(string);
            this.notEmpty.signalAll();
            System.out.println("Producer has added " + string);

        } catch(Exception var6){
            var6.printStackTrace();
        } finally {
            this.locked.unlock();
        }
    }
    public String remove(){
        String string = null;
        this.locked.lock();
        try{
            while (this.buffer.size() == 0){
                System.out.println("Consumer is trying to consume, but buffer is empty, waiting");
                this.notEmpty.await();
            }
            string = (String)this.buffer.poll();
            this.notFull.signalAll();
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            this.locked.unlock();
            return string;
        }
    }


}
