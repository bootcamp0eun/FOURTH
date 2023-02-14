package Homework;

class Worker extends Thread{
    public void run(){
        long start = System.currentTimeMillis();
        long now = System.currentTimeMillis();
        int i = 0;
        while(now-start < 5000){
            System.out.println("작업 스레드 : " + i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            now = System.currentTimeMillis();
        }  // for
    }
}

public class homework01 {
    public static void main(String[] args) {
        int alphabet = 'a';
        Thread work = new Thread(new Worker());
        work.start();
        while (work.getState() != Thread.State.TERMINATED){
            char ch = (char) alphabet;
            System.out.println("메인 스레드 : " + ch);
            alphabet = alphabet + 1;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
