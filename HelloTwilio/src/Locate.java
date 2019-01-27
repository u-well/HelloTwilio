import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by kirstenruge on 1/26/19.
 */


public class Locate {
    public static void main(String[] args) throws SocketException {
//        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
//
//        while(interfaces.hasMoreElements()){
//            Enumeration<InetAddress> inetaddresses = interfaces.nextElement().getInetAddresses();
//            while(inetaddresses.hasMoreElements()){
//                System.out.println(inetaddresses.nextElement().);
//            }
//
//
//        }


        URL whatismyip = null;
        try {
            whatismyip = new URL("http://checkip.amazonaws.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    whatismyip.openStream()));

            String ip = in.readLine(); //you get the IP as a String
            System.out.println(ip);
          //  URL latUrl = "https://api.ipdata.co/" + ip + "/latitude?api-key=f8c9fe6ed6afe1e431c18e26af93116e87caca131cf5f8289ca85a93";

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
