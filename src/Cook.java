public class Cook implements Runnable{
    @Override
    public void run() {
        for ( int i = 1; i <=4; i++) {
            IO.println("Cooking soup");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                IO.println("Canceled job");
            }
        }
    }
}
