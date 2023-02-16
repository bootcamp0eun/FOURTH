package Homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class day24homeworkClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("클라이언트 > 날짜 서버의 IP 주소는? ");
        String ip = sc.nextLine();
        try (
                Socket clientSocket = new Socket(ip, 9000);
                BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                ) {
            System.out.println(br.readLine());
        } catch (Exception e) {   }

    }
}
