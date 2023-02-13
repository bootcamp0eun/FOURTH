import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleEchoServer {
    public static void main(String[] args) {
        System.out.println("에코 서버");

        try (ServerSocket serverSocket = new ServerSocket(6000)) {
            System.out.println("클라이언트 접속 대기중....");
            Socket clientSocket = serverSocket.accept();  // 접속 대기
            System.out.println("클라이언트 접속됨.");
            //BufferdReader br = null;
            //PrintWriter pw = null;
            try (
                    BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true)
            ) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println("클라이언트로부터 받은 메세지 : " + line);
                    pw.println(line);  // 클라이언트로 송신
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } // finally {
                //
                //
        // }

        } catch (IOException ex) {
            System.out.println("접속 실패!");
        }
    }
}