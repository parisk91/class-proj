package gr.aueb.cl.sock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class DateTimeCli {

    public static void main(String[] args) {
        Socket socket = null;
        StringBuilder sb = new StringBuilder();

        try {
            InetAddress servAddress = InetAddress.getByName("time.nist.gov");
            int servPort = 13;

            socket = new Socket(servAddress, servPort);

            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = "";
            while ((line = bf.readLine()) != null) {
                sb.append(line).append("\n");//προσθέτουμε ένα κενό επειδή ο br δενν το αποδίδει
            }
            System.out.println("DateTime Server says: " + sb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}