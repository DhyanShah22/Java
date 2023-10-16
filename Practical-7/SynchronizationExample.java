class SharedResource {
    private int counter = 0;

    public void increment() {
        synchronized (this) { // Synchronize on the shared resource (this)
            for (int i = 0; i < 5; i++) {
                counter++;
                System.out.println("Increment: " + counter);
            }
        }
    }
}

class IncrementThread extends Thread {
    private SharedResource resource;

    public IncrementThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.increment();
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        IncrementThread thread1 = new IncrementThread(resource);
        IncrementThread thread2 = new IncrementThread(resource);

        thread1.start();
        thread2.start();
    }
}
