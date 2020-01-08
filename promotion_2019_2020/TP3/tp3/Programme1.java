package tp3;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Programme1 {
    public static void main(String[] args)  {
        try{
            DatagramSocket socket;
            int port;
            port = 2000;

            //Création de la socket
            socket = new DatagramSocket(port);

            //Création du buffer
            byte[] buffer = new byte[1024];
            DatagramPacket paquet = new DatagramPacket(buffer, buffer.length);

            //Attente jusqu'à la réception du paquet par la socket
            socket.receive(paquet);

            //Désérialisation de l'objet reçu
            ObjectInputStream input = new ObjectInputStream(new ByteArrayInputStream(paquet.getData()));
            String message = (String) input.readObject();

            //Affichage
            System.out.println("le message reçu: " + message);
        } catch(Exception e){
            e.printStackTrace();
        }
        }
    }