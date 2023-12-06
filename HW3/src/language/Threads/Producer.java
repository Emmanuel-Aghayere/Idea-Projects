package language.Threads;

public class Producer implements Runnable {
    private Buffer buffer;
    public Producer(Buffer buffer){
        this.buffer = buffer;
    }


    public void run() {
        String[] strings = new String[]{"EMMANUEL", "AGHAYERE", "DANIEL", "LAZYTIME", "FRIEDOREOS","HARVARD", "PEANUT", "CHRISTMAS", "HOLIDAY", "COOKIES", "INSY4306", "CYBERSECURITY", "BEEN A SLOW DAY", "LIFE IS LIFE", "THUNDERCAT"};
        for (int i=0; i< strings.length; i++){
            this.buffer.insert(strings[i]);
            try{
                Thread.sleep(400L);

            } catch (Exception var4){
                var4.printStackTrace();
            }
        }

    }
}
