package A1018.Thread;

public class Thread1 {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.start(); // start()로 쓰레드를 실행한다.
    }
}

class Sample extends Thread {
    public void run() { // Thread를 상속하면 run 메서드를 구현해야 한다.
        System.out.println("thread run.");
    }
}