import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("Server is started");
        ServerSocket ss = new ServerSocket(5065);
        System.out.println("Server is waiting for client request");
        Socket s = ss.accept();
        System.out.println("Client is connected");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();
        System.out.println("Client Data : "+str);
    }
}
