package Homework;


import java.io.PrintWriter;
import java.net.*;
import java.util.Date;


public class day24homeworkServer {
    public static void main(String[] args) {
        System.out.println("18장 도전 과제 서버");

        try (
                ServerSocket serverSocket = new ServerSocket(9000);
                Socket clientSocket = serverSocket.accept();
                PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
                ) {
                String date = new Date().toString();
                pw.println("서버 > " + date);
                } catch (Exception e){    }

            }

    }

