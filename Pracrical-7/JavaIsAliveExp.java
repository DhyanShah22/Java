public class JavaIsAliveExp extends Thread {
    public void run() {
        try {
            Thread.sleep(300);
            System.out.println("isAlive in run() method: " + Thread.currentThread().isAlive());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JavaIsAliveExp t1 = new JavaIsAliveExp();
        System.out.println("Before starting thread, isAlive: " + t1.isAlive());
        t1.start();
        System.out.println("After starting thread, isAlive: " + t1.isAlive());
    }
}
