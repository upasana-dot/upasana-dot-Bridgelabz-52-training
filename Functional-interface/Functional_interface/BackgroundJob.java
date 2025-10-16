public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Running job step " + i);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
            System.out.println("Job completed!");
        };

        Thread thread = new Thread(job);
        thread.start();
    }
}

