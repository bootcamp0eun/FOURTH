import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class day21{
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getByName("www.inha.ac.kr"); // 존재하지 않는 url일 경우 예외
            //InetAddress addr = InetAddress.getByName("www.kiminha.ac.kr");
            System.out.println(addr);
            System.out.println(addr.getCanonicalHostName());
            System.out.println(addr.getHostAddress());
            System.out.println(addr.getHostName());
        } catch (UnknownHostException e) {
            //throw new RuntimeException(e);
            System.out.println("해당 URL은 존재하지 않습니다.");
        }

        try {
            URL url = new
                    URL("http://www.inha.ac.kr");
            URLConnection urlConnection = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            // ***문을 열었으면***
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close(); // ***문을 닫자***
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException ex) {
            System.out.println("입출력 오류 T.T");
        }

    }
}