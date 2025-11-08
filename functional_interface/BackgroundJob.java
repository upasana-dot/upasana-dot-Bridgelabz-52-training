public class BackgroundJob{
    public static void main(String[] args) {
        Runnable job1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Job 1 - Count: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable job2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Job 2 - Count: " + i);
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread(job1);
        Thread thread2 = new Thread(job2);

        thread1.start();
        thread2.start();
    }
}