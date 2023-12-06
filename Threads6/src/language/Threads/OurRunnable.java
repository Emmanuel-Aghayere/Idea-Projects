package language.Threads;
import static language.Threads.ThreadColor.ANSI_GREEN;

public class OurRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_GREEN+"Hello from ourRunnable's implementation");
    }
}
