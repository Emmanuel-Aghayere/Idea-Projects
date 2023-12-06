package language.Threads;

import java.io.PrintStream;

public class Consumer implements Runnable {
    private Buffer buffer;
    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }
    public void run(){
        while(true){
            String string = this.buffer.remove();
            System.out.println("Took this string: " +string);
            System.out.println("The length of the string is: "+ string.length());
            PrintStream var10000 = System.out;
            StringBuffer var10001 = new StringBuffer(string);
            var10000.println("Reversed string is: "+ var10001.reverse());
            try {
                Thread.sleep(2000L);

            } catch (Exception Var3){
                Var3.printStackTrace();
            }

        }
    }
}
