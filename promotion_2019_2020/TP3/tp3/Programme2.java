package tp3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Programme2 {
    public static void main(String[] args) {
        try{
            DatagramSocket socket;
            InetAddress adresseDestination;
            int port;
            int portDestination;
            adresseDestination = InetAddress.getByName("localhost");
            port = 2001;
            portDestination = 2000;

            //Création de la socket
            socket = new DatagramSocket(port);
            
            //Création de l'objet message
            String message = new String("ceci est mon message");

            //Sérialisation de l'objet
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(outputStream);
            os.writeObject(message);
            byte[] data = outputStream.toByteArray();

            //Création du paquet
            DatagramPacket paquet = new DatagramPacket(data, data.length, adresseDestination, portDestination);

            //Envoi de l'objet par la socket
            socket.send(paquet);
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}