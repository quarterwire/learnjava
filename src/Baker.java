public class Baker implements Runnable{
    @Override
    public void run() {
        for ( int i = 1; i <=3; i++) {
            IO.println("Baking bread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                IO.println("Canceled job");
            }
        }
    }
}
