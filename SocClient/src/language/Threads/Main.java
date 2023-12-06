package language.Threads;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws Exception {
        String ip ="localhost";
        int port = 5065;
        Socket s = new Socket(ip,port);

        String str = "Navin Reddy";
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        out.write(str);
        os.flush();
	// write your code here
    }
}
