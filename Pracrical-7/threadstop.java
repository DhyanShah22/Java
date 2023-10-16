class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1)
                Thread.yield(); // Use Thread.yield() for a similar effect
            System.out.println("\t from threadA: i= " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\t from threadB: j= " + j);
            if (j == 3)
                return; // Terminate the thread gracefully
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("\t from threadC: k= " + k);
            if (k == 1) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Exit from C");
    }
}

public class threadstop {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
