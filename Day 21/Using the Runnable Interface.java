class Work implements Runnable {
    public void run() {
        System.out.println("thread 1 is running");
    }

    public void run(int a) {
        System.out.println("run 1");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("main thread is doing");
        Work w = new Work();
        Thread t = new Thread(w);
        
        t.start();
        t.run(5); // Explicit call to overloaded method
System.out.println("main thread is doing");
System.out.println("main thread is doing");
System.out.println("main thread is doing");
System.out.println("main thread is doing");
System.out.println("main thread is doing");
        }
    }
}
