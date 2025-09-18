public static void main(String[] args) {
    IO.println("Restaurant is open, activity...");
    Thread baker = new Thread(new Baker());
    baker.setDaemon(true);
    Thread cook = new Thread(new Cook());
    Thread server = new Thread(new Server());


    baker.start();
    cook.start();
    server.start();

}