package language.Threads;
import java.net.*;
import java.io.*;
public class Main {

        Socket socket = null;
        DataInputStream input = null;
        DataOutputStream out = null;
        public void Client(String address, int port){
            try{
                socket = new Socket(address,port);
                System.out.println("connected");
                input = new DataInputStream(System.in);
                out = new DataOutputStream(socket.getOutputStream());
            }
            catch(UnknownHostException u){
                System.out.println(u);
            }
            catch (IOException i){
                System.out.println(i);
            }
            try{
                input.close();
                out.close();
                socket.close();
            }
            catch (IOException i){
                System.out.println(i);
            }


        }
        public static void main(String args[]){
            Client main = new main("127.0.0.1", 5000)
        }

}
