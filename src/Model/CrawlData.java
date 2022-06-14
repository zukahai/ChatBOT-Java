package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
 
public class CrawlData {
    public static void main(String[] args) {
        try {
            // get URL content
            
        	URL url = new URL("https://www.24h.com.vn/du-bao-thoi-tiet-c568.html");
            URLConnection con = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String l;
            while ((l=in.readLine())!=null) {
                System.out.println(l);
            }
 
            System.out.println("Done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}