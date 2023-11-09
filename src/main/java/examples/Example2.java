package examples;

public class Example2 {

    private void emptySynchronized() {
        synchronized (this) {
            // Forgot implementation
        }
    }

    private void sleepInSynchronized() throws InterruptedException {
        synchronized (this) {
            wait(5000);
        }
    }
}