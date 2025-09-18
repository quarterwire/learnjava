public class Server implements Runnable{
    @Override
    public void run() {
        for ( int i = 1; i <=5; i++) {
            IO.println("Serving customer");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                IO.println("Canceled job");
            }
        }
    }
}
