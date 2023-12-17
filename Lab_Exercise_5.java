class NumberPrinter extends Thread {
    private int start;

    public NumberPrinter(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i <= start + 4; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

            // Introducing a delay to simulate some work
            System.out.println(Thread.currentThread().getName() + ": Sleeping for 4000 milliseconds");
            try {
                Thread.sleep(4000); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Lab_Exercise_5 {
    public static void main(String[] args) {
        NumberPrinter thread1 = new NumberPrinter(1);

        thread1.start();

    }
}
