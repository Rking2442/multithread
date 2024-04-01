public class MyThread extends Thread{
    int i;
    @Override
    public void run() {
        for(i = 10; i > 0; i--) {
            System.out.println("Thread @1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            System.out.println("Thread @1 Is Finished");
        if (i == 0) {
            System.out.println("Happy Year");
        }




}

}
